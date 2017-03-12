package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals; // импорт статического класса для проверки

public class SortedListTest {
    /**
     * проверка метода isEmpty()
     */
    @Test
    public void testIsEmpty() {
        SortedList sortedList = new SortedList();
        sortedList.insert(10);
        sortedList.remove();
        assertEquals(true, sortedList.isEmpty());
    }//end testIsEmpty()

    /**
     * проверка вставки
     */
    @Test
    public void testInsert() {
        SortedList sortedList = new SortedList();
        sortedList.insert(10);
        assertEquals(10,sortedList.remove().dData);

    }//end testInsert()

    /**
     * проверка удаления
     */
    @Test
    public void testRemove() {
        SortedList sortedList = new SortedList();
        sortedList.insert(25);
        sortedList.insert(15);
        assertEquals(15,sortedList.remove().dData);

    }//end testRemove()
    

}//end class SortedListTest