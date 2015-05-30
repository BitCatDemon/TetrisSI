/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasInteligentes;

import java.awt.Color;

import javax.swing.JPanel;

import tetris.ai.Tetriminos;

/**
 * 
 * @author microraptor
 */
public class DebuggerTetris extends javax.swing.JFrame {
	// Variables declaration - do not modify
	private javax.swing.JTextArea AreaTexto;
	private javax.swing.JButton B_Play;
	private javax.swing.JButton B_Step;
	private javax.swing.JButton B_Stop;
	private javax.swing.JPanel celda_0_0;
	private javax.swing.JPanel celda_0_1;
	private javax.swing.JPanel celda_0_10;
	private javax.swing.JPanel celda_0_11;
	private javax.swing.JPanel celda_0_12;
	private javax.swing.JPanel celda_0_13;
	private javax.swing.JPanel celda_0_14;
	private javax.swing.JPanel celda_0_15;
	private javax.swing.JPanel celda_0_16;
	private javax.swing.JPanel celda_0_17;
	private javax.swing.JPanel celda_0_18;
	private javax.swing.JPanel celda_0_19;
	private javax.swing.JPanel celda_0_2;
	private javax.swing.JPanel celda_0_3;
	private javax.swing.JPanel celda_0_4;
	private javax.swing.JPanel celda_0_5;
	private javax.swing.JPanel celda_0_6;
	private javax.swing.JPanel celda_0_7;
	private javax.swing.JPanel celda_0_8;
	private javax.swing.JPanel celda_0_9;
	private javax.swing.JPanel celda_0_m1;
	private javax.swing.JPanel celda_0_m2;
	private javax.swing.JPanel celda_1_0;
	private javax.swing.JPanel celda_1_1;
	private javax.swing.JPanel celda_1_10;
	private javax.swing.JPanel celda_1_11;
	private javax.swing.JPanel celda_1_12;
	private javax.swing.JPanel celda_1_13;
	private javax.swing.JPanel celda_1_14;
	private javax.swing.JPanel celda_1_15;
	private javax.swing.JPanel celda_1_16;
	private javax.swing.JPanel celda_1_17;
	private javax.swing.JPanel celda_1_18;
	private javax.swing.JPanel celda_1_19;
	private javax.swing.JPanel celda_1_2;
	private javax.swing.JPanel celda_1_3;
	private javax.swing.JPanel celda_1_4;
	private javax.swing.JPanel celda_1_5;
	private javax.swing.JPanel celda_1_6;
	private javax.swing.JPanel celda_1_7;
	private javax.swing.JPanel celda_1_8;
	private javax.swing.JPanel celda_1_9;
	private javax.swing.JPanel celda_1_m1;
	private javax.swing.JPanel celda_1_m2;
	private javax.swing.JPanel celda_2_0;
	private javax.swing.JPanel celda_2_1;
	private javax.swing.JPanel celda_2_10;
	private javax.swing.JPanel celda_2_11;
	private javax.swing.JPanel celda_2_12;
	private javax.swing.JPanel celda_2_13;
	private javax.swing.JPanel celda_2_14;
	private javax.swing.JPanel celda_2_15;
	private javax.swing.JPanel celda_2_16;
	private javax.swing.JPanel celda_2_17;
	private javax.swing.JPanel celda_2_18;
	private javax.swing.JPanel celda_2_19;
	private javax.swing.JPanel celda_2_2;
	private javax.swing.JPanel celda_2_3;
	private javax.swing.JPanel celda_2_4;
	private javax.swing.JPanel celda_2_5;
	private javax.swing.JPanel celda_2_6;
	private javax.swing.JPanel celda_2_7;
	private javax.swing.JPanel celda_2_8;
	private javax.swing.JPanel celda_2_9;
	private javax.swing.JPanel celda_2_m1;
	private javax.swing.JPanel celda_2_m2;
	private javax.swing.JPanel celda_3_0;
	private javax.swing.JPanel celda_3_1;
	private javax.swing.JPanel celda_3_10;
	private javax.swing.JPanel celda_3_11;
	private javax.swing.JPanel celda_3_12;
	private javax.swing.JPanel celda_3_13;
	private javax.swing.JPanel celda_3_14;
	private javax.swing.JPanel celda_3_15;
	private javax.swing.JPanel celda_3_16;
	private javax.swing.JPanel celda_3_17;
	private javax.swing.JPanel celda_3_18;
	private javax.swing.JPanel celda_3_19;
	private javax.swing.JPanel celda_3_2;
	private javax.swing.JPanel celda_3_3;
	private javax.swing.JPanel celda_3_4;
	private javax.swing.JPanel celda_3_5;
	private javax.swing.JPanel celda_3_6;
	private javax.swing.JPanel celda_3_7;
	private javax.swing.JPanel celda_3_8;
	private javax.swing.JPanel celda_3_9;
	private javax.swing.JPanel celda_3_m1;
	private javax.swing.JPanel celda_3_m2;
	private javax.swing.JPanel celda_4_0;
	private javax.swing.JPanel celda_4_1;
	private javax.swing.JPanel celda_4_10;
	private javax.swing.JPanel celda_4_11;
	private javax.swing.JPanel celda_4_12;
	private javax.swing.JPanel celda_4_13;
	private javax.swing.JPanel celda_4_14;
	private javax.swing.JPanel celda_4_15;
	private javax.swing.JPanel celda_4_16;
	private javax.swing.JPanel celda_4_17;
	private javax.swing.JPanel celda_4_18;
	private javax.swing.JPanel celda_4_19;
	private javax.swing.JPanel celda_4_2;
	private javax.swing.JPanel celda_4_3;
	private javax.swing.JPanel celda_4_4;
	private javax.swing.JPanel celda_4_5;
	private javax.swing.JPanel celda_4_6;
	private javax.swing.JPanel celda_4_7;
	private javax.swing.JPanel celda_4_8;
	private javax.swing.JPanel celda_4_9;
	private javax.swing.JPanel celda_4_m1;
	private javax.swing.JPanel celda_4_m2;
	private javax.swing.JPanel celda_5_0;
	private javax.swing.JPanel celda_5_1;
	private javax.swing.JPanel celda_5_10;
	private javax.swing.JPanel celda_5_11;
	private javax.swing.JPanel celda_5_12;
	private javax.swing.JPanel celda_5_13;
	private javax.swing.JPanel celda_5_14;
	private javax.swing.JPanel celda_5_15;
	private javax.swing.JPanel celda_5_16;
	private javax.swing.JPanel celda_5_17;
	private javax.swing.JPanel celda_5_18;
	private javax.swing.JPanel celda_5_19;
	private javax.swing.JPanel celda_5_2;
	private javax.swing.JPanel celda_5_3;
	private javax.swing.JPanel celda_5_4;
	private javax.swing.JPanel celda_5_5;
	private javax.swing.JPanel celda_5_6;
	private javax.swing.JPanel celda_5_7;
	private javax.swing.JPanel celda_5_8;
	private javax.swing.JPanel celda_5_9;
	private javax.swing.JPanel celda_5_m1;
	private javax.swing.JPanel celda_5_m2;
	private javax.swing.JPanel celda_6_0;
	private javax.swing.JPanel celda_6_1;
	private javax.swing.JPanel celda_6_10;
	private javax.swing.JPanel celda_6_11;
	private javax.swing.JPanel celda_6_12;
	private javax.swing.JPanel celda_6_13;
	private javax.swing.JPanel celda_6_14;
	private javax.swing.JPanel celda_6_15;
	private javax.swing.JPanel celda_6_16;
	private javax.swing.JPanel celda_6_17;
	private javax.swing.JPanel celda_6_18;
	private javax.swing.JPanel celda_6_19;
	private javax.swing.JPanel celda_6_2;
	private javax.swing.JPanel celda_6_3;
	private javax.swing.JPanel celda_6_4;
	private javax.swing.JPanel celda_6_5;
	private javax.swing.JPanel celda_6_6;
	private javax.swing.JPanel celda_6_7;
	private javax.swing.JPanel celda_6_8;
	private javax.swing.JPanel celda_6_9;
	private javax.swing.JPanel celda_6_m1;
	private javax.swing.JPanel celda_6_m2;
	private javax.swing.JPanel celda_7_0;
	private javax.swing.JPanel celda_7_1;
	private javax.swing.JPanel celda_7_10;
	private javax.swing.JPanel celda_7_11;
	private javax.swing.JPanel celda_7_12;
	private javax.swing.JPanel celda_7_13;
	private javax.swing.JPanel celda_7_14;
	private javax.swing.JPanel celda_7_15;
	private javax.swing.JPanel celda_7_16;
	private javax.swing.JPanel celda_7_17;
	private javax.swing.JPanel celda_7_18;
	private javax.swing.JPanel celda_7_19;
	private javax.swing.JPanel celda_7_2;
	private javax.swing.JPanel celda_7_3;
	private javax.swing.JPanel celda_7_4;
	private javax.swing.JPanel celda_7_5;
	private javax.swing.JPanel celda_7_6;
	private javax.swing.JPanel celda_7_7;
	private javax.swing.JPanel celda_7_8;
	private javax.swing.JPanel celda_7_9;
	private javax.swing.JPanel celda_7_m1;
	private javax.swing.JPanel celda_7_m2;
	private javax.swing.JPanel celda_8_0;
	private javax.swing.JPanel celda_8_1;
	private javax.swing.JPanel celda_8_10;
	private javax.swing.JPanel celda_8_11;
	private javax.swing.JPanel celda_8_12;
	private javax.swing.JPanel celda_8_13;
	private javax.swing.JPanel celda_8_14;
	private javax.swing.JPanel celda_8_15;
	private javax.swing.JPanel celda_8_16;
	private javax.swing.JPanel celda_8_17;
	private javax.swing.JPanel celda_8_18;
	private javax.swing.JPanel celda_8_19;
	private javax.swing.JPanel celda_8_2;
	private javax.swing.JPanel celda_8_3;
	private javax.swing.JPanel celda_8_4;
	private javax.swing.JPanel celda_8_5;
	private javax.swing.JPanel celda_8_6;
	private javax.swing.JPanel celda_8_7;
	private javax.swing.JPanel celda_8_8;
	private javax.swing.JPanel celda_8_9;
	private javax.swing.JPanel celda_8_m1;
	private javax.swing.JPanel celda_8_m2;
	private javax.swing.JPanel celda_9_0;
	private javax.swing.JPanel celda_9_1;
	private javax.swing.JPanel celda_9_10;
	private javax.swing.JPanel celda_9_11;
	private javax.swing.JPanel celda_9_12;
	private javax.swing.JPanel celda_9_13;
	private javax.swing.JPanel celda_9_14;
	private javax.swing.JPanel celda_9_15;
	private javax.swing.JPanel celda_9_16;
	private javax.swing.JPanel celda_9_17;
	private javax.swing.JPanel celda_9_18;
	private javax.swing.JPanel celda_9_19;
	private javax.swing.JPanel celda_9_2;
	private javax.swing.JPanel celda_9_3;
	private javax.swing.JPanel celda_9_4;
	private javax.swing.JPanel celda_9_5;
	private javax.swing.JPanel celda_9_6;
	private javax.swing.JPanel celda_9_7;
	private javax.swing.JPanel celda_9_8;
	private javax.swing.JPanel celda_9_9;
	private javax.swing.JPanel celda_9_m1;
	private javax.swing.JPanel celda_9_m2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;

	Color color_T = new Color(255, 0, 0);
	Color color_J = new Color(255, 219, 0);
	Color color_Z = new Color(73, 255, 0);
	Color color_O = new Color(0, 255, 146);
	Color color_S = new Color(0, 146, 255);
	Color color_L = new Color(73, 0, 255);
	Color color_I = new Color(255, 0, 219);
	Color color_null = new Color(0, 10, 40);

	String texto = "-------Debugger Tetris-------\n"
	// + "00 -> T - 01 -> J\n"
	// + "02 -> Z - 03 -> O\n"
	// + "04 -> S - 05 -> L\n"
	// + "06 -> I\n"
			+ "----------------------------\n";

