package tetris.ai;

public class State {
  public int x;
  public int y;
  public int rotation;
  public int visited;
  public State predecessor; 
  public State next;
  
  public State(int x, int y, int rotation) {
    this.x = x;
    this.y = y;
    this.rotation = rotation;
  }
  
  public String toString(){
	  String t = "Estado: ";
	  t+="x:"+x+" y:"+y+" rotation:"+rotation+" visited:"+visited;
	  //if(predecessor != null){ t+="\npredecessor:"+predecessor.toString();}
	  if(next != null){t+="next"+next.toString();}
	  return t;
  }
}
