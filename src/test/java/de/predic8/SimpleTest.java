package de.predic8;

import static org.junit.Assert.*;

public class SimpleTest {

    Simple simple;

    @org.junit.Before
    public void setUp() throws Exception {
        simple = new Simple();
    }

    @org.junit.Test
    public void add() throws Exception {
        assertEquals(3, simple.addiere(1,2));
    }

}