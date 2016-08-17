package de.predic8;

import static org.junit.Assert.*;

/**
 * Created by thomas on 17.08.16.
 */
public class SimpleTest {

    Simple simple;

    @org.junit.Before
    public void setUp() throws Exception {
        simple = new Simple();
    }

    @org.junit.Test
    public void add() throws Exception {
        assertEquals(3, simple.add(1,2));
    }

}