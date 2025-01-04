package org.example;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void testSearchNodeWithValue30() {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(56);
        list.append(30);
        list.append(70);

        assertTrue(list.search(30));
        assertFalse(list.search(100));
    }
    @Test
    public void testInsertAfter() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);

        list.insertAfter(30, 40);

        assertTrue(list.search(40));
    }


}