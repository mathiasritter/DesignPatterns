package s06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GansAdapterTest {

    GansAdapter g;


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();


    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Before
    public void setUp() throws Exception {
        g = new GansAdapter(new Gans());
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testQuaken() throws Exception {
        g.quaken();
        assertEquals("Schnatter\n", outContent.toString());
    }

    @Test
    public void testRegistriereBeobachter() throws Exception {
        g.registriereBeobachter(new Beobachter() {
            @Override
            public void aktualisieren(QuakBeobachtungsSubjekt ente) {

            }
        });
        assertEquals(1, g.senderRing.beobachtende.size());
    }

    @Test
    public void testBenachrichtigeBeobachtende() throws Exception {

        final int[] anzahl = new int[1];

        g.registriereBeobachter(new Beobachter() {
            @Override
            public void aktualisieren(QuakBeobachtungsSubjekt ente) {
                anzahl[0] = 1;
            }
        });

        g.benachrichtigeBeobachtende();

        assertEquals(1, anzahl[0]);
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("GansAdapter: gans=[Gans]", g.toString());
    }
}