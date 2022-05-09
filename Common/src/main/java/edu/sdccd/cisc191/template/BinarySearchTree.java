package edu.sdccd.cisc191.template;

public class BinarySearchTree {
    /**
     * Recursively finds the needle in the Binary Search Tree (BST) haystack
     * @param root which node to start searching from
     * @param needle the data to search for
     * @return the first BSTNode containing the needle, null if doesn't exist
     */
    public BSTNode contains(BSTNode root, String needle) {
        BSTNode retVal;
        if (root == null) {
            return null;
        }
        if (root.getData().equals(needle)) {
            return root;
        }
        if (root.getLeft() != null) {
            retVal = contains(root.getLeft(), needle);
            if (retVal != null && retVal.getData().equals(needle)) {
                return retVal;
            } else if (root.getRight() != null) {
                return contains(root.getRight(), needle);
            }
        }
        else if (root.getRight() != null) {
            return contains(root.getRight(), needle);
        }
        return null;
    }
    /**
     * Recursively converts a String array to Binary Search Tree (BST)
     * @param array the array of Strings to import into the BST
     * @param start index in the array to begin importing
     * @param end index in the array to stop importing
     * @return the root node of the generated BST
     */
    public BSTNode fromArray(String[] array, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        BSTNode node = new BSTNode(array[mid]);
        node.setLeft(fromArray(array, start, mid - 1));
        node.setRight(fromArray(array, mid + 1, end));
        return node;
    }
}