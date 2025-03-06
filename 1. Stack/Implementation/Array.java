/*
* Stack implementation using array
*       - push() method
*       - pop() method
*       - isEmpty() method
*       - getTop() method
*       - getSize() method
*       Important corner cases: overflow and underflow  */

import java.util.*;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;
}

public Stack(int size) {
    arr[] = new int[size];
    capacity = size;
    top = -1;
}

public void push(int item) {
    if(isFull()) {
        System.out.println("Stack Overflow!");
    }
    arr[++top] = item;
}

public int pop() {
    if(isEmpty()) {
        System.out.println("Stack is Empty!");
        return -1;
    }
    return arr[top--];
}

public int peek() {
    if(isEmpty()) {
        System.out.println("Stack is Empty!");
        return -1;
    }
    arr[top]);
}

public boolean isFull() {
    return top == capacity - 1;
}

public boolean isEmpty() {
    return top == -1;
}

public int size() {
    return top + 1;
}

public static void main(String[] args) {
    Stack stack = new Stack(5);

    stack.push(10);
    stack.push(18);
    stack.push(22);
    stack.push(80);
    stack.pop();
    System.out.println("Top element: " + stack.peek());

}
