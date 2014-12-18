package at.geyerritter.s06;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZaehlendeEntenFabrikTest {

    ZaehlendeEntenFabrik z;

    @Before
    public void setUp() throws Exception {
        z = new ZaehlendeEntenFabrik();
    }

    @Test
    public void testErzeugeStockEnte() throws Exception {
        assertEquals(true, z.erzeugeStockEnte() != null);
    }

    @Test
    public void testErzeugeMoorEnte() throws Exception {
        assertEquals(true, z.erzeugeMoorEnte() != null);
    }

    @Test
    public void testErzeugeLockPfeife() throws Exception {
        assertEquals(true, z.erzeugeLockPfeife() != null);
    }

    @Test
    public void testErzeugeGummiEnte() throws Exception {
        assertEquals(true, z.erzeugeGummiEnte() != null);
    }
}