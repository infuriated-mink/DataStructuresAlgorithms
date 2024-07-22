package Stacks;

public class Main {
    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        System.out.println("---- StackArrays Operations ----");
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        System.out.println("Peek: " + stackArrays.peek());
        stackArrays.pop();
        stackArrays.pop();
        stackArrays.pop();
        stackArrays.pop();
        System.out.println("Is Palindrome 'racecar': " + StackArrays.isPalindrome("racecar"));
        System.out.println("Is Palindrome 'hello': " + StackArrays.isPalindrome("hello"));
        stackArrays.deleteStack();

        StackLinkedList stackLinkedList = new StackLinkedList();
        System.out.println("\n---- StackLinkedList Operations ----");
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        System.out.println("Peek: " + stackLinkedList.peek());
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.deleteStack();
    }
}
