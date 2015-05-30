package tetris.ai;

public class Queue {

  private State head;
  private State tail;
  
  public void enqueue(State state) {
    if (head == null) {
      head = state;
      tail = state;        
    } else {
      tail.next = state;
      tail = state;        
    }
    state.next = null;
  }

  public State dequeue() {
    State state = head;
    if (head != null) {
      if (head == tail) {
        head = null;
        tail = null;
      } else {
        head = head.next;
      }
    }
    return state;
  }

  public boolean isEmpty() { 
    return head == null;
  }

  public boolean isNotEmpty() { 
    return head != null;
  }  
  
  public String toString(){
      String s = "Estados de la Cola\n";
      if(head == null){
          return s+"Cola Vacia";
      }
      State cur = head;
      s+=cur.toString();
      while (cur.next !=  null){
            cur = cur.next;
            s+=cur.toString();
      }
      return s;
  }
}
