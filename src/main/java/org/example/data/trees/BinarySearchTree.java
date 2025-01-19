package org.example.data.trees;


import java.util.Scanner;

class BSTNode {
    private int data;
    private BSTNode left;
    private BSTNode right;

    BSTNode(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
}


class BinarySearchTree {

    private BSTNode root;

    private BSTNode currentNode;


    BSTNode insert(int data, Scanner scanner) {
        if(root == null) {
            System.out.println("No elements in the node!, inserting root element");
            root = new BSTNode(data);
            currentNode = root;
            return currentNode;
        } else {
            if(data < currentNode.getData()) {
                BSTNode node = new BSTNode(data);
                currentNode.setLeft(node);
                currentNode = node;
                return currentNode;
            }
            BSTNode node = new BSTNode(data);
            currentNode.setRight(node);
            currentNode = node;
            return currentNode;
        }
    }
}

class BinarySearchTreeExecutor {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        var node1 = bst.insert(10, scanner);
        var node2 = bst.insert(20, scanner);
        var node3 = bst.insert(30, scanner);
        
    }

}
