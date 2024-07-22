package Stacks;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class StackLinkedList {
    Node top;

    public StackLinkedList() {
        this.top = null;
    }

    // Check if it is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Implement a push method
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + value + " to the stack");
    }

    // Implement pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int poppedValue = top.value;
            top = top.next;
            System.out.println("Popped " + poppedValue + " from the stack");
            return poppedValue;
        }
    }

    // Implement peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        } else {
            return top.value;
        }
    }

    // Implement delete a stack
    public void deleteStack() {
        top = null;
        System.out.println("Stack has been deleted");
    }
}
