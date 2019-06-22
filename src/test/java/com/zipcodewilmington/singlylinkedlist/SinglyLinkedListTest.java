package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest() {
        // given
        SinglyLinkedList<String> MyList = new SinglyLinkedList<String>();

        // when
        MyList.addFirst("element 1");
        MyList.addFirst("element 2");
        MyList.addFirst("element 3");

        boolean expected = false;

  //      assertEquals(MyList.isEmpty());
    }

    @Test
    public void removeTest() {
        // given
        SinglyLinkedList<String> MyList = new SinglyLinkedList<String>();

        // when
        MyList.addFirst("element 1");
        MyList.addFirst("element 2");
        MyList.addFirst("element 3");
        MyList.addLast("element 4");
        MyList.addLast("element 5");
        MyList.addLast("element 6");
        while (!MyList.isEmpty()) {
            MyList.removeFirst();
        }
    }

    @Test
    public void reverseTest() {
        // given
        SinglyLinkedList<String> MyList = new SinglyLinkedList<String>();

        // when
        MyList.addFirst("element 1");
        MyList.addFirst("element 2");
        MyList.addFirst("element 3");
        MyList.addFirst("element 4");
        MyList.reverseList();
    }

    @Test
    public void removeElementTest() {
        // given
        SinglyLinkedList<String> MyList = new SinglyLinkedList<String>();

        // when
        MyList.addFirst("element 1");
        MyList.addFirst("element 2");
        MyList.addFirst("element 3");
        MyList.addFirst("element 4");
        MyList.removeElement("element 4");
    }
}