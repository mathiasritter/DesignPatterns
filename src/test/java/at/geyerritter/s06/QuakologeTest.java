package at.geyerritter.s06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class QuakologeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    Quakologe q;

    @Before
    public void setUp() throws Exception {
        q = new Quakologe();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testAktualisieren() throws Exception {
        q.aktualisieren(new MoorEnte());
        assertEquals("Quakologe: [Moorente: senderRing=[SenderRing: ente]]\n", outContent.toString());
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("Quakologe", q.toString());

    }
}