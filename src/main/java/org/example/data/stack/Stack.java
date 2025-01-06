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

class Stack<T> {

    private Node head;
    private Node tail;

    /**
     *
     * @param data
     */
    void push(T data) {
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
    void pop() {
        if(head == null) {
            System.out.println("no elements in the stack!");
            return;
        } else {
            System.out.println("popping " + head.data);
            head = head.next;
        }
    }
}

class Executor {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("Arjun");
        names.push("Krishna");
        names.push("ram");
        names.pop();
        names.pop();
        names.pop();
    }
}
