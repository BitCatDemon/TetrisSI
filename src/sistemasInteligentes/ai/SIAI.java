/*
 * Nintendo Tetris AI
 * Copyright (C) 2014 meatfighter.com
 *
 * This file is part of Nintendo Tetris AI. 
 *
 * Nintendo Tetris AI is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Nintendo Tetris AI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package sistemasInteligentes.ai;

import java.util.ArrayList;

import sistemasInteligentes.PlayfieldEvaluationConstants;
import tetris.ai.AI;
import tetris.ai.IChildFilter;
import tetris.ai.ISearchListener;
import tetris.ai.Orientation;
import tetris.ai.Searcher;
import tetris.ai.State;
import tetris.ai.Tetriminos;

public class SIAI {

	public static final int PLAYFIELD_WIDTH = 10;
	public static final int PLAYFIELD_HEIGHT = 20;
	public static final int TETRIMINOS_SEARCHED = 3;

	public double[] genes;

	private Searcher[] searchers;
	private int[] tetriminoIndices;
	public PlayfieldUtil playfieldUtil = new PlayfieldUtil();
	private PlayfieldEvaluationConstants e = new PlayfieldEvaluationConstants();
	private int totalDropHeight;
	private double bestFitness;
	private State bestResult;
	private State result0;
	private int cleared = 0;

	private ISearchListener searchListener = new ISearchListener() {
		@Override
		public void handleResult(int[][] playfield, int tetriminoType, int id,
				State state) {

			if (id == 0) {
				result0 = state;
			}

			Orientation orientation = Tetriminos.ORIENTATIONS[tetriminoType][state.rotation];
			int rows = playfieldUtil.clearRows(playfield, state.y);
			int originalTotalDropHeight = totalDropHeight;
			totalDropHeight += orientation.maxY - state.y;

			int nextID = id + 1;

			if (nextID == tetriminoIndices.length) {

				playfieldUtil.evaluatePlayfield(playfield, e);

				double fitness = computeFitness();
				if (fitness < bestFitness) {
					bestFitness = fitness;
					bestResult = result0;
					cleared = rows;

				}
			} else {
				searchers[nextID].search(playfield, tetriminoIndices[nextID],
						nextID);
			}

			totalDropHeight = originalTotalDropHeight;
			playfieldUtil.restoreRows(playfield, rows);
		}
	};

	public SIAI() {
		this(null);
	}

	public SIAI(IChildFilter positionValidator) {
		searchers = new Searcher[AI.TETRIMINOS_SEARCHED];
		for (int i = 0; i < AI.TETRIMINOS_SEARCHED; i++) {
			searchers[i] = new Searcher(searchListener, positionValidator);
		}
	}

	private double computeFitness() {
		return cleared * genes[Gene.CLEARS] + e.height
				* genes[Gene.HEIGHT] + e.holes * genes[Gene.HOLES] + e.partners
				+ e.blockades * genes[Gene.BLOCKADES] * genes[Gene.PARTNER]
				+ e.walls * genes[Gene.WALLS] + e.floor * genes[Gene.FLOOR];
	}

	public State search(int[][] playfield, int[] tetriminoIndices) {
		this.tetriminoIndices = tetriminoIndices;
		bestResult = null;
		bestFitness = Double.MAX_VALUE;
		searchers[0].search(playfield, tetriminoIndices[0], 0);
		if (cleared != 0) {
			cleared = 0;
		}
		return bestResult;
	}


	public State[] buildStatesList(State state) {
		State s = state;
		int count = 0;
		while (s != null) {
			count++;
			s = s.predecessor;
		}
		State[] states = new State[count];
		while (state != null) {
			states[--count] = state;
			state = state.predecessor;
		}
		return states;
	}

	public void setGenes(double[] genes) {
		this.genes = genes;
	}
}
