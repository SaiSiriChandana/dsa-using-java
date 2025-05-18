class stack{
  private class Node{
    int data;
    Node next;
    Node(int d){
      data = d;
      next = null;
    }
  }
  Node top;
  int size;
  stack(){
    this.top=null;
    this.size=0;
  }
  public void stackPush(int x) {
    Node element = new Node(x);
    element.next = top;
    top = element;
    System.out.println("Element pushed");
    size++;
  }
  public int stackPop() {
    if (top == null) return -1;
    int topData = top.data;
    Node temp = top;
    top = top.next;
    return topData;
  }
  public int stackSize() {
    return size;
  }
  public boolean stackIsEmpty() {
    return top == null;
  }
  public void printStack() {
    Node current = top;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }
}
class Main {
  public static void main(String args[]) {
    stack s = new stack();
    s.stackPush(10);
    s.stackPush(20);
    s.printStack();
    System.out.println("Element popped " + s.stackPop());
    System.out.println("Stack size: " + s.stackSize());
    System.out.println("Stack is empty or not: " + s.stackIsEmpty());

  }
}
