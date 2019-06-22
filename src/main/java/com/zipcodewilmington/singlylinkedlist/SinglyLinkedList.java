package com.zipcodewilmington.singlylinkedlist;

import java.util.ArrayList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList <T>{

    private class Node{
        private T element;
        private Node nextNode;  //pointer

        //constructor
        public Node(T element){
            this.element = element;
            this.nextNode = null;
        }

        public T getElement(){
            return element;
        }

        public void setElement(T element){
            this.element = element;
        }

        public Node getNextNode(){
            return nextNode;
        }

        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }
    }

    //List Implementation
    Node head;

    public SinglyLinkedList() { }

    public SinglyLinkedList(T element) {
        this.head = new Node(element);
    }

    public void add(T element) {
        Node currentNode = head;
        while(currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        Node newNode = new Node(element);
        currentNode.setNextNode(newNode);
    }

    public Object get(int index) {
        Node currentNode = getNodeAtIndex(index);
        return currentNode.getElement();
    }

    public int size() {
        Node currentNode = head;
        int currentSize = 0;
        do {currentNode = currentNode.getNextNode();
            currentSize++;
        } while(currentNode.getNextNode() != null);
        return currentSize;
    }

    public void remove(int index) {
        Node currentNode = getNodeAtIndex(index);;
        currentNode.setElement(null);
    }

    private Node getNodeAtIndex(int index) {
        Node currentNode = head;
        int currentIndex = 0;
        while (currentIndex < index) {
            currentNode = currentNode.getNextNode();
            currentIndex ++;
        }
        return currentNode;
    }

    public boolean contains(T element) {
        if(findElement(element) != -1) {
            return true;
        }
        return false;
    }

    public int findElement(T element) {
        Node currentNode = head;
        int currentIndex = 0;
        do {
            if(currentNode.getElement() == element) {
                return currentIndex;
            } else {
                currentNode = currentNode.getNextNode();
                currentIndex++;
            }
        } while(currentNode != null);
        return -1;
    }


}



