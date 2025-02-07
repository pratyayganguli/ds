package org.example.datastructures.queue;


/**
 * 
 * Queue follows first in first our policy. Functions to be implemented enqueue and dequeue
 * ::: Queue :::
 *
 *   1, 2, 3, 4, 5, 6, 7
 *
 *   4 -> ..., 7, 4
 *
 * * @author Pratyay
 */

class Node<T> {
    T data;
    Node next;

    /**
     * 
     * @param data
     */
    Node(T data) {
        this.data = data;
    }
}

class Queue<T> {
    private Node head;
    private Node tail;


    // insert at the tail;

    void enqueue(T data) {
        if(head == null) {
            head = new Node(data);
            tail = head;
            head.next = tail;
            
        } else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
        }
        System.out.println("First in the queue " + head.data + " Last in the queue " + tail.data);
    }

    void dequeue() {
        if(head == null) {
            System.out.println("No elements in the queue!");
        } else {
            System.out.println(head.data + " exited from the queue");
            head = head.next;
        }
    }
}

class Executor {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(69);
        queue.enqueue(96);
        queue.enqueue(52);
        queue.enqueue(39);
        queue.enqueue(0);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
