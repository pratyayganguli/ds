package org.example.data.trees;

/**
 *
 * All the important theory notes regarding Binary Tree and Binary Search Tree.
 *
 * A question from the tree will be there in the interview.
 *
 * Trees will allow you to insert and search in o(log n) time complexity
 * Elements are stored in ordered way in a Binary Search Tree.
 *
 *    7
 *   / \
 *  4   11
 *
 * Cost Efficiency: Automatically it will size up based on the number of the elements you
 * wish to insert.
 *
 * Unbalanced binary tree: Now to find the element 23 the complexity will be O(n).
 *              10
 *                \
 *                 15
 *                  \
 *                   20
 *                    \
 *                     23
 *
 * Solution: Balancing the tree. Self balanced Binary Tree (Advanced concept)
 * for e.g. AVL tree.
 *
 * If you are taking sorted data then binary tree is inefficient.
 *
 * Tree is a directed acyclic Graph
 *
 * Binary Trees Properties:
 * 1. Size of the tree is the total number of nodes.
 * 2. A binary tree can have at most 2 children.
 * 3. Siblings: Any two nodes has the same parent.
 * 4. Height: Max number of edges between two nodes.
 * 5. Level: difference of the between the root node and the height of the node, root level is
 * always 0.
 * 6.Ancestor and Descendent: If there is a path between Node a to 
 * Node c then a is the ancestor or c.
 *
 *
 * Types of Binary Tree:
 * 1. Complete Binary Tree: All the levels are filled apart from the
 * last level but the last level is full from left to right.
 * 
 *                  8
 *                 / \
 *                1   23
 *               / \
 *              11  0
 * 
 * 2. Full or Strict Binary Tree: Each node has either zero or two childen.
 *              2
 *             / \ 
 *            1   3
 * 
 * The previous diagram is also a Full binary tree. Use case: Hoffman 
 * coding.
 * 
 * 3. Perfect Binary Tree: All the internal nodes has two children and
 * all the leaf nodes are on the same level.
 * 
 *               5
 *             /   \
 *            1     6
 *           / \   / \ 
 *          0   3 1   13
 * 
 * 4. Height balanced binary tree: Average height of binary tree is O(logn)
 * 
 * 5. Skewed binary tree: Every node has one child. Max height O(n)
 * Just like Linked List
 * 
 * 6. Ordered Binary Tree: Every Node has some properties that it follows
 * e.g. Binary Search Tree
 * 
 * 
 * Properties:
 * A. Total number of nodes in a perfect binary tree is (2^h-+1) - 1
 * B. Total number of leaf nodes in the perfect binary tree is 2^h
 * C. If you have n number of leaves in the binary tree at least how many
 * leves you will have? log(n) + 1
 * D. If you have a full binary tree total number of internal nodes is
 * n-1.
 * 
 */