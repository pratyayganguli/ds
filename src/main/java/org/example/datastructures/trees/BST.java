package org.example.datastructures.trees;


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
    BSTNode prev;

    BSTNode(int data) {
        this.data = data;
    }
}

class BST {

    private BSTNode root;

    BSTNode insert(Scanner scanner, BSTNode node) {
        if(root == null) {
            System.out.print("enter root value: ");
            int data = scanner.nextInt();
            root = new BSTNode(data);
            node = root;
            return insert(scanner, node);
        }
        if(node.left == null) {
            System.out.print("do you want to insert left of " + node.data + ": ");
            boolean insertLeft = scanner.nextBoolean();
            if (insertLeft) {
                return insertLeft(scanner, node);
            }
        }
        if(node.right == null) {
            System.out.print("do you want to insert right of " + node.data + ": ");
            boolean insertRight = scanner.nextBoolean();
            if (insertRight) {
                return insertRight(scanner, node);
            }
        }

        if(node.prev == null) {
            return node;
        }

        return insert(scanner, node.prev);
    }

    private BSTNode insertLeft(Scanner scanner, BSTNode node) {
        System.out.print("enter data: ");
        int data = scanner.nextInt();
        var tempNode = new BSTNode(data);
        tempNode.prev = node;
        node.left = tempNode;
        node = tempNode;
        return insert(scanner, node);
    }

    private BSTNode insertRight(Scanner scanner, BSTNode node) {
        System.out.print("enter data: ");
        int data = scanner.nextInt();
        var tempNode = new BSTNode(data);
        tempNode.prev = node;
        node.right = tempNode;
        node = tempNode;
        return insert(scanner, node);
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
