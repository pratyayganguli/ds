package org.example.data.trees;


import java.util.Scanner;

/**
 * *
 * * @author Pratyay
 */

// not making the tree a generic one...

class BSTNode {
    int data;
    BSTNode left;
    BSTNode right;

    BSTNode(int data) {
        this.data = data;
    }
}

class BST {

    private BSTNode root;

    // write the recursive logic of this code...
    BSTNode insert(Scanner scanner, BSTNode node) {
        if(root == null) {
            System.out.println("enter the element: ");
            int data = scanner.nextInt();
            System.out.println("root node is initialized");
            node = new BSTNode(data);
            root = node;
            return insert(scanner, root);
        } else {
            System.out.println("enter right of " + node.data);
            var insertRight = scanner.nextBoolean();
            if(insertRight) {
                System.out.println("enter data: ");
                int data = scanner.nextInt();
                BSTNode newNode = new BSTNode(data);
                node.right = newNode;
                node = newNode;
                return insert(scanner, node);
            } else {
                System.out.println("entering left of " + node.data);
                System.out.println("enter data: ");
                int data = scanner.nextInt();
                BSTNode newNode = new BSTNode(data);
                node.right = newNode;
                node = newNode;
                return insert(scanner, node);
            }
        }
    }
}

class BSTExecutor {
    public static void main(String[] args) {
        BST bst = new BST();
        // initializing the scanner object
        Scanner scanner = new Scanner(System.in);
        bst.insert(scanner, null);
    }
}
