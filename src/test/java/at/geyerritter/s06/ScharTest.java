package at.geyerritter.s06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ScharTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    Schar s;

    @Before
    public void setUp() throws Exception {
        s = new Schar();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testHinzufuegen() throws Exception {
        s.hinzufuegen(new MoorEnte());
        assertEquals(1, s.quakende.size());
    }

    @Test
    public void testQuaken() throws Exception {
        s.hinzufuegen(new MoorEnte());
        s.quaken();
        assertEquals("Quak\n", outContent.toString());
    }

    @Test
    public void testRegistriereBeobachter() throws Exception {
        s.quakende.add(new GummiEnte());
        s.registriereBeobachter(ente -> {

        });
    }

    @Test
    public void testBenachrichtigeBeobachtende() throws Exception {
        s.benachrichtigeBeobachtende();
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("Entenschar", s.toString());
    }
}