package com.zipcodewilmington.singlylinkedlist;

import java.util.ArrayList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList <T>{

    private static class Node<T>{
        private T element;
        private Node<T> next;  //pointer

        //constructor
        public Node(T element, Node<T> next){
            element = element;
            next = next;
        }

        public T getElement(){
            return element;
        }

        public Node<T> getNext(){
            return next;
        }

        public void setNext(Node<T> next){
            next = next;
        }
    }

    //List Implementation
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public SinglyLinkedList(){};

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T first(){
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }

    public T last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }


    public void addFirst(T element){
            head = new Node<T>(element, head);  //this becomes the new head
        if(size == 0){
            tail = head;
        }
        size++;
        System.out.println("Added head node with" + head.getElement() + " element.");
    }

    public void addLast(T element){
        Node<T> newNode = new Node<T>(element, null);
        if(isEmpty()) {
            head = newNode;
        } else{
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
        System.out.println("Added tail node with " + tail.getElement() + " element.");
    }

    public T removeFirst(){
        if (isEmpty()){
            return null;
        }
        T result = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        System.out.println("Removed head node with " + result + " element.");
        return result;
    }

    public void reverseList(){
        if(size <=1){

        }else if(size == 2){
            tail.setNext(head);
            head = tail;
            tail = head.getNext();
            tail.setNext(null);
        }else {
            Node<T> current = head;
            Node<T> currentNext = head.getNext();
            Node<T> currentNextNext = currentNext.getNext();
            tail = head;
            while(currentNext != null) {
                currentNext.setNext(current);
                current = currentNext;
                currentNext = currentNextNext;
                if (currentNextNext != null) {
                    currentNextNext = currentNextNext.getNext();
                }
            }
            tail.setNext(null);
            head = current;
        }
    }

    public T removeElement(T element) {
        Node<T> current = head;
        Node<T> previous = head;
        int position = 0;
        while(current != null && current.getElement()!= element) {
            previous = current;
            current = current.getNext();
            position++;
        }
        if(current == null){
            return null;
        }else {
            if(head == current){
                head = current.getNext();
            } else if (tail == current){
                tail = previous;
                tail.setNext(null);
            }else {
                previous.setNext(current.getNext());
            }
            System.out.println("Found and removed node at position " + position);
            size--;
            return current.getElement();
        }
    }


}



