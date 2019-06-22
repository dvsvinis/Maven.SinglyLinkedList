package com.zipcodewilmington.singlylinkedlist;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void constructorTest() {
        //Given
        String element = "element 1";
        //When
        SinglyLinkedList myList = new SinglyLinkedList(element);
        //Then
        assertTrue(myList instanceof SinglyLinkedList);
        assertNotNull(myList.head);
    }


    @Test
    public void addTest() {
        //Given
        String element = "element 1";
        SinglyLinkedList myList = new SinglyLinkedList(element);
        //When
        myList.add(element);
        //Then
        assertEquals(1, myList.size());
    }

    @Test
    public void sizeTest() {
        //Given
        String element = "element 1";
        SinglyLinkedList myList = new SinglyLinkedList(element);
        //When
        myList.add(element);
        //Then
        assertEquals(1, myList.size());
    }


    @Test
    public void containsTest1() {
        //Given
        String element1 = "element1";
        String element2 = "element2";
        SinglyLinkedList myList = new SinglyLinkedList(element1);
        myList.add(element1);
        myList.add(element2);
        //When
        boolean containsTest = myList.contains(element2);
        //Then
        assertTrue(containsTest);
    }

    @Test
    public void containsTest2() {
        //Given
        String element1 = "element1";
        String element2 = "element2";
        String element3 = "element3";
        SinglyLinkedList myList = new SinglyLinkedList(element1);
        myList.add(element3);
        //When
        boolean containsTest = myList.contains(element2);
        //Then
        assertFalse(containsTest);
    }

    @Test
    public void getTest() {
        //Given
        String element1 = "element1";
        String element2 = "element2";
        String element3 = "element3";
        SinglyLinkedList myList = new SinglyLinkedList(element1);
        myList.add(element1);
        myList.add(element2);
        myList.add(element3);
        //When
        Object result = myList.get(2);
        System.out.println(result);
        //Then
        assertEquals(element2, result);
    }


}