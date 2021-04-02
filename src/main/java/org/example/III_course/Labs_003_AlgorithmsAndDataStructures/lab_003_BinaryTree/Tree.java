package org.example.III_course.Labs_003_AlgorithmsAndDataStructures.lab_003_BinaryTree;

/**
 * Created on 23.03.2021 12:05.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Tree {

    Node root;

    // Function to insert nodes in level order
    public Node insertLevelOrder(int[] arr, Node root, int i) {
        // Base case for recursion
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }

    // Function to print tree nodes in InOrder fashion
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void postOrder(Node node) {
        if (node == null) {
            return;
        }

        // first recur on left subtree
        postOrder(node.left);

        // then recur on right subtree
        postOrder(node.right);

        // now deal with the node
        System.out.print(node.data + " ");
    }

    /* Given a binary tree, print its nodes in preorder*/
    void preOrder(Node node) {
        if (node == null) {
            return;
        }

        /* first print data of node */
        System.out.print(node.data + " ");

        /* then recur on left sutree */
        preOrder(node.left);

        /* now recur on right subtree */
        preOrder(node.right);
    }

    int addBT(Node root) {
        if (root == null) {
            return 0;
        }

        return (root.data + addBT(root.left) + addBT(root.right));
    }
}
