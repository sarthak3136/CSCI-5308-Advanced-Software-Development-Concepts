package org.example;


import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testNodeCreation(){
        Node node = new Node(10);
        assertEquals(10, node.getValue());
        assertNull(node.getNext());
    }

    @Test
    public void testCreateLinkedList(){
        LinkedList linkedList = new LinkedList();
        assertNull(linkedList.getHead());
    }

    @Test
    public void testAddNodeToLinkedList(){
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(15);
        assertNotNull(linkedList.getHead());
        assertEquals(15, linkedList.getHead().getValue());
    }

    @Test
    public void testFindMiddleNode(){
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(20);
        linkedList.addNode(25);
        linkedList.addNode(30);
        linkedList.addNode(35);
        linkedList.addNode(40);
        assertEquals(30,linkedList.findMiddleNode().getValue());
    }
}