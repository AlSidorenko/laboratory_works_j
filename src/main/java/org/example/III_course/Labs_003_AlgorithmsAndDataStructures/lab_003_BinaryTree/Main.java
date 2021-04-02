package org.example.III_course.Labs_003_AlgorithmsAndDataStructures.lab_003_BinaryTree;

import java.io.IOException;

/**
 * Created on 23.03.2021 13:25.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Tree tree = new Tree();
        int[] arr = new ArrayCreation().array();
        tree.root = tree.insertLevelOrder(arr, tree.root, 0);
        System.out.print("InOdder: ");
        tree.inOrder(tree.root);
        System.out.print("\nPostOrder: ");
        tree.postOrder(tree.root);
        System.out.print("\nPreOrder: ");
        tree.preOrder(tree.root);
        System.out.printf("\nSum: %d\n", tree.addBT(tree.root));
    }
}