	TetrisSI tetrisSi;
	JPanel[][] tetrisGrid;

	/**
	 * Creates new form DebuggerTetris
	 */
	public DebuggerTetris(TetrisSI tetrisSI) {
		this.tetrisSi = tetrisSI;
		initComponents();
		tetrisGrid = new JPanel[10][22];
		JPanel[][] tetrisGrid2 = {
				{ celda_0_m2, celda_1_m2, celda_2_m2, celda_3_m2, celda_4_m2,
						celda_5_m2, celda_6_m2, celda_7_m2, celda_8_m2,
						celda_9_m2 },
				{ celda_0_m1, celda_1_m1, celda_2_m1, celda_3_m1, celda_4_m1,
						celda_5_m1, celda_6_m1, celda_7_m1, celda_8_m1,
						celda_9_m1 },
				{ celda_0_0, celda_1_0, celda_2_0, celda_3_0, celda_4_0,
						celda_5_0, celda_6_0, celda_7_0, celda_8_0, celda_9_0 },
				{ celda_0_1, celda_1_1, celda_2_1, celda_3_1, celda_4_1,
						celda_5_1, celda_6_1, celda_7_1, celda_8_1, celda_9_1 },
				{ celda_0_2, celda_1_2, celda_2_2, celda_3_m1, celda_4_2,
						celda_5_2, celda_6_2, celda_7_2, celda_8_m1, celda_9_2 },
				{ celda_0_3, celda_1_3, celda_2_3, celda_3_3, celda_4_3,
						celda_5_3, celda_6_3, celda_7_3, celda_8_3, celda_9_3 },
				{ celda_0_4, celda_1_4, celda_2_4, celda_3_4, celda_4_4,
						celda_5_4, celda_6_4, celda_7_4, celda_8_4, celda_9_4 },
				{ celda_0_5, celda_1_5, celda_2_5, celda_3_5, celda_4_5,
						celda_5_m1, celda_6_5, celda_7_5, celda_8_5, celda_9_5 },
				{ celda_0_6, celda_1_6, celda_2_6, celda_3_6, celda_4_6,
						celda_5_6, celda_6_6, celda_7_6, celda_8_6, celda_9_6 },
				{ celda_0_7, celda_1_7, celda_2_7, celda_3_7, celda_4_7,
						celda_5_7, celda_6_7, celda_7_7, celda_8_7, celda_9_7 },
				{ celda_0_8, celda_1_8, celda_2_8, celda_3_8, celda_4_8,
						celda_5_8, celda_6_8, celda_7_8, celda_8_8, celda_9_8 },
				{ celda_0_9, celda_1_9, celda_2_9, celda_3_9, celda_4_9,
						celda_5_9, celda_6_9, celda_7_9, celda_8_9, celda_9_9 },
				{ celda_0_10, celda_1_10, celda_2_10, celda_3_10, celda_4_10,
						celda_5_10, celda_6_10, celda_7_10, celda_8_10,
						celda_9_10 },
				{ celda_0_11, celda_1_11, celda_2_11, celda_3_11, celda_4_11,
						celda_5_11, celda_6_11, celda_7_11, celda_8_11,
						celda_9_11 },
				{ celda_0_12, celda_1_12, celda_2_12, celda_3_12, celda_4_12,
						celda_5_12, celda_6_12, celda_7_12, celda_8_12,
						celda_9_12 },
				{ celda_0_13, celda_1_13, celda_2_13, celda_3_13, celda_4_13,
						celda_5_13, celda_6_13, celda_7_13, celda_8_13,
						celda_9_13 },
				{ celda_0_14, celda_1_14, celda_2_14, celda_3_14, celda_4_14,
						celda_5_14, celda_6_14, celda_7_14, celda_8_14,
						celda_9_14 },
				{ celda_0_15, celda_1_15, celda_2_15, celda_3_15, celda_4_15,
						celda_5_15, celda_6_15, celda_7_15, celda_8_15,
						celda_9_15 },
				{ celda_0_16, celda_1_16, celda_2_16, celda_3_16, celda_4_16,
						celda_5_16, celda_6_16, celda_7_16, celda_8_16,
						celda_9_16 },
				{ celda_0_17, celda_1_17, celda_2_17, celda_3_17, celda_4_17,
						celda_5_17, celda_6_17, celda_7_17, celda_8_17,
						celda_9_17 },
				{ celda_0_18, celda_1_18, celda_2_18, celda_3_18, celda_4_18,
						celda_5_18, celda_6_18, celda_7_18, celda_8_18,
						celda_9_18 },
				{ celda_0_19, celda_1_19, celda_2_19, celda_3_19, celda_4_19,
						celda_5_19, celda_6_19, celda_7_19, celda_8_19,
						celda_9_19 } };
		tetrisGrid = tetrisGrid2;
	}

