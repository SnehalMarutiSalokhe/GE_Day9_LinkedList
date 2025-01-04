package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderedLinkedListTest {
    @Test
    public void testAddNodesInAscendingOrder() {
        OrderedLinkedList<Integer> list = new OrderedLinkedList<>();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        assertEquals(4, list.size());
        assertEquals(0, list.index(30));
        assertEquals(1, list.index(40));
        assertEquals(2, list.index(56));
        assertEquals(3, list.index(70));
    }

    @Test
    public void testSearchNode() {
        OrderedLinkedList<Integer> list = new OrderedLinkedList<>();
        list.add(56);
        list.add(30);
        list.add(40);

        assertTrue(list.search(30));
        assertFalse(list.search(100));
    }

    @Test
    public void testRemoveNode() {
        OrderedLinkedList<Integer> list = new OrderedLinkedList<>();
        list.add(56);
        list.add(30);
        list.add(40);

        list.remove(40);
        assertEquals(2, list.size());
        assertFalse(list.search(40));
    }

    @Test
    public void testPopNode() {
        OrderedLinkedList<Integer> list = new OrderedLinkedList<>();
        list.add(56);
        list.add(30);
        list.add(40);

        Integer lastNode = list.pop();
        assertEquals(56, lastNode);
        assertEquals(2, list.size());
    }
}