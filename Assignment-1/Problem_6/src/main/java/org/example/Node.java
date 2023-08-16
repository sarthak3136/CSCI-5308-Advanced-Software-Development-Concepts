package org.example;

public class Node {
    int value;
    Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }

    int getValue(){
        return value;
    }

    Node getNext(){
        return next;
    }
}
