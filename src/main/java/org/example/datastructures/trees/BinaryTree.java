package org.example.datastructures.trees;

import java.util.Scanner;

/**
 *
 * 
 * Implementation of Binary Tree, it can be done using two ways
 * A. Linked Representation.
 * B. Sequential Representation (using Array) will be used for 
 * sequencial representation.
 *  
 */

class BinaryTree {
    
    private Node root;
    private Node currentNode;

    /**
     *
     * @param node
     */
    void insert(Node node) {
        if(root == null) {
            root = node;
            System.out.println("Do you want to insert left of " + root.data + "?");
            Scanner scanner = new Scanner(System.in);
            boolean leftInsertion = scanner.nextBoolean();

            if(leftInsertion) {
                insert(root.left); 
            }

            System.out.println("Do you want to insert right of " + root.data + "?");
            boolean rightInsertion = scanner.nextBoolean();
            if(rightInsertion) {
                insert(root.right);
            }
            currentNode = root;
        
        } else {
            System.out.println("Enter value:");
            Scanner scanner = new Scanner(System.in);
            int data = scanner.nextInt();

            currentNode = new Node(data);

            System.out.println("Do you want to insert left of " + currentNode.data + "?");
            boolean leftInsertion = scanner.nextBoolean();

            if(leftInsertion) {
                insert(currentNode.left); 
            }

            System.out.println("Do you want to insert right of " + currentNode.data + "?");
            boolean rightInsertion = scanner.nextBoolean();
            if(rightInsertion) {
                insert(currentNode.right);
            }
           
        }
    }

    Node search(int key) {
        return null;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class Executor {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(new Node(10));
    }
}
