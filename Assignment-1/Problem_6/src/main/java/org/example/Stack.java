package org.example;

public class Stack{

    Node head;
    int size;

    public Stack(){
        head = null;
        size = 0;
    }
    public void push(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }
    public int pop(){
        if(head == null){
            return -1;
        }
        int poppedValue = head.value;
        head = head.next;
        size--;
        return poppedValue;
    }

    public int peek(){
        if(head == null){
            return -1;
        }
        return head.value;
    }

    public int size(){
        return size;
    }
}