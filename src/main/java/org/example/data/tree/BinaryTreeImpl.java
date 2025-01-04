package org.example.data.tree;

import java.util.Scanner;

/**
 * 
 * This is where you will be testing out recursion ...
 */

class Node {
    int data;
    Node left;
    Node right;

    // constructor ...
    // not making it generic now
    public Node(int data) {
        this.data = data;
    }
}

class BinaryTreeImpl {

    Node root;
    Node currentNode;

    public Node insert(Node data) {
        if(root == null) {
            System.out.println("tree is empty");
            root = data;
            currentNode = root;
            return root;
        } else {
            System.out.println("Enter 'r' for right and 'l' for left of " + currentNode.data);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            scanner.close();
            switch(input) {
                case "r" : {
                    currentNode.right = data;
                    break;
                }
                case "l": {
                    currentNode.left = data;
                    break;
                }
                default: {
                    System.out.println("invalid input");
                }
            }
            return currentNode;
        }
    }
}

class BinaryTreeExecutor {

    public static void main(String [] args) {
        BinaryTreeImpl bTreeImpl = new BinaryTreeImpl();
        Node root = new Node(10);
        Node temp1 = bTreeImpl.insert(new Node(20));
        Node temp2 = bTreeImpl.insert(new Node(30));
        Node temp3 = bTreeImpl.insert(new Node(40));
    }
}

