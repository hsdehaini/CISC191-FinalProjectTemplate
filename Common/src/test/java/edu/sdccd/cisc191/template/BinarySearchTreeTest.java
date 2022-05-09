
package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    BinarySearchTree bst = new BinarySearchTree();
    String[] arr = {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot"};
    BSTNode root;

    @BeforeEach
    void setUp() throws Exception {
        root = bst.fromArray(arr, 0, arr.length - 1);
    }

    @Test
    void testContains() {
        BSTNode node = bst.contains(root, "delta");
        Assertions.assertTrue(node instanceof BSTNode);
        BSTNode nullNode = bst.contains(root, "zulu");
        Assertions.assertNull(nullNode);
    }

    @Test
    void testCreateBST() {
        Assertions.assertEquals("charlie", root.getData());
    }
}