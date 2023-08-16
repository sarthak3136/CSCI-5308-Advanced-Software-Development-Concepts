package org.example;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
    }

    public Node findMiddleNode() {
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer != null && fastPointer.getNext() != null) {
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
        }
        return slowPointer;
    }
}
