package org.example;


import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testNodeCreation(){
        Node node = new Node(3);
        assertEquals(3,node.getValue());
        assertNull(node.getNext());
    }

    @Test
    public void testPush(){
        Stack st = new Stack();
        st.push(4);
        st.push(31);
        st.push(11);
        assertEquals(st.head.value,11);

    }

    @Test
    public void testPop(){
        Stack st = new Stack();
        st.push(41);
        assertEquals(st.pop(),41);
        assertNotEquals(41,st.pop());
    }

    @Test
    public void testPeek(){
        Stack st = new Stack();
        st.push(51);
        st.push(69);
        st.push(71);
        assertEquals(st.peek(),71);
    }

    @Test
    public void testSize(){
        Stack st = new Stack();
        st.push(55);
        st.push(68);
        st.push(86);
        st.push(99);
        assertEquals(st.size(),4);
    }




}