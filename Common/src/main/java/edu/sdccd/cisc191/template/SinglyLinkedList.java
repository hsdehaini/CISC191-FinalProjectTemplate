package edu.sdccd.cisc191.template;


class SinglyLinkedList<T>{
    class Node{
        T data;
        Node next;
    }
    /**
     * recursively finds k-th node, deletes, and returns new head
     *
     * @param head the node to start at
     * @param k the kth element to remove (first element at 0)
     * @return the new head node with the kth element removed
     */
    public Node remove(Node head, int k){
        if (k < 0) return head;
        if (head == null) return null;

        if (k == 0){
            Node remove = head.next;
            return remove;
        }
        head.next = remove(head.next, k-1);
        return head;
    }
    /**
     *  inserts node at the beginning of the list
     * @param head the node to start at
     * @param newData data to insert into the list
     * @return the new head node containing new_data followed with the rest of the
    linked list
     */
    public Node push(Node head, T newData){
        Node nextNode = new Node();
        nextNode.data = newData;
        nextNode.next = head;
        head = nextNode;

        return head;
    }
    /**
     * recursively prints list starting from head
     * @param head the node to start at
     * @return a space separated string containing the data of each node starting
    from the head to the tail, end with a trailing space
     */
    public String toString(Node head){

        String tst = "";

        while (head!=null){
            tst += (head.data + " " );
            head = head.next;
        }
        return tst;
    }
}
