package org.example.neetcode.stack_questions;


/**
 * *
 * * @author Pratyay
 */

class Node {
    private int data;
    Node next;

    Node() {
        // empty constructor
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}


class MinStack {
    private Node head;
    private Node minNode;

    public MinStack() {
    }

    public void push(int data) {
        if(head != null) {
            Node node = new Node();
            node.setData(data);
            node.next = head;
            head = node;
        } else {
            minNode = new Node();
            head = new Node();
            head.setData(data);
            minNode.setData(data);
        }

        if(data < minNode.getData()) {
            minNode.setData(data);
        }
    }

    public void pop() {
        if(head == null) {
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }

        if(minNode.getData() == head.getData()) {
            Node temp = head.next;
            minNode.setData(temp.getData());
            while(temp != null) {
                if(temp.getData() < minNode.getData()) {
                    minNode.setData(temp.getData());
                }
                temp = temp.next;
            }
        }
        head = head.next;
    }

    public int top() {
        return head.getData();
    }

    public int getMin() {
        return minNode.getData();
    }
}

class Executor {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(0);
        int data1 = minStack.getMin();
        minStack.pop();
        int top = minStack.top();
        int data2 = minStack.getMin();
        System.out.println("debug!");
    }
}
