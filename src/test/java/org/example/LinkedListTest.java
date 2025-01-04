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
}