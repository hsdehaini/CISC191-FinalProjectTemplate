
package edu.sdccd.cisc191.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinglyLinkedListTest {
    @Test
    public void testPushAndRemove() {
        edu.sdccd.cisc191.template.SinglyLinkedList<Integer> sll = new edu.sdccd.cisc191.template.SinglyLinkedList<>();
        edu.sdccd.cisc191.template.SinglyLinkedList.Node head = sll.push(null, 0);
        head = sll.push(head, 1);
        head = sll.push(head, 2);
        head = sll.push(head, 3);
        head = sll.push(head, 4);
        assertEquals( sll.toString(head), "4 3 2 1 0 ");

        head = sll.remove(head, 3);
        assertEquals( sll.toString(head), "4 3 2 0 ");
    }
}