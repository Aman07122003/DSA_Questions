class Node {
    int data;
    Node next;

    Node node () {
        this.data = data;
        this.next = next;
    }
}
public class Stack {
    private Node top;

    public Stack () {
        this.top = null;
    }

    public void push(){
        Node newNode = new Node();
        newNode.next = top;
        top = newNode;
    }

    public void pop(){
        if(ifEmpty()){
            System.out.println("Stack is Empty");
        }
        int popped_element = top.data;
        top = top.next;
        return popped_element;
    }

    publis boolean isEmpty() {
        return top == null;
    }
 }

 public statio void main (String[] args) {
    Stack stack = new Stack();
    stack.push(7);
    stack.push(12);
    stack.push(6);
    stack.push(19);
    stack.pop();
}