	public void printPlayField(int[][] playfield) {
		for (int i = 0; i < 20; i++) {
			System.out.print(i + ": ");
			for (int j = 0; j < 10; j++) {
				System.out.print(playfield[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void printPlayfieldAreaTexto(int[][] playfield) {
		for (int i = 0; i < 20; i++) {
			texto += i + ": ";
			for (int j = 0; j < 10; j++) {
				texto += playfield[i][j] + " ";
			}
			texto += "\n";
		}
		addAreaTexto(texto);
	}

	public void printTetriminos(int[] vec) {
		String s = "";
		for (int i = 0; i < vec.length; i++) {
			switch (vec[i]) {
			case 0:
				s += "T, ";
				break;
			case 1:
				s += "J, ";
				break;
			case 2:
				s += "Z, ";
				break;
			case 3:
				s += "O, ";
				break;
			case 4:
				s += "S, ";
				break;
			case 5:
				s += "L, ";
				break;
			case 6:
				s += "I, ";
				break;
			}
		}
		addAreaTexto(s + "\n");
	}

	public void addAreaTexto(String text) {
		texto += text;
		AreaTexto.setText(texto);
	}

	public void updateTetrisGrid(int[][] playfield) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				int tetrimino = playfield[i][j];
				switch (tetrimino) {
				case 0:
					tetrisGrid[i + 2][j].setBackground(color_T);
					tetrisGrid[i + 2][j].repaint();
					break;
				case 1:
					tetrisGrid[i + 2][j].setBackground(color_J);
					tetrisGrid[i + 2][j].repaint();
					break;
				case 2:
					tetrisGrid[i + 2][j].setBackground(color_Z);
					tetrisGrid[i + 2][j].repaint();
					break;
				case 3:
					tetrisGrid[i + 2][j].setBackground(color_O);
					tetrisGrid[i + 2][j].repaint();
					break;
				case 4:
					tetrisGrid[i + 2][j].setBackground(color_S);
					tetrisGrid[i + 2][j].repaint();
					break;
				case 5:
					tetrisGrid[i + 2][j].setBackground(color_L);
					tetrisGrid[i + 2][j].repaint();
					break;
				case 6:
					tetrisGrid[i + 2][j].setBackground(color_I);
					tetrisGrid[i + 2][j].repaint();
					break;
				case -1:
					tetrisGrid[i + 2][j].setBackground(color_null);
					tetrisGrid[i + 2][j].repaint();
					break;
				}
			}
		}
	}

	/**
	 * ------------------------------------------------------------------------
	 * ------------------------ Codigo para el boton Play
	 * 
	 * @param evt
	 */
	private void B_PlayActionPerformed(java.awt.event.ActionEvent evt) {
		tetrisSi.b_play();
	}

	/**
	 * ------------------------------------------------------------------------
	 * ------------------------ Codigo para el boton Step
	 * 
	 * @param evt
	 */
	private void B_StepActionPerformed(java.awt.event.ActionEvent evt) {
//		addAreaTexto("Step: " + tetrisSi.step() + "\n");
		tetrisSi.b_step();
	}

	/**
	 * ------------------------------------------------------------------------
	 * ------------------------ Codigo para el boton Stop
	 * 
	 * @param evt
	 */
	private void B_StopActionPerformed(java.awt.event.ActionEvent evt) {
		tetrisSi.stopGame();
	}

	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		B_Play = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		B_Step = new javax.swing.JButton();
		B_Stop = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		AreaTexto = new javax.swing.JTextArea();
		celda_0_m1 = new javax.swing.JPanel();
		celda_1_m1 = new javax.swing.JPanel();
		celda_2_m1 = new javax.swing.JPanel();
		celda_3_m1 = new javax.swing.JPanel();
		celda_4_m1 = new javax.swing.JPanel();
		celda_9_m1 = new javax.swing.JPanel();
		celda_8_m1 = new javax.swing.JPanel();
		celda_7_m1 = new javax.swing.JPanel();
		celda_6_m1 = new javax.swing.JPanel();
		celda_5_m1 = new javax.swing.JPanel();
		celda_0_m2 = new javax.swing.JPanel();
		celda_9_m2 = new javax.swing.JPanel();
		celda_8_m2 = new javax.swing.JPanel();
		celda_7_m2 = new javax.swing.JPanel();
		celda_6_m2 = new javax.swing.JPanel();
		celda_5_m2 = new javax.swing.JPanel();
		celda_4_m2 = new javax.swing.JPanel();
		celda_3_m2 = new javax.swing.JPanel();
		celda_2_m2 = new javax.swing.JPanel();
		celda_1_m2 = new javax.swing.JPanel();
		celda_1_0 = new javax.swing.JPanel();
		celda_2_0 = new javax.swing.JPanel();
		celda_3_0 = new javax.swing.JPanel();
		celda_4_0 = new javax.swing.JPanel();
		celda_9_0 = new javax.swing.JPanel();
		celda_8_0 = new javax.swing.JPanel();
		celda_7_0 = new javax.swing.JPanel();
		celda_6_0 = new javax.swing.JPanel();
		celda_5_0 = new javax.swing.JPanel();
		celda_0_0 = new javax.swing.JPanel();
		celda_2_1 = new javax.swing.JPanel();
		celda_3_1 = new javax.swing.JPanel();
		celda_4_1 = new javax.swing.JPanel();
		celda_9_1 = new javax.swing.JPanel();
		celda_8_1 = new javax.swing.JPanel();
		celda_7_1 = new javax.swing.JPanel();
		celda_6_1 = new javax.swing.JPanel();
		celda_5_1 = new javax.swing.JPanel();
		celda_0_1 = new javax.swing.JPanel();
		celda_1_1 = new javax.swing.JPanel();
		celda_2_2 = new javax.swing.JPanel();
		celda_3_2 = new javax.swing.JPanel();
		celda_4_2 = new javax.swing.JPanel();
		celda_9_2 = new javax.swing.JPanel();
		celda_8_2 = new javax.swing.JPanel();
		celda_7_2 = new javax.swing.JPanel();
		celda_6_2 = new javax.swing.JPanel();
		celda_5_2 = new javax.swing.JPanel();
		celda_0_2 = new javax.swing.JPanel();
		celda_1_2 = new javax.swing.JPanel();
		celda_2_3 = new javax.swing.JPanel();
		celda_1_3 = new javax.swing.JPanel();
		celda_5_3 = new javax.swing.JPanel();
		celda_4_3 = new javax.swing.JPanel();
		celda_3_3 = new javax.swing.JPanel();
		celda_8_3 = new javax.swing.JPanel();
		celda_6_3 = new javax.swing.JPanel();
		celda_7_3 = new javax.swing.JPanel();
		celda_0_3 = new javax.swing.JPanel();
		celda_9_3 = new javax.swing.JPanel();
		celda_5_4 = new javax.swing.JPanel();
		celda_8_4 = new javax.swing.JPanel();
		celda_6_4 = new javax.swing.JPanel();
		celda_0_4 = new javax.swing.JPanel();
		celda_3_4 = new javax.swing.JPanel();
		celda_7_4 = new javax.swing.JPanel();
		celda_2_4 = new javax.swing.JPanel();
		celda_4_4 = new javax.swing.JPanel();
		celda_9_4 = new javax.swing.JPanel();
		celda_1_4 = new javax.swing.JPanel();
		celda_5_5 = new javax.swing.JPanel();
		celda_8_5 = new javax.swing.JPanel();
		celda_6_5 = new javax.swing.JPanel();
		celda_0_5 = new javax.swing.JPanel();
		celda_3_5 = new javax.swing.JPanel();
		celda_7_5 = new javax.swing.JPanel();
		celda_2_5 = new javax.swing.JPanel();
		celda_4_5 = new javax.swing.JPanel();
		celda_9_5 = new javax.swing.JPanel();
		celda_1_5 = new javax.swing.JPanel();
		celda_8_6 = new javax.swing.JPanel();
		celda_1_6 = new javax.swing.JPanel();
		celda_6_6 = new javax.swing.JPanel();
		celda_7_6 = new javax.swing.JPanel();
		celda_4_6 = new javax.swing.JPanel();
		celda_5_6 = new javax.swing.JPanel();
		celda_2_6 = new javax.swing.JPanel();
		celda_9_6 = new javax.swing.JPanel();
		celda_0_6 = new javax.swing.JPanel();
		celda_3_6 = new javax.swing.JPanel();
		celda_8_7 = new javax.swing.JPanel();
		celda_0_7 = new javax.swing.JPanel();
		celda_7_7 = new javax.swing.JPanel();
		celda_9_7 = new javax.swing.JPanel();
		celda_2_7 = new javax.swing.JPanel();
		celda_3_7 = new javax.swing.JPanel();
		celda_4_7 = new javax.swing.JPanel();
		celda_5_7 = new javax.swing.JPanel();
		celda_1_7 = new javax.swing.JPanel();
		celda_6_7 = new javax.swing.JPanel();
		celda_7_8 = new javax.swing.JPanel();
		celda_5_8 = new javax.swing.JPanel();
		celda_4_8 = new javax.swing.JPanel();
		celda_3_8 = new javax.swing.JPanel();
		celda_0_8 = new javax.swing.JPanel();
		celda_9_8 = new javax.swing.JPanel();
		celda_2_8 = new javax.swing.JPanel();
		celda_1_8 = new javax.swing.JPanel();
		celda_6_8 = new javax.swing.JPanel();
		celda_8_8 = new javax.swing.JPanel();
		celda_3_9 = new javax.swing.JPanel();
		celda_5_9 = new javax.swing.JPanel();
		celda_8_9 = new javax.swing.JPanel();
		celda_7_9 = new javax.swing.JPanel();
		celda_2_9 = new javax.swing.JPanel();
		celda_0_9 = new javax.swing.JPanel();
		celda_1_9 = new javax.swing.JPanel();
		celda_4_9 = new javax.swing.JPanel();
		celda_9_9 = new javax.swing.JPanel();
		celda_6_9 = new javax.swing.JPanel();
		celda_5_10 = new javax.swing.JPanel();
		celda_7_10 = new javax.swing.JPanel();
		celda_4_10 = new javax.swing.JPanel();
		celda_0_10 = new javax.swing.JPanel();
		celda_9_10 = new javax.swing.JPanel();
		celda_8_10 = new javax.swing.JPanel();
		celda_2_10 = new javax.swing.JPanel();
		celda_6_10 = new javax.swing.JPanel();
		celda_1_10 = new javax.swing.JPanel();
		celda_3_10 = new javax.swing.JPanel();
		celda_5_11 = new javax.swing.JPanel();
		celda_6_11 = new javax.swing.JPanel();
		celda_3_11 = new javax.swing.JPanel();
		celda_4_11 = new javax.swing.JPanel();
		celda_0_11 = new javax.swing.JPanel();
		celda_9_11 = new javax.swing.JPanel();
		celda_8_11 = new javax.swing.JPanel();
		celda_2_11 = new javax.swing.JPanel();
		celda_1_11 = new javax.swing.JPanel();
		celda_7_11 = new javax.swing.JPanel();
		celda_5_12 = new javax.swing.JPanel();
		celda_3_12 = new javax.swing.JPanel();
		celda_9_12 = new javax.swing.JPanel();
		celda_6_12 = new javax.swing.JPanel();
		celda_7_12 = new javax.swing.JPanel();
		celda_0_12 = new javax.swing.JPanel();
		celda_2_12 = new javax.swing.JPanel();
		celda_4_12 = new javax.swing.JPanel();
		celda_1_12 = new javax.swing.JPanel();
		celda_8_12 = new javax.swing.JPanel();
		celda_5_13 = new javax.swing.JPanel();
		celda_6_13 = new javax.swing.JPanel();
		celda_7_13 = new javax.swing.JPanel();
		celda_0_13 = new javax.swing.JPanel();
		celda_3_13 = new javax.swing.JPanel();
		celda_2_13 = new javax.swing.JPanel();
		celda_1_13 = new javax.swing.JPanel();
		celda_4_13 = new javax.swing.JPanel();
		celda_8_13 = new javax.swing.JPanel();
		celda_9_13 = new javax.swing.JPanel();
		celda_6_14 = new javax.swing.JPanel();
		celda_7_14 = new javax.swing.JPanel();
		celda_5_14 = new javax.swing.JPanel();
		celda_0_14 = new javax.swing.JPanel();
		celda_2_14 = new javax.swing.JPanel();
		celda_3_14 = new javax.swing.JPanel();
		celda_1_14 = new javax.swing.JPanel();
		celda_8_14 = new javax.swing.JPanel();
		celda_4_14 = new javax.swing.JPanel();
		celda_9_14 = new javax.swing.JPanel();
		celda_2_15 = new javax.swing.JPanel();
		celda_5_15 = new javax.swing.JPanel();
		celda_9_15 = new javax.swing.JPanel();
		celda_4_15 = new javax.swing.JPanel();
		celda_3_15 = new javax.swing.JPanel();
		celda_8_15 = new javax.swing.JPanel();
		celda_7_15 = new javax.swing.JPanel();
		celda_1_15 = new javax.swing.JPanel();
		celda_6_15 = new javax.swing.JPanel();
		celda_0_15 = new javax.swing.JPanel();
		celda_8_16 = new javax.swing.JPanel();
		celda_7_16 = new javax.swing.JPanel();
		celda_6_16 = new javax.swing.JPanel();
		celda_2_16 = new javax.swing.JPanel();
		celda_9_16 = new javax.swing.JPanel();
		celda_4_16 = new javax.swing.JPanel();
		celda_5_16 = new javax.swing.JPanel();
		celda_1_16 = new javax.swing.JPanel();
		celda_0_16 = new javax.swing.JPanel();
		celda_3_16 = new javax.swing.JPanel();
		celda_8_17 = new javax.swing.JPanel();
		celda_7_17 = new javax.swing.JPanel();
		celda_6_17 = new javax.swing.JPanel();
		celda_2_17 = new javax.swing.JPanel();
		celda_9_17 = new javax.swing.JPanel();
		celda_4_17 = new javax.swing.JPanel();
		celda_5_17 = new javax.swing.JPanel();
		celda_1_17 = new javax.swing.JPanel();
		celda_0_17 = new javax.swing.JPanel();
		celda_3_17 = new javax.swing.JPanel();
		celda_8_18 = new javax.swing.JPanel();
		celda_7_18 = new javax.swing.JPanel();
		celda_6_18 = new javax.swing.JPanel();
		celda_2_18 = new javax.swing.JPanel();
		celda_9_18 = new javax.swing.JPanel();
		celda_4_18 = new javax.swing.JPanel();
		celda_5_18 = new javax.swing.JPanel();
		celda_1_18 = new javax.swing.JPanel();
		celda_0_18 = new javax.swing.JPanel();
		celda_3_18 = new javax.swing.JPanel();
		celda_1_19 = new javax.swing.JPanel();
		celda_8_19 = new javax.swing.JPanel();
		celda_9_19 = new javax.swing.JPanel();
		celda_4_19 = new javax.swing.JPanel();
		celda_5_19 = new javax.swing.JPanel();
		celda_0_19 = new javax.swing.JPanel();
		celda_3_19 = new javax.swing.JPanel();
		celda_2_19 = new javax.swing.JPanel();
		celda_7_19 = new javax.swing.JPanel();
		celda_6_19 = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		B_Play.setText("Play");
		B_Play.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				B_PlayActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(B_Play,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(B_Play));

		B_Play.getAccessibleContext().setAccessibleName("B_Play");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0,
				Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 456,
				Short.MAX_VALUE));

