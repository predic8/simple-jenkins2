package de.predic8;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddiererTests {
        Addierer addierer = new Addierer();

    @Test
    public void testAddiere() throws Exception {
        assertEquals(3, addierer.addiere(1,2));
        assertEquals(2, addierer.addiere(0,2));
    }

}