package org.example.data.stack;


/**
 * *
 *
 * Stack follows last in first out principle.
 * * @author Pratyay
 *
 * todo: take a break after 2.5 hours
 */

class Node<T> {
    T data;
    Node next;

    Node(T data){
        this.data = data;
    }
}

public class Stack<T> {

    private Node head;

    /**
     *
     * @param data
     */
    public void push(T data) {
        if(head == null) {
            System.out.println("no elements in the stack!");
            head = new Node(data);
        } else {
            Node node = new Node(data);
            node.next = head;
            head = node;
        }
        System.out.println("top element in the stack: " + head.data);
    }


    // popping the top most element, i.e. changing the reference of the head.
    public void pop() {
        if(head == null) {
            System.out.println("no elements in the stack!");
            return;
        } else {
            System.out.println("popping " + head.data);
            head = head.next;
        }
    }

    public Object peek() {
        if(head != null) {
            return head.data;
        }
        return null;
    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }
}

class Executor {
    public static void main(String[] args) {
        java.util.Stack stack = new java.util.Stack();
        Stack<String> names = new Stack<>();
        names.push("Arjun");
        names.push("Krishna");
        names.push("ram");
        names.pop();
        names.pop();
        names.pop();
    }
}