		B_Step.setText("Step");
		B_Step.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				B_StepActionPerformed(evt);
			}
		});

		B_Stop.setText("Stop");
		B_Stop.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				B_StopActionPerformed(evt);
			}
		});

		AreaTexto.setColumns(20);
		AreaTexto.setRows(5);
		jScrollPane1.setViewportView(AreaTexto);

		celda_0_m1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_m1Layout = new javax.swing.GroupLayout(
				celda_0_m1);
		celda_0_m1.setLayout(celda_0_m1Layout);
		celda_0_m1Layout.setHorizontalGroup(celda_0_m1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_m1Layout.setVerticalGroup(celda_0_m1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_m1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_m1Layout = new javax.swing.GroupLayout(
				celda_1_m1);
		celda_1_m1.setLayout(celda_1_m1Layout);
		celda_1_m1Layout.setHorizontalGroup(celda_1_m1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_m1Layout.setVerticalGroup(celda_1_m1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_m1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_m1Layout = new javax.swing.GroupLayout(
				celda_2_m1);
		celda_2_m1.setLayout(celda_2_m1Layout);
		celda_2_m1Layout.setHorizontalGroup(celda_2_m1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_m1Layout.setVerticalGroup(celda_2_m1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_m1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_m1Layout = new javax.swing.GroupLayout(
				celda_3_m1);
		celda_3_m1.setLayout(celda_3_m1Layout);
		celda_3_m1Layout.setHorizontalGroup(celda_3_m1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_m1Layout.setVerticalGroup(celda_3_m1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_m1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_m1Layout = new javax.swing.GroupLayout(
				celda_4_m1);
		celda_4_m1.setLayout(celda_4_m1Layout);
		celda_4_m1Layout.setHorizontalGroup(celda_4_m1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_m1Layout.setVerticalGroup(celda_4_m1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_m1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_m1Layout = new javax.swing.GroupLayout(
				celda_9_m1);
		celda_9_m1.setLayout(celda_9_m1Layout);
		celda_9_m1Layout.setHorizontalGroup(celda_9_m1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_m1Layout.setVerticalGroup(celda_9_m1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_m1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_m1Layout = new javax.swing.GroupLayout(
				celda_8_m1);
		celda_8_m1.setLayout(celda_8_m1Layout);
		celda_8_m1Layout.setHorizontalGroup(celda_8_m1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_m1Layout.setVerticalGroup(celda_8_m1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_m1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_m1Layout = new javax.swing.GroupLayout(
				celda_7_m1);
		celda_7_m1.setLayout(celda_7_m1Layout);
		celda_7_m1Layout.setHorizontalGroup(celda_7_m1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_m1Layout.setVerticalGroup(celda_7_m1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_m1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_m1Layout = new javax.swing.GroupLayout(
				celda_6_m1);
		celda_6_m1.setLayout(celda_6_m1Layout);
		celda_6_m1Layout.setHorizontalGroup(celda_6_m1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_m1Layout.setVerticalGroup(celda_6_m1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_m1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_m1Layout = new javax.swing.GroupLayout(
				celda_5_m1);
		celda_5_m1.setLayout(celda_5_m1Layout);
		celda_5_m1Layout.setHorizontalGroup(celda_5_m1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_m1Layout.setVerticalGroup(celda_5_m1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_m2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_m2Layout = new javax.swing.GroupLayout(
				celda_0_m2);
		celda_0_m2.setLayout(celda_0_m2Layout);
		celda_0_m2Layout.setHorizontalGroup(celda_0_m2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_m2Layout.setVerticalGroup(celda_0_m2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_m2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_m2Layout = new javax.swing.GroupLayout(
				celda_9_m2);
		celda_9_m2.setLayout(celda_9_m2Layout);
		celda_9_m2Layout.setHorizontalGroup(celda_9_m2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_m2Layout.setVerticalGroup(celda_9_m2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0,
				Short.MAX_VALUE));

		celda_8_m2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_m2Layout = new javax.swing.GroupLayout(
				celda_8_m2);
		celda_8_m2.setLayout(celda_8_m2Layout);
		celda_8_m2Layout.setHorizontalGroup(celda_8_m2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_m2Layout.setVerticalGroup(celda_8_m2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_m2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_m2Layout = new javax.swing.GroupLayout(
				celda_7_m2);
		celda_7_m2.setLayout(celda_7_m2Layout);
		celda_7_m2Layout.setHorizontalGroup(celda_7_m2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_m2Layout.setVerticalGroup(celda_7_m2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_m2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_m2Layout = new javax.swing.GroupLayout(
				celda_6_m2);
		celda_6_m2.setLayout(celda_6_m2Layout);
		celda_6_m2Layout.setHorizontalGroup(celda_6_m2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_m2Layout.setVerticalGroup(celda_6_m2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_m2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_m2Layout = new javax.swing.GroupLayout(
				celda_5_m2);
		celda_5_m2.setLayout(celda_5_m2Layout);
		celda_5_m2Layout.setHorizontalGroup(celda_5_m2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_m2Layout.setVerticalGroup(celda_5_m2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_m2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_m2Layout = new javax.swing.GroupLayout(
				celda_4_m2);
		celda_4_m2.setLayout(celda_4_m2Layout);
		celda_4_m2Layout.setHorizontalGroup(celda_4_m2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_m2Layout.setVerticalGroup(celda_4_m2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_m2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_m2Layout = new javax.swing.GroupLayout(
				celda_3_m2);
		celda_3_m2.setLayout(celda_3_m2Layout);
		celda_3_m2Layout.setHorizontalGroup(celda_3_m2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_m2Layout.setVerticalGroup(celda_3_m2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_m2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_m2Layout = new javax.swing.GroupLayout(
				celda_2_m2);
		celda_2_m2.setLayout(celda_2_m2Layout);
		celda_2_m2Layout.setHorizontalGroup(celda_2_m2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_m2Layout.setVerticalGroup(celda_2_m2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_m2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_m2Layout = new javax.swing.GroupLayout(
				celda_1_m2);
		celda_1_m2.setLayout(celda_1_m2Layout);
		celda_1_m2Layout.setHorizontalGroup(celda_1_m2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_m2Layout.setVerticalGroup(celda_1_m2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_0.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_0Layout = new javax.swing.GroupLayout(
				celda_1_0);
		celda_1_0.setLayout(celda_1_0Layout);
		celda_1_0Layout.setHorizontalGroup(celda_1_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_1_0Layout.setVerticalGroup(celda_1_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_0.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_0Layout = new javax.swing.GroupLayout(
				celda_2_0);
		celda_2_0.setLayout(celda_2_0Layout);
		celda_2_0Layout.setHorizontalGroup(celda_2_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_2_0Layout.setVerticalGroup(celda_2_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_0.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_0Layout = new javax.swing.GroupLayout(
				celda_3_0);
		celda_3_0.setLayout(celda_3_0Layout);
		celda_3_0Layout.setHorizontalGroup(celda_3_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_3_0Layout.setVerticalGroup(celda_3_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_0.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_0Layout = new javax.swing.GroupLayout(
				celda_4_0);
		celda_4_0.setLayout(celda_4_0Layout);
		celda_4_0Layout.setHorizontalGroup(celda_4_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_4_0Layout.setVerticalGroup(celda_4_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_0.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_0Layout = new javax.swing.GroupLayout(
				celda_9_0);
		celda_9_0.setLayout(celda_9_0Layout);
		celda_9_0Layout.setHorizontalGroup(celda_9_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_9_0Layout.setVerticalGroup(celda_9_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_0.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_0Layout = new javax.swing.GroupLayout(
				celda_8_0);
		celda_8_0.setLayout(celda_8_0Layout);
		celda_8_0Layout.setHorizontalGroup(celda_8_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_8_0Layout.setVerticalGroup(celda_8_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_0.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_0Layout = new javax.swing.GroupLayout(
				celda_7_0);
		celda_7_0.setLayout(celda_7_0Layout);
		celda_7_0Layout.setHorizontalGroup(celda_7_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_7_0Layout.setVerticalGroup(celda_7_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_0.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_0Layout = new javax.swing.GroupLayout(
				celda_6_0);
		celda_6_0.setLayout(celda_6_0Layout);
		celda_6_0Layout.setHorizontalGroup(celda_6_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_6_0Layout.setVerticalGroup(celda_6_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_0.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_0Layout = new javax.swing.GroupLayout(
				celda_5_0);
		celda_5_0.setLayout(celda_5_0Layout);
		celda_5_0Layout.setHorizontalGroup(celda_5_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_5_0Layout.setVerticalGroup(celda_5_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_0.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_0Layout = new javax.swing.GroupLayout(
				celda_0_0);
		celda_0_0.setLayout(celda_0_0Layout);
		celda_0_0Layout.setHorizontalGroup(celda_0_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_0_0Layout.setVerticalGroup(celda_0_0Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_1Layout = new javax.swing.GroupLayout(
				celda_2_1);
		celda_2_1.setLayout(celda_2_1Layout);
		celda_2_1Layout.setHorizontalGroup(celda_2_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_2_1Layout.setVerticalGroup(celda_2_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_1Layout = new javax.swing.GroupLayout(
				celda_3_1);
		celda_3_1.setLayout(celda_3_1Layout);
		celda_3_1Layout.setHorizontalGroup(celda_3_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_3_1Layout.setVerticalGroup(celda_3_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_1Layout = new javax.swing.GroupLayout(
				celda_4_1);
		celda_4_1.setLayout(celda_4_1Layout);
		celda_4_1Layout.setHorizontalGroup(celda_4_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_4_1Layout.setVerticalGroup(celda_4_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_1Layout = new javax.swing.GroupLayout(
				celda_9_1);
		celda_9_1.setLayout(celda_9_1Layout);
		celda_9_1Layout.setHorizontalGroup(celda_9_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_9_1Layout.setVerticalGroup(celda_9_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_1Layout = new javax.swing.GroupLayout(
				celda_8_1);
		celda_8_1.setLayout(celda_8_1Layout);
		celda_8_1Layout.setHorizontalGroup(celda_8_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_8_1Layout.setVerticalGroup(celda_8_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_1Layout = new javax.swing.GroupLayout(
				celda_7_1);
		celda_7_1.setLayout(celda_7_1Layout);
		celda_7_1Layout.setHorizontalGroup(celda_7_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_7_1Layout.setVerticalGroup(celda_7_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_1Layout = new javax.swing.GroupLayout(
				celda_6_1);
		celda_6_1.setLayout(celda_6_1Layout);
		celda_6_1Layout.setHorizontalGroup(celda_6_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_6_1Layout.setVerticalGroup(celda_6_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_1Layout = new javax.swing.GroupLayout(
				celda_5_1);
		celda_5_1.setLayout(celda_5_1Layout);
		celda_5_1Layout.setHorizontalGroup(celda_5_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_5_1Layout.setVerticalGroup(celda_5_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_1Layout = new javax.swing.GroupLayout(
				celda_0_1);
		celda_0_1.setLayout(celda_0_1Layout);
		celda_0_1Layout.setHorizontalGroup(celda_0_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_0_1Layout.setVerticalGroup(celda_0_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_1.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_1Layout = new javax.swing.GroupLayout(
				celda_1_1);
		celda_1_1.setLayout(celda_1_1Layout);
		celda_1_1Layout.setHorizontalGroup(celda_1_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_1_1Layout.setVerticalGroup(celda_1_1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_2Layout = new javax.swing.GroupLayout(
				celda_2_2);
		celda_2_2.setLayout(celda_2_2Layout);
		celda_2_2Layout.setHorizontalGroup(celda_2_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_2_2Layout.setVerticalGroup(celda_2_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_2Layout = new javax.swing.GroupLayout(
				celda_3_2);
		celda_3_2.setLayout(celda_3_2Layout);
		celda_3_2Layout.setHorizontalGroup(celda_3_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_3_2Layout.setVerticalGroup(celda_3_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_2Layout = new javax.swing.GroupLayout(
				celda_4_2);
		celda_4_2.setLayout(celda_4_2Layout);
		celda_4_2Layout.setHorizontalGroup(celda_4_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_4_2Layout.setVerticalGroup(celda_4_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_2Layout = new javax.swing.GroupLayout(
				celda_9_2);
		celda_9_2.setLayout(celda_9_2Layout);
		celda_9_2Layout.setHorizontalGroup(celda_9_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_9_2Layout.setVerticalGroup(celda_9_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_2Layout = new javax.swing.GroupLayout(
				celda_8_2);
		celda_8_2.setLayout(celda_8_2Layout);
		celda_8_2Layout.setHorizontalGroup(celda_8_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_8_2Layout.setVerticalGroup(celda_8_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_2Layout = new javax.swing.GroupLayout(
				celda_7_2);
		celda_7_2.setLayout(celda_7_2Layout);
		celda_7_2Layout.setHorizontalGroup(celda_7_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_7_2Layout.setVerticalGroup(celda_7_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_2Layout = new javax.swing.GroupLayout(
				celda_6_2);
		celda_6_2.setLayout(celda_6_2Layout);
		celda_6_2Layout.setHorizontalGroup(celda_6_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_6_2Layout.setVerticalGroup(celda_6_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_2Layout = new javax.swing.GroupLayout(
				celda_5_2);
		celda_5_2.setLayout(celda_5_2Layout);
		celda_5_2Layout.setHorizontalGroup(celda_5_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_5_2Layout.setVerticalGroup(celda_5_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_2Layout = new javax.swing.GroupLayout(
				celda_0_2);
		celda_0_2.setLayout(celda_0_2Layout);
		celda_0_2Layout.setHorizontalGroup(celda_0_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_0_2Layout.setVerticalGroup(celda_0_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_2.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_2Layout = new javax.swing.GroupLayout(
				celda_1_2);
		celda_1_2.setLayout(celda_1_2Layout);
		celda_1_2Layout.setHorizontalGroup(celda_1_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_1_2Layout.setVerticalGroup(celda_1_2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_3.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_3Layout = new javax.swing.GroupLayout(
				celda_2_3);
		celda_2_3.setLayout(celda_2_3Layout);
		celda_2_3Layout.setHorizontalGroup(celda_2_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_2_3Layout.setVerticalGroup(celda_2_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_3.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_3Layout = new javax.swing.GroupLayout(
				celda_1_3);
		celda_1_3.setLayout(celda_1_3Layout);
		celda_1_3Layout.setHorizontalGroup(celda_1_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_1_3Layout.setVerticalGroup(celda_1_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_3.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_3Layout = new javax.swing.GroupLayout(
				celda_5_3);
		celda_5_3.setLayout(celda_5_3Layout);
		celda_5_3Layout.setHorizontalGroup(celda_5_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_5_3Layout.setVerticalGroup(celda_5_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_3.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_3Layout = new javax.swing.GroupLayout(
				celda_4_3);
		celda_4_3.setLayout(celda_4_3Layout);
		celda_4_3Layout.setHorizontalGroup(celda_4_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_4_3Layout.setVerticalGroup(celda_4_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_3.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_3Layout = new javax.swing.GroupLayout(
				celda_3_3);
		celda_3_3.setLayout(celda_3_3Layout);
		celda_3_3Layout.setHorizontalGroup(celda_3_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_3_3Layout.setVerticalGroup(celda_3_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_3.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_3Layout = new javax.swing.GroupLayout(
				celda_8_3);
		celda_8_3.setLayout(celda_8_3Layout);
		celda_8_3Layout.setHorizontalGroup(celda_8_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_8_3Layout.setVerticalGroup(celda_8_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_3.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_3Layout = new javax.swing.GroupLayout(
				celda_6_3);
		celda_6_3.setLayout(celda_6_3Layout);
		celda_6_3Layout.setHorizontalGroup(celda_6_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_6_3Layout.setVerticalGroup(celda_6_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_3.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_3Layout = new javax.swing.GroupLayout(
				celda_7_3);
		celda_7_3.setLayout(celda_7_3Layout);
		celda_7_3Layout.setHorizontalGroup(celda_7_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_7_3Layout.setVerticalGroup(celda_7_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_3.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_3Layout = new javax.swing.GroupLayout(
				celda_0_3);
		celda_0_3.setLayout(celda_0_3Layout);
		celda_0_3Layout.setHorizontalGroup(celda_0_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_0_3Layout.setVerticalGroup(celda_0_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_3.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_3Layout = new javax.swing.GroupLayout(
				celda_9_3);
		celda_9_3.setLayout(celda_9_3Layout);
		celda_9_3Layout.setHorizontalGroup(celda_9_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_9_3Layout.setVerticalGroup(celda_9_3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_4.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_4Layout = new javax.swing.GroupLayout(
				celda_5_4);
		celda_5_4.setLayout(celda_5_4Layout);
		celda_5_4Layout.setHorizontalGroup(celda_5_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_5_4Layout.setVerticalGroup(celda_5_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_4.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_4Layout = new javax.swing.GroupLayout(
				celda_8_4);
		celda_8_4.setLayout(celda_8_4Layout);
		celda_8_4Layout.setHorizontalGroup(celda_8_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_8_4Layout.setVerticalGroup(celda_8_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_4.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_4Layout = new javax.swing.GroupLayout(
				celda_6_4);
		celda_6_4.setLayout(celda_6_4Layout);
		celda_6_4Layout.setHorizontalGroup(celda_6_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_6_4Layout.setVerticalGroup(celda_6_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_4.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_4Layout = new javax.swing.GroupLayout(
				celda_0_4);
		celda_0_4.setLayout(celda_0_4Layout);
		celda_0_4Layout.setHorizontalGroup(celda_0_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_0_4Layout.setVerticalGroup(celda_0_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_4.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_4Layout = new javax.swing.GroupLayout(
				celda_3_4);
		celda_3_4.setLayout(celda_3_4Layout);
		celda_3_4Layout.setHorizontalGroup(celda_3_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_3_4Layout.setVerticalGroup(celda_3_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_4.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_4Layout = new javax.swing.GroupLayout(
				celda_7_4);
		celda_7_4.setLayout(celda_7_4Layout);
		celda_7_4Layout.setHorizontalGroup(celda_7_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_7_4Layout.setVerticalGroup(celda_7_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_4.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_4Layout = new javax.swing.GroupLayout(
				celda_2_4);
		celda_2_4.setLayout(celda_2_4Layout);
		celda_2_4Layout.setHorizontalGroup(celda_2_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_2_4Layout.setVerticalGroup(celda_2_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_4.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_4Layout = new javax.swing.GroupLayout(
				celda_4_4);
		celda_4_4.setLayout(celda_4_4Layout);
		celda_4_4Layout.setHorizontalGroup(celda_4_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_4_4Layout.setVerticalGroup(celda_4_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_4.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_4Layout = new javax.swing.GroupLayout(
				celda_9_4);
		celda_9_4.setLayout(celda_9_4Layout);
		celda_9_4Layout.setHorizontalGroup(celda_9_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_9_4Layout.setVerticalGroup(celda_9_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_4.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_4Layout = new javax.swing.GroupLayout(
				celda_1_4);
		celda_1_4.setLayout(celda_1_4Layout);
		celda_1_4Layout.setHorizontalGroup(celda_1_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_1_4Layout.setVerticalGroup(celda_1_4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_5.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_5Layout = new javax.swing.GroupLayout(
				celda_5_5);
		celda_5_5.setLayout(celda_5_5Layout);
		celda_5_5Layout.setHorizontalGroup(celda_5_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_5_5Layout.setVerticalGroup(celda_5_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_5.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_5Layout = new javax.swing.GroupLayout(
				celda_8_5);
		celda_8_5.setLayout(celda_8_5Layout);
		celda_8_5Layout.setHorizontalGroup(celda_8_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_8_5Layout.setVerticalGroup(celda_8_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_5.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_5Layout = new javax.swing.GroupLayout(
				celda_6_5);
		celda_6_5.setLayout(celda_6_5Layout);
		celda_6_5Layout.setHorizontalGroup(celda_6_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_6_5Layout.setVerticalGroup(celda_6_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_5.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_5Layout = new javax.swing.GroupLayout(
				celda_0_5);
		celda_0_5.setLayout(celda_0_5Layout);
		celda_0_5Layout.setHorizontalGroup(celda_0_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_0_5Layout.setVerticalGroup(celda_0_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_5.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_5Layout = new javax.swing.GroupLayout(
				celda_3_5);
		celda_3_5.setLayout(celda_3_5Layout);
		celda_3_5Layout.setHorizontalGroup(celda_3_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_3_5Layout.setVerticalGroup(celda_3_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_5.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_5Layout = new javax.swing.GroupLayout(
				celda_7_5);
		celda_7_5.setLayout(celda_7_5Layout);
		celda_7_5Layout.setHorizontalGroup(celda_7_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_7_5Layout.setVerticalGroup(celda_7_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_5.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_5Layout = new javax.swing.GroupLayout(
				celda_2_5);
		celda_2_5.setLayout(celda_2_5Layout);
		celda_2_5Layout.setHorizontalGroup(celda_2_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_2_5Layout.setVerticalGroup(celda_2_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_5.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_5Layout = new javax.swing.GroupLayout(
				celda_4_5);
		celda_4_5.setLayout(celda_4_5Layout);
		celda_4_5Layout.setHorizontalGroup(celda_4_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_4_5Layout.setVerticalGroup(celda_4_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_5.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_5Layout = new javax.swing.GroupLayout(
				celda_9_5);
		celda_9_5.setLayout(celda_9_5Layout);
		celda_9_5Layout.setHorizontalGroup(celda_9_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_9_5Layout.setVerticalGroup(celda_9_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_5.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_5Layout = new javax.swing.GroupLayout(
				celda_1_5);
		celda_1_5.setLayout(celda_1_5Layout);
		celda_1_5Layout.setHorizontalGroup(celda_1_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_1_5Layout.setVerticalGroup(celda_1_5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_6.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_6Layout = new javax.swing.GroupLayout(
				celda_8_6);
		celda_8_6.setLayout(celda_8_6Layout);
		celda_8_6Layout.setHorizontalGroup(celda_8_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_8_6Layout.setVerticalGroup(celda_8_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_6.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_6Layout = new javax.swing.GroupLayout(
				celda_1_6);
		celda_1_6.setLayout(celda_1_6Layout);
		celda_1_6Layout.setHorizontalGroup(celda_1_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_1_6Layout.setVerticalGroup(celda_1_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_6.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_6Layout = new javax.swing.GroupLayout(
				celda_6_6);
		celda_6_6.setLayout(celda_6_6Layout);
		celda_6_6Layout.setHorizontalGroup(celda_6_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_6_6Layout.setVerticalGroup(celda_6_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_6.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_6Layout = new javax.swing.GroupLayout(
				celda_7_6);
		celda_7_6.setLayout(celda_7_6Layout);
		celda_7_6Layout.setHorizontalGroup(celda_7_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_7_6Layout.setVerticalGroup(celda_7_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_6.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_6Layout = new javax.swing.GroupLayout(
				celda_4_6);
		celda_4_6.setLayout(celda_4_6Layout);
		celda_4_6Layout.setHorizontalGroup(celda_4_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_4_6Layout.setVerticalGroup(celda_4_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_6.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_6Layout = new javax.swing.GroupLayout(
				celda_5_6);
		celda_5_6.setLayout(celda_5_6Layout);
		celda_5_6Layout.setHorizontalGroup(celda_5_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_5_6Layout.setVerticalGroup(celda_5_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_6.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_6Layout = new javax.swing.GroupLayout(
				celda_2_6);
		celda_2_6.setLayout(celda_2_6Layout);
		celda_2_6Layout.setHorizontalGroup(celda_2_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_2_6Layout.setVerticalGroup(celda_2_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_6.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_6Layout = new javax.swing.GroupLayout(
				celda_9_6);
		celda_9_6.setLayout(celda_9_6Layout);
		celda_9_6Layout.setHorizontalGroup(celda_9_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_9_6Layout.setVerticalGroup(celda_9_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_6.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_6Layout = new javax.swing.GroupLayout(
				celda_0_6);
		celda_0_6.setLayout(celda_0_6Layout);
		celda_0_6Layout.setHorizontalGroup(celda_0_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_0_6Layout.setVerticalGroup(celda_0_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_6.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_6Layout = new javax.swing.GroupLayout(
				celda_3_6);
		celda_3_6.setLayout(celda_3_6Layout);
		celda_3_6Layout.setHorizontalGroup(celda_3_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_3_6Layout.setVerticalGroup(celda_3_6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_7.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_7Layout = new javax.swing.GroupLayout(
				celda_8_7);
		celda_8_7.setLayout(celda_8_7Layout);
		celda_8_7Layout.setHorizontalGroup(celda_8_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_8_7Layout.setVerticalGroup(celda_8_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_7.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_7Layout = new javax.swing.GroupLayout(
				celda_0_7);
		celda_0_7.setLayout(celda_0_7Layout);
		celda_0_7Layout.setHorizontalGroup(celda_0_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_0_7Layout.setVerticalGroup(celda_0_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_7.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_7Layout = new javax.swing.GroupLayout(
				celda_7_7);
		celda_7_7.setLayout(celda_7_7Layout);
		celda_7_7Layout.setHorizontalGroup(celda_7_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_7_7Layout.setVerticalGroup(celda_7_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_7.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_7Layout = new javax.swing.GroupLayout(
				celda_9_7);
		celda_9_7.setLayout(celda_9_7Layout);
		celda_9_7Layout.setHorizontalGroup(celda_9_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_9_7Layout.setVerticalGroup(celda_9_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_7.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_7Layout = new javax.swing.GroupLayout(
				celda_2_7);
		celda_2_7.setLayout(celda_2_7Layout);
		celda_2_7Layout.setHorizontalGroup(celda_2_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_2_7Layout.setVerticalGroup(celda_2_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_7.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_7Layout = new javax.swing.GroupLayout(
				celda_3_7);
		celda_3_7.setLayout(celda_3_7Layout);
		celda_3_7Layout.setHorizontalGroup(celda_3_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_3_7Layout.setVerticalGroup(celda_3_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_7.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_7Layout = new javax.swing.GroupLayout(
				celda_4_7);
		celda_4_7.setLayout(celda_4_7Layout);
		celda_4_7Layout.setHorizontalGroup(celda_4_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_4_7Layout.setVerticalGroup(celda_4_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_7.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_7Layout = new javax.swing.GroupLayout(
				celda_5_7);
		celda_5_7.setLayout(celda_5_7Layout);
		celda_5_7Layout.setHorizontalGroup(celda_5_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_5_7Layout.setVerticalGroup(celda_5_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_7.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_7Layout = new javax.swing.GroupLayout(
				celda_1_7);
		celda_1_7.setLayout(celda_1_7Layout);
		celda_1_7Layout.setHorizontalGroup(celda_1_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_1_7Layout.setVerticalGroup(celda_1_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_7.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_7Layout = new javax.swing.GroupLayout(
				celda_6_7);
		celda_6_7.setLayout(celda_6_7Layout);
		celda_6_7Layout.setHorizontalGroup(celda_6_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_6_7Layout.setVerticalGroup(celda_6_7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_8.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_8Layout = new javax.swing.GroupLayout(
				celda_7_8);
		celda_7_8.setLayout(celda_7_8Layout);
		celda_7_8Layout.setHorizontalGroup(celda_7_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_7_8Layout.setVerticalGroup(celda_7_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_8.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_8Layout = new javax.swing.GroupLayout(
				celda_5_8);
		celda_5_8.setLayout(celda_5_8Layout);
		celda_5_8Layout.setHorizontalGroup(celda_5_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_5_8Layout.setVerticalGroup(celda_5_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_8.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_8Layout = new javax.swing.GroupLayout(
				celda_4_8);
		celda_4_8.setLayout(celda_4_8Layout);
		celda_4_8Layout.setHorizontalGroup(celda_4_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_4_8Layout.setVerticalGroup(celda_4_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_8.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_8Layout = new javax.swing.GroupLayout(
				celda_3_8);
		celda_3_8.setLayout(celda_3_8Layout);
		celda_3_8Layout.setHorizontalGroup(celda_3_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_3_8Layout.setVerticalGroup(celda_3_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_8.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_8Layout = new javax.swing.GroupLayout(
				celda_0_8);
		celda_0_8.setLayout(celda_0_8Layout);
		celda_0_8Layout.setHorizontalGroup(celda_0_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_0_8Layout.setVerticalGroup(celda_0_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_8.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_8Layout = new javax.swing.GroupLayout(
				celda_9_8);
		celda_9_8.setLayout(celda_9_8Layout);
		celda_9_8Layout.setHorizontalGroup(celda_9_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_9_8Layout.setVerticalGroup(celda_9_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_8.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_8Layout = new javax.swing.GroupLayout(
				celda_2_8);
		celda_2_8.setLayout(celda_2_8Layout);
		celda_2_8Layout.setHorizontalGroup(celda_2_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_2_8Layout.setVerticalGroup(celda_2_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_8.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_8Layout = new javax.swing.GroupLayout(
				celda_1_8);
		celda_1_8.setLayout(celda_1_8Layout);
		celda_1_8Layout.setHorizontalGroup(celda_1_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_1_8Layout.setVerticalGroup(celda_1_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_8.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_8Layout = new javax.swing.GroupLayout(
				celda_6_8);
		celda_6_8.setLayout(celda_6_8Layout);
		celda_6_8Layout.setHorizontalGroup(celda_6_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_6_8Layout.setVerticalGroup(celda_6_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_8.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_8Layout = new javax.swing.GroupLayout(
				celda_8_8);
		celda_8_8.setLayout(celda_8_8Layout);
		celda_8_8Layout.setHorizontalGroup(celda_8_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_8_8Layout.setVerticalGroup(celda_8_8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_9.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_9Layout = new javax.swing.GroupLayout(
				celda_3_9);
		celda_3_9.setLayout(celda_3_9Layout);
		celda_3_9Layout.setHorizontalGroup(celda_3_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_3_9Layout.setVerticalGroup(celda_3_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_9.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_9Layout = new javax.swing.GroupLayout(
				celda_5_9);
		celda_5_9.setLayout(celda_5_9Layout);
		celda_5_9Layout.setHorizontalGroup(celda_5_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_5_9Layout.setVerticalGroup(celda_5_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_9.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_9Layout = new javax.swing.GroupLayout(
				celda_8_9);
		celda_8_9.setLayout(celda_8_9Layout);
		celda_8_9Layout.setHorizontalGroup(celda_8_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_8_9Layout.setVerticalGroup(celda_8_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_9.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_9Layout = new javax.swing.GroupLayout(
				celda_7_9);
		celda_7_9.setLayout(celda_7_9Layout);
		celda_7_9Layout.setHorizontalGroup(celda_7_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_7_9Layout.setVerticalGroup(celda_7_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_9.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_9Layout = new javax.swing.GroupLayout(
				celda_2_9);
		celda_2_9.setLayout(celda_2_9Layout);
		celda_2_9Layout.setHorizontalGroup(celda_2_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_2_9Layout.setVerticalGroup(celda_2_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_9.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_9Layout = new javax.swing.GroupLayout(
				celda_0_9);
		celda_0_9.setLayout(celda_0_9Layout);
		celda_0_9Layout.setHorizontalGroup(celda_0_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_0_9Layout.setVerticalGroup(celda_0_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_9.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_9Layout = new javax.swing.GroupLayout(
				celda_1_9);
		celda_1_9.setLayout(celda_1_9Layout);
		celda_1_9Layout.setHorizontalGroup(celda_1_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_1_9Layout.setVerticalGroup(celda_1_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_9.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_9Layout = new javax.swing.GroupLayout(
				celda_4_9);
		celda_4_9.setLayout(celda_4_9Layout);
		celda_4_9Layout.setHorizontalGroup(celda_4_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_4_9Layout.setVerticalGroup(celda_4_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_9.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_9Layout = new javax.swing.GroupLayout(
				celda_9_9);
		celda_9_9.setLayout(celda_9_9Layout);
		celda_9_9Layout.setHorizontalGroup(celda_9_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_9_9Layout.setVerticalGroup(celda_9_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_9.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_9Layout = new javax.swing.GroupLayout(
				celda_6_9);
		celda_6_9.setLayout(celda_6_9Layout);
		celda_6_9Layout.setHorizontalGroup(celda_6_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));
		celda_6_9Layout.setVerticalGroup(celda_6_9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_10.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_10Layout = new javax.swing.GroupLayout(
				celda_5_10);
		celda_5_10.setLayout(celda_5_10Layout);
		celda_5_10Layout.setHorizontalGroup(celda_5_10Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_10Layout.setVerticalGroup(celda_5_10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_10.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_10Layout = new javax.swing.GroupLayout(
				celda_7_10);
		celda_7_10.setLayout(celda_7_10Layout);
		celda_7_10Layout.setHorizontalGroup(celda_7_10Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_10Layout.setVerticalGroup(celda_7_10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_10.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_10Layout = new javax.swing.GroupLayout(
				celda_4_10);
		celda_4_10.setLayout(celda_4_10Layout);
		celda_4_10Layout.setHorizontalGroup(celda_4_10Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_10Layout.setVerticalGroup(celda_4_10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_10.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_10Layout = new javax.swing.GroupLayout(
				celda_0_10);
		celda_0_10.setLayout(celda_0_10Layout);
		celda_0_10Layout.setHorizontalGroup(celda_0_10Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_10Layout.setVerticalGroup(celda_0_10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_10.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_10Layout = new javax.swing.GroupLayout(
				celda_9_10);
		celda_9_10.setLayout(celda_9_10Layout);
		celda_9_10Layout.setHorizontalGroup(celda_9_10Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_10Layout.setVerticalGroup(celda_9_10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_10.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_10Layout = new javax.swing.GroupLayout(
				celda_8_10);
		celda_8_10.setLayout(celda_8_10Layout);
		celda_8_10Layout.setHorizontalGroup(celda_8_10Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_10Layout.setVerticalGroup(celda_8_10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_10.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_10Layout = new javax.swing.GroupLayout(
				celda_2_10);
		celda_2_10.setLayout(celda_2_10Layout);
		celda_2_10Layout.setHorizontalGroup(celda_2_10Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_10Layout.setVerticalGroup(celda_2_10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_10.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_10Layout = new javax.swing.GroupLayout(
				celda_6_10);
		celda_6_10.setLayout(celda_6_10Layout);
		celda_6_10Layout.setHorizontalGroup(celda_6_10Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_10Layout.setVerticalGroup(celda_6_10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_10.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_10Layout = new javax.swing.GroupLayout(
				celda_1_10);
		celda_1_10.setLayout(celda_1_10Layout);
		celda_1_10Layout.setHorizontalGroup(celda_1_10Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_10Layout.setVerticalGroup(celda_1_10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_10.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_10Layout = new javax.swing.GroupLayout(
				celda_3_10);
		celda_3_10.setLayout(celda_3_10Layout);
		celda_3_10Layout.setHorizontalGroup(celda_3_10Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_10Layout.setVerticalGroup(celda_3_10Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_11.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_11Layout = new javax.swing.GroupLayout(
				celda_5_11);
		celda_5_11.setLayout(celda_5_11Layout);
		celda_5_11Layout.setHorizontalGroup(celda_5_11Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_11Layout.setVerticalGroup(celda_5_11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_11.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_11Layout = new javax.swing.GroupLayout(
				celda_6_11);
		celda_6_11.setLayout(celda_6_11Layout);
		celda_6_11Layout.setHorizontalGroup(celda_6_11Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_11Layout.setVerticalGroup(celda_6_11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_11.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_11Layout = new javax.swing.GroupLayout(
				celda_3_11);
		celda_3_11.setLayout(celda_3_11Layout);
		celda_3_11Layout.setHorizontalGroup(celda_3_11Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_11Layout.setVerticalGroup(celda_3_11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_11.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_11Layout = new javax.swing.GroupLayout(
				celda_4_11);
		celda_4_11.setLayout(celda_4_11Layout);
		celda_4_11Layout.setHorizontalGroup(celda_4_11Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_11Layout.setVerticalGroup(celda_4_11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_11.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_11Layout = new javax.swing.GroupLayout(
				celda_0_11);
		celda_0_11.setLayout(celda_0_11Layout);
		celda_0_11Layout.setHorizontalGroup(celda_0_11Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_11Layout.setVerticalGroup(celda_0_11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_11.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_11Layout = new javax.swing.GroupLayout(
				celda_9_11);
		celda_9_11.setLayout(celda_9_11Layout);
		celda_9_11Layout.setHorizontalGroup(celda_9_11Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_11Layout.setVerticalGroup(celda_9_11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_11.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_11Layout = new javax.swing.GroupLayout(
				celda_8_11);
		celda_8_11.setLayout(celda_8_11Layout);
		celda_8_11Layout.setHorizontalGroup(celda_8_11Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_11Layout.setVerticalGroup(celda_8_11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_11.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_11Layout = new javax.swing.GroupLayout(
				celda_2_11);
		celda_2_11.setLayout(celda_2_11Layout);
		celda_2_11Layout.setHorizontalGroup(celda_2_11Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_11Layout.setVerticalGroup(celda_2_11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_11.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_11Layout = new javax.swing.GroupLayout(
				celda_1_11);
		celda_1_11.setLayout(celda_1_11Layout);
		celda_1_11Layout.setHorizontalGroup(celda_1_11Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_11Layout.setVerticalGroup(celda_1_11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_11.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_11Layout = new javax.swing.GroupLayout(
				celda_7_11);
		celda_7_11.setLayout(celda_7_11Layout);
		celda_7_11Layout.setHorizontalGroup(celda_7_11Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_11Layout.setVerticalGroup(celda_7_11Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_12.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_12Layout = new javax.swing.GroupLayout(
				celda_5_12);
		celda_5_12.setLayout(celda_5_12Layout);
		celda_5_12Layout.setHorizontalGroup(celda_5_12Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_12Layout.setVerticalGroup(celda_5_12Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_12.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_12Layout = new javax.swing.GroupLayout(
				celda_3_12);
		celda_3_12.setLayout(celda_3_12Layout);
		celda_3_12Layout.setHorizontalGroup(celda_3_12Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_12Layout.setVerticalGroup(celda_3_12Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_12.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_12Layout = new javax.swing.GroupLayout(
				celda_9_12);
		celda_9_12.setLayout(celda_9_12Layout);
		celda_9_12Layout.setHorizontalGroup(celda_9_12Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_12Layout.setVerticalGroup(celda_9_12Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_12.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_12Layout = new javax.swing.GroupLayout(
				celda_6_12);
		celda_6_12.setLayout(celda_6_12Layout);
		celda_6_12Layout.setHorizontalGroup(celda_6_12Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_12Layout.setVerticalGroup(celda_6_12Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_12.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_12Layout = new javax.swing.GroupLayout(
				celda_7_12);
		celda_7_12.setLayout(celda_7_12Layout);
		celda_7_12Layout.setHorizontalGroup(celda_7_12Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_12Layout.setVerticalGroup(celda_7_12Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_12.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_12Layout = new javax.swing.GroupLayout(
				celda_0_12);
		celda_0_12.setLayout(celda_0_12Layout);
		celda_0_12Layout.setHorizontalGroup(celda_0_12Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_12Layout.setVerticalGroup(celda_0_12Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_12.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_12Layout = new javax.swing.GroupLayout(
				celda_2_12);
		celda_2_12.setLayout(celda_2_12Layout);
		celda_2_12Layout.setHorizontalGroup(celda_2_12Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_12Layout.setVerticalGroup(celda_2_12Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_12.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_12Layout = new javax.swing.GroupLayout(
				celda_4_12);
		celda_4_12.setLayout(celda_4_12Layout);
		celda_4_12Layout.setHorizontalGroup(celda_4_12Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_12Layout.setVerticalGroup(celda_4_12Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_12.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_12Layout = new javax.swing.GroupLayout(
				celda_1_12);
		celda_1_12.setLayout(celda_1_12Layout);
		celda_1_12Layout.setHorizontalGroup(celda_1_12Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_12Layout.setVerticalGroup(celda_1_12Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_12.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_12Layout = new javax.swing.GroupLayout(
				celda_8_12);
		celda_8_12.setLayout(celda_8_12Layout);
		celda_8_12Layout.setHorizontalGroup(celda_8_12Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_12Layout.setVerticalGroup(celda_8_12Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_13.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_13Layout = new javax.swing.GroupLayout(
				celda_5_13);
		celda_5_13.setLayout(celda_5_13Layout);
		celda_5_13Layout.setHorizontalGroup(celda_5_13Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_13Layout.setVerticalGroup(celda_5_13Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_13.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_13Layout = new javax.swing.GroupLayout(
				celda_6_13);
		celda_6_13.setLayout(celda_6_13Layout);
		celda_6_13Layout.setHorizontalGroup(celda_6_13Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_13Layout.setVerticalGroup(celda_6_13Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_13.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_13Layout = new javax.swing.GroupLayout(
				celda_7_13);
		celda_7_13.setLayout(celda_7_13Layout);
		celda_7_13Layout.setHorizontalGroup(celda_7_13Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_13Layout.setVerticalGroup(celda_7_13Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_13.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_13Layout = new javax.swing.GroupLayout(
				celda_0_13);
		celda_0_13.setLayout(celda_0_13Layout);
		celda_0_13Layout.setHorizontalGroup(celda_0_13Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_13Layout.setVerticalGroup(celda_0_13Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_13.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_13Layout = new javax.swing.GroupLayout(
				celda_3_13);
		celda_3_13.setLayout(celda_3_13Layout);
		celda_3_13Layout.setHorizontalGroup(celda_3_13Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_13Layout.setVerticalGroup(celda_3_13Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_13.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_13Layout = new javax.swing.GroupLayout(
				celda_2_13);
		celda_2_13.setLayout(celda_2_13Layout);
		celda_2_13Layout.setHorizontalGroup(celda_2_13Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_13Layout.setVerticalGroup(celda_2_13Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_13.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_13Layout = new javax.swing.GroupLayout(
				celda_1_13);
		celda_1_13.setLayout(celda_1_13Layout);
		celda_1_13Layout.setHorizontalGroup(celda_1_13Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_13Layout.setVerticalGroup(celda_1_13Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_13.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_13Layout = new javax.swing.GroupLayout(
				celda_4_13);
		celda_4_13.setLayout(celda_4_13Layout);
		celda_4_13Layout.setHorizontalGroup(celda_4_13Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_13Layout.setVerticalGroup(celda_4_13Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_13.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_13Layout = new javax.swing.GroupLayout(
				celda_8_13);
		celda_8_13.setLayout(celda_8_13Layout);
		celda_8_13Layout.setHorizontalGroup(celda_8_13Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_13Layout.setVerticalGroup(celda_8_13Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_13.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_13Layout = new javax.swing.GroupLayout(
				celda_9_13);
		celda_9_13.setLayout(celda_9_13Layout);
		celda_9_13Layout.setHorizontalGroup(celda_9_13Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_13Layout.setVerticalGroup(celda_9_13Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_14.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_14Layout = new javax.swing.GroupLayout(
				celda_6_14);
		celda_6_14.setLayout(celda_6_14Layout);
		celda_6_14Layout.setHorizontalGroup(celda_6_14Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_14Layout.setVerticalGroup(celda_6_14Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_14.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_14Layout = new javax.swing.GroupLayout(
				celda_7_14);
		celda_7_14.setLayout(celda_7_14Layout);
		celda_7_14Layout.setHorizontalGroup(celda_7_14Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_14Layout.setVerticalGroup(celda_7_14Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_14.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_14Layout = new javax.swing.GroupLayout(
				celda_5_14);
		celda_5_14.setLayout(celda_5_14Layout);
		celda_5_14Layout.setHorizontalGroup(celda_5_14Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_14Layout.setVerticalGroup(celda_5_14Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_14.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_14Layout = new javax.swing.GroupLayout(
				celda_0_14);
		celda_0_14.setLayout(celda_0_14Layout);
		celda_0_14Layout.setHorizontalGroup(celda_0_14Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_14Layout.setVerticalGroup(celda_0_14Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_14.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_14Layout = new javax.swing.GroupLayout(
				celda_2_14);
		celda_2_14.setLayout(celda_2_14Layout);
		celda_2_14Layout.setHorizontalGroup(celda_2_14Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_14Layout.setVerticalGroup(celda_2_14Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_14.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_14Layout = new javax.swing.GroupLayout(
				celda_3_14);
		celda_3_14.setLayout(celda_3_14Layout);
		celda_3_14Layout.setHorizontalGroup(celda_3_14Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_14Layout.setVerticalGroup(celda_3_14Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_14.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_14Layout = new javax.swing.GroupLayout(
				celda_1_14);
		celda_1_14.setLayout(celda_1_14Layout);
		celda_1_14Layout.setHorizontalGroup(celda_1_14Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_14Layout.setVerticalGroup(celda_1_14Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_14.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_14Layout = new javax.swing.GroupLayout(
				celda_8_14);
		celda_8_14.setLayout(celda_8_14Layout);
		celda_8_14Layout.setHorizontalGroup(celda_8_14Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_14Layout.setVerticalGroup(celda_8_14Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_14.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_14Layout = new javax.swing.GroupLayout(
				celda_4_14);
		celda_4_14.setLayout(celda_4_14Layout);
		celda_4_14Layout.setHorizontalGroup(celda_4_14Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_14Layout.setVerticalGroup(celda_4_14Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_14.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_14Layout = new javax.swing.GroupLayout(
				celda_9_14);
		celda_9_14.setLayout(celda_9_14Layout);
		celda_9_14Layout.setHorizontalGroup(celda_9_14Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_14Layout.setVerticalGroup(celda_9_14Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_15.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_15Layout = new javax.swing.GroupLayout(
				celda_2_15);
		celda_2_15.setLayout(celda_2_15Layout);
		celda_2_15Layout.setHorizontalGroup(celda_2_15Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_15Layout.setVerticalGroup(celda_2_15Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_15.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_15Layout = new javax.swing.GroupLayout(
				celda_5_15);
		celda_5_15.setLayout(celda_5_15Layout);
		celda_5_15Layout.setHorizontalGroup(celda_5_15Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_15Layout.setVerticalGroup(celda_5_15Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_15.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_15Layout = new javax.swing.GroupLayout(
				celda_9_15);
		celda_9_15.setLayout(celda_9_15Layout);
		celda_9_15Layout.setHorizontalGroup(celda_9_15Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_15Layout.setVerticalGroup(celda_9_15Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_15.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_15Layout = new javax.swing.GroupLayout(
				celda_4_15);
		celda_4_15.setLayout(celda_4_15Layout);
		celda_4_15Layout.setHorizontalGroup(celda_4_15Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_15Layout.setVerticalGroup(celda_4_15Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_15.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_15Layout = new javax.swing.GroupLayout(
				celda_3_15);
		celda_3_15.setLayout(celda_3_15Layout);
		celda_3_15Layout.setHorizontalGroup(celda_3_15Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_15Layout.setVerticalGroup(celda_3_15Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_15.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_15Layout = new javax.swing.GroupLayout(
				celda_8_15);
		celda_8_15.setLayout(celda_8_15Layout);
		celda_8_15Layout.setHorizontalGroup(celda_8_15Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_15Layout.setVerticalGroup(celda_8_15Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_15.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_15Layout = new javax.swing.GroupLayout(
				celda_7_15);
		celda_7_15.setLayout(celda_7_15Layout);
		celda_7_15Layout.setHorizontalGroup(celda_7_15Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_15Layout.setVerticalGroup(celda_7_15Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_15.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_15Layout = new javax.swing.GroupLayout(
				celda_1_15);
		celda_1_15.setLayout(celda_1_15Layout);
		celda_1_15Layout.setHorizontalGroup(celda_1_15Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_15Layout.setVerticalGroup(celda_1_15Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_15.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_15Layout = new javax.swing.GroupLayout(
				celda_6_15);
		celda_6_15.setLayout(celda_6_15Layout);
		celda_6_15Layout.setHorizontalGroup(celda_6_15Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_15Layout.setVerticalGroup(celda_6_15Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_15.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_15Layout = new javax.swing.GroupLayout(
				celda_0_15);
		celda_0_15.setLayout(celda_0_15Layout);
		celda_0_15Layout.setHorizontalGroup(celda_0_15Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_15Layout.setVerticalGroup(celda_0_15Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_16.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_16Layout = new javax.swing.GroupLayout(
				celda_8_16);
		celda_8_16.setLayout(celda_8_16Layout);
		celda_8_16Layout.setHorizontalGroup(celda_8_16Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_16Layout.setVerticalGroup(celda_8_16Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_16.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_16Layout = new javax.swing.GroupLayout(
				celda_7_16);
		celda_7_16.setLayout(celda_7_16Layout);
		celda_7_16Layout.setHorizontalGroup(celda_7_16Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_16Layout.setVerticalGroup(celda_7_16Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_16.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_16Layout = new javax.swing.GroupLayout(
				celda_6_16);
		celda_6_16.setLayout(celda_6_16Layout);
		celda_6_16Layout.setHorizontalGroup(celda_6_16Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_16Layout.setVerticalGroup(celda_6_16Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_16.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_16Layout = new javax.swing.GroupLayout(
				celda_2_16);
		celda_2_16.setLayout(celda_2_16Layout);
		celda_2_16Layout.setHorizontalGroup(celda_2_16Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_16Layout.setVerticalGroup(celda_2_16Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_16.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_16Layout = new javax.swing.GroupLayout(
				celda_9_16);
		celda_9_16.setLayout(celda_9_16Layout);
		celda_9_16Layout.setHorizontalGroup(celda_9_16Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_16Layout.setVerticalGroup(celda_9_16Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_16.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_16Layout = new javax.swing.GroupLayout(
				celda_4_16);
		celda_4_16.setLayout(celda_4_16Layout);
		celda_4_16Layout.setHorizontalGroup(celda_4_16Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_16Layout.setVerticalGroup(celda_4_16Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_16.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_16Layout = new javax.swing.GroupLayout(
				celda_5_16);
		celda_5_16.setLayout(celda_5_16Layout);
		celda_5_16Layout.setHorizontalGroup(celda_5_16Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_16Layout.setVerticalGroup(celda_5_16Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_16.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_16Layout = new javax.swing.GroupLayout(
				celda_1_16);
		celda_1_16.setLayout(celda_1_16Layout);
		celda_1_16Layout.setHorizontalGroup(celda_1_16Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_16Layout.setVerticalGroup(celda_1_16Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_16.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_16Layout = new javax.swing.GroupLayout(
				celda_0_16);
		celda_0_16.setLayout(celda_0_16Layout);
		celda_0_16Layout.setHorizontalGroup(celda_0_16Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_16Layout.setVerticalGroup(celda_0_16Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_16.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_16Layout = new javax.swing.GroupLayout(
				celda_3_16);
		celda_3_16.setLayout(celda_3_16Layout);
		celda_3_16Layout.setHorizontalGroup(celda_3_16Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_16Layout.setVerticalGroup(celda_3_16Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_17.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_17Layout = new javax.swing.GroupLayout(
				celda_8_17);
		celda_8_17.setLayout(celda_8_17Layout);
		celda_8_17Layout.setHorizontalGroup(celda_8_17Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_17Layout.setVerticalGroup(celda_8_17Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_17.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_17Layout = new javax.swing.GroupLayout(
				celda_7_17);
		celda_7_17.setLayout(celda_7_17Layout);
		celda_7_17Layout.setHorizontalGroup(celda_7_17Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_17Layout.setVerticalGroup(celda_7_17Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_17.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_17Layout = new javax.swing.GroupLayout(
				celda_6_17);
		celda_6_17.setLayout(celda_6_17Layout);
		celda_6_17Layout.setHorizontalGroup(celda_6_17Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_17Layout.setVerticalGroup(celda_6_17Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_17.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_17Layout = new javax.swing.GroupLayout(
				celda_2_17);
		celda_2_17.setLayout(celda_2_17Layout);
		celda_2_17Layout.setHorizontalGroup(celda_2_17Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_17Layout.setVerticalGroup(celda_2_17Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_17.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_17Layout = new javax.swing.GroupLayout(
				celda_9_17);
		celda_9_17.setLayout(celda_9_17Layout);
		celda_9_17Layout.setHorizontalGroup(celda_9_17Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_17Layout.setVerticalGroup(celda_9_17Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_17.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_17Layout = new javax.swing.GroupLayout(
				celda_4_17);
		celda_4_17.setLayout(celda_4_17Layout);
		celda_4_17Layout.setHorizontalGroup(celda_4_17Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_17Layout.setVerticalGroup(celda_4_17Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_17.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_17Layout = new javax.swing.GroupLayout(
				celda_5_17);
		celda_5_17.setLayout(celda_5_17Layout);
		celda_5_17Layout.setHorizontalGroup(celda_5_17Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_17Layout.setVerticalGroup(celda_5_17Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_17.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_17Layout = new javax.swing.GroupLayout(
				celda_1_17);
		celda_1_17.setLayout(celda_1_17Layout);
		celda_1_17Layout.setHorizontalGroup(celda_1_17Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_17Layout.setVerticalGroup(celda_1_17Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_17.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_17Layout = new javax.swing.GroupLayout(
				celda_0_17);
		celda_0_17.setLayout(celda_0_17Layout);
		celda_0_17Layout.setHorizontalGroup(celda_0_17Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_17Layout.setVerticalGroup(celda_0_17Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_17.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_17Layout = new javax.swing.GroupLayout(
				celda_3_17);
		celda_3_17.setLayout(celda_3_17Layout);
		celda_3_17Layout.setHorizontalGroup(celda_3_17Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_17Layout.setVerticalGroup(celda_3_17Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_18.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_18Layout = new javax.swing.GroupLayout(
				celda_8_18);
		celda_8_18.setLayout(celda_8_18Layout);
		celda_8_18Layout.setHorizontalGroup(celda_8_18Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_18Layout.setVerticalGroup(celda_8_18Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_18.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_18Layout = new javax.swing.GroupLayout(
				celda_7_18);
		celda_7_18.setLayout(celda_7_18Layout);
		celda_7_18Layout.setHorizontalGroup(celda_7_18Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_18Layout.setVerticalGroup(celda_7_18Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_18.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_18Layout = new javax.swing.GroupLayout(
				celda_6_18);
		celda_6_18.setLayout(celda_6_18Layout);
		celda_6_18Layout.setHorizontalGroup(celda_6_18Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_18Layout.setVerticalGroup(celda_6_18Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_18.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_18Layout = new javax.swing.GroupLayout(
				celda_2_18);
		celda_2_18.setLayout(celda_2_18Layout);
		celda_2_18Layout.setHorizontalGroup(celda_2_18Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_18Layout.setVerticalGroup(celda_2_18Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_18.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_18Layout = new javax.swing.GroupLayout(
				celda_9_18);
		celda_9_18.setLayout(celda_9_18Layout);
		celda_9_18Layout.setHorizontalGroup(celda_9_18Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_18Layout.setVerticalGroup(celda_9_18Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_18.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_18Layout = new javax.swing.GroupLayout(
				celda_4_18);
		celda_4_18.setLayout(celda_4_18Layout);
		celda_4_18Layout.setHorizontalGroup(celda_4_18Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_18Layout.setVerticalGroup(celda_4_18Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_18.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_18Layout = new javax.swing.GroupLayout(
				celda_5_18);
		celda_5_18.setLayout(celda_5_18Layout);
		celda_5_18Layout.setHorizontalGroup(celda_5_18Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_18Layout.setVerticalGroup(celda_5_18Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_18.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_18Layout = new javax.swing.GroupLayout(
				celda_1_18);
		celda_1_18.setLayout(celda_1_18Layout);
		celda_1_18Layout.setHorizontalGroup(celda_1_18Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_18Layout.setVerticalGroup(celda_1_18Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_18.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_18Layout = new javax.swing.GroupLayout(
				celda_0_18);
		celda_0_18.setLayout(celda_0_18Layout);
		celda_0_18Layout.setHorizontalGroup(celda_0_18Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_18Layout.setVerticalGroup(celda_0_18Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_18.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_18Layout = new javax.swing.GroupLayout(
				celda_3_18);
		celda_3_18.setLayout(celda_3_18Layout);
		celda_3_18Layout.setHorizontalGroup(celda_3_18Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_18Layout.setVerticalGroup(celda_3_18Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_1_19.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_1_19Layout = new javax.swing.GroupLayout(
				celda_1_19);
		celda_1_19.setLayout(celda_1_19Layout);
		celda_1_19Layout.setHorizontalGroup(celda_1_19Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_1_19Layout.setVerticalGroup(celda_1_19Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_8_19.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_8_19Layout = new javax.swing.GroupLayout(
				celda_8_19);
		celda_8_19.setLayout(celda_8_19Layout);
		celda_8_19Layout.setHorizontalGroup(celda_8_19Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_8_19Layout.setVerticalGroup(celda_8_19Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_9_19.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_9_19Layout = new javax.swing.GroupLayout(
				celda_9_19);
		celda_9_19.setLayout(celda_9_19Layout);
		celda_9_19Layout.setHorizontalGroup(celda_9_19Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_9_19Layout.setVerticalGroup(celda_9_19Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_4_19.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_4_19Layout = new javax.swing.GroupLayout(
				celda_4_19);
		celda_4_19.setLayout(celda_4_19Layout);
		celda_4_19Layout.setHorizontalGroup(celda_4_19Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_4_19Layout.setVerticalGroup(celda_4_19Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_5_19.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_5_19Layout = new javax.swing.GroupLayout(
				celda_5_19);
		celda_5_19.setLayout(celda_5_19Layout);
		celda_5_19Layout.setHorizontalGroup(celda_5_19Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_5_19Layout.setVerticalGroup(celda_5_19Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_0_19.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_0_19Layout = new javax.swing.GroupLayout(
				celda_0_19);
		celda_0_19.setLayout(celda_0_19Layout);
		celda_0_19Layout.setHorizontalGroup(celda_0_19Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_0_19Layout.setVerticalGroup(celda_0_19Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_3_19.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_3_19Layout = new javax.swing.GroupLayout(
				celda_3_19);
		celda_3_19.setLayout(celda_3_19Layout);
		celda_3_19Layout.setHorizontalGroup(celda_3_19Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_3_19Layout.setVerticalGroup(celda_3_19Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_2_19.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_2_19Layout = new javax.swing.GroupLayout(
				celda_2_19);
		celda_2_19.setLayout(celda_2_19Layout);
		celda_2_19Layout.setHorizontalGroup(celda_2_19Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_2_19Layout.setVerticalGroup(celda_2_19Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_7_19.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_7_19Layout = new javax.swing.GroupLayout(
				celda_7_19);
		celda_7_19.setLayout(celda_7_19Layout);
		celda_7_19Layout.setHorizontalGroup(celda_7_19Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_7_19Layout.setVerticalGroup(celda_7_19Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		celda_6_19.setBackground(new java.awt.Color(0, 10, 40));

		javax.swing.GroupLayout celda_6_19Layout = new javax.swing.GroupLayout(
				celda_6_19);
		celda_6_19.setLayout(celda_6_19Layout);
		celda_6_19Layout.setHorizontalGroup(celda_6_19Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 15, Short.MAX_VALUE));
		celda_6_19Layout.setVerticalGroup(celda_6_19Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 15,
				Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jScrollPane1)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_m1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_m1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_m1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_m1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_m1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_m1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_m1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_m1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_m1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_m1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_m2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_m2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_m2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_m2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_m2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_m2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_m2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_m2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_m2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_m2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_0,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_0,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_0,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_0,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_0,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_0,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_0,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_0,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_0,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_0,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_4,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_6,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_7,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_7,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_7,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_7,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_7,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_7,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_7,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_7,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_7,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_7,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_8,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_8,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_8,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_8,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_8,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_8,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_8,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_8,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_8,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_8,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_9,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_9,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_9,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_9,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_9,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_9,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_9,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_9,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_9,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_9,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_10,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_10,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_10,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_10,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_10,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_10,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_10,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_10,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_10,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_10,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_11,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_11,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_11,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_11,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_11,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_11,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_11,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_11,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_11,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_11,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_12,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_12,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_12,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_12,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_12,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_12,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_12,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_12,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_12,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_12,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_14,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_14,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_14,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_14,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_14,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_14,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_14,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_14,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_14,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_14,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_15,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_15,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_15,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_15,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_15,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_15,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_15,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_15,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_15,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_15,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_16,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_16,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_16,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_16,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_16,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_16,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_16,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_16,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_16,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_16,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_17,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_17,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_17,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_17,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_17,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_17,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_17,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_17,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_17,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_17,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_18,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_18,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_18,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_18,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_18,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_18,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_18,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_18,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_18,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_18,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										celda_0_19,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_1_19,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_2_19,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_3_19,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_4_19,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_5_19,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_6_19,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_7_19,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_8_19,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										celda_9_19,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jPanel2,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jPanel1,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		B_Stop,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		60,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		B_Step)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jPanel2,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						celda_0_m2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						celda_1_m2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						celda_2_m2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						celda_3_m2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						celda_4_m2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						celda_5_m2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						celda_6_m2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						celda_7_m2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						celda_8_m2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						celda_9_m2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_m1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_m1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_m1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_m1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_m1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_m1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_m1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_m1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_m1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_m1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_0,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_0,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_0,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_0,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_0,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_0,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_0,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_0,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_0,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_0,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_9,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_9,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_9,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_9,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_9,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_9,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_9,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_9,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_9,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_9,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_10,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_10,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_10,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_10,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_10,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_10,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_10,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_10,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_10,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_10,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_11,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_11,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_11,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_11,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_11,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_11,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_11,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_11,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_11,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_11,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_12,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_12,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_12,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_12,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_12,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_12,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_12,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_12,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_12,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_12,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_13,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_13,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_13,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_13,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_13,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_13,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_13,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_13,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_13,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_13,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_14,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_14,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_14,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_14,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_14,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_14,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_14,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_14,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_14,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_14,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_15,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_15,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_15,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_15,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_15,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_15,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_15,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_15,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_15,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_15,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_16,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_16,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_16,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_16,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_16,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_16,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_16,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_16,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_16,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_16,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_17,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_17,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_17,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_17,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_17,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_17,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_17,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_17,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_17,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_17,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_18,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_18,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_18,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_18,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_18,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_18,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_18,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_18,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_18,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_18,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						celda_0_19,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_1_19,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_2_19,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_3_19,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_4_19,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_5_19,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_6_19,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_7_19,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_8_19,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						celda_9_19,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(0,
																		0,
																		Short.MAX_VALUE)))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		B_Step)
																.addComponent(
																		B_Stop)))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										139,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		jPanel2.getAccessibleContext().setAccessibleName("");
		B_Step.getAccessibleContext().setAccessibleName("B_Step");
		B_Stop.getAccessibleContext().setAccessibleName("B_Stop");
		celda_0_m1.getAccessibleContext().setAccessibleName("");
		celda_1_m1.getAccessibleContext().setAccessibleName("Casilla_m1_0");
		pack();
	}// </editor-fold>
}
