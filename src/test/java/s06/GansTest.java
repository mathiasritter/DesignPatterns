package s06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GansTest {

    private Gans g;


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();


    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Before
    public void setUp() throws Exception {
        g = new Gans();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }


    @Test
    public void testSchnattern() throws Exception {
        g.schnattern();
        assertEquals("Schnatter\n", outContent.toString());
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("Gans", g.toString());
    }
}