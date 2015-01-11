package at.geyerritter.s06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class QuakZaehlerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    Quakfaehig q;

    @Before
    public void setUp() throws Exception {
        q = new QuakZaehler(new MoorEnte());
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testQuaken() throws Exception {
        q.quaken();
        assertEquals("Quak" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testGetQuaks() throws Exception {
        q.quaken();
        assertEquals(QuakZaehler.getQuaks(), 1);
    }

    @Test
    public void testRegistriereBeobachter() throws Exception {
        q.registriereBeobachter(ente -> {

        });
    }

    @Test
    public void testBenachrichtigeBeobachtende() throws Exception {
        final int[] anzahl = new int[1];

        q.registriereBeobachter(ente -> anzahl[0] = 1);

        q.benachrichtigeBeobachtende();

        assertEquals(1, anzahl[0]);
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("Moorente", q.toString());
    }
}