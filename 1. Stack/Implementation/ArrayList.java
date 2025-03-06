import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack;
    private int top;

    public Stack() {
        stack = new ArrayList<>();
        top = -1;
    }

    public void push(int item){
        stack.add(item);
        top++;
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        stack.remove(top);
        top--;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack.get(top);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        return stack.toString();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(8);
        stack.push(10);
        stack.push(18);
        stack.push(20);
        System.out.println("Top element of Stack" + stack.peek());
        stack.pop();
        System.out.println("Stack = " + stack);
    }
}

