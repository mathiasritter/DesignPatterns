package at.geyerritter.s06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class StockEnteTest {

    private StockEnte s;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();


    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }


    @Before
    public void setUp() throws Exception {
        s = new StockEnte();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testQuaken() throws Exception {
        s.quaken();
        assertEquals("Quak\n", outContent.toString());
    }

    @Test
    public void testRegistriereBeobachter() throws Exception {
        s.registriereBeobachter(new Beobachter() {
            @Override
            public void aktualisieren(QuakBeobachtungsSubjekt ente) {

            }
        });
        assertEquals(1, s.senderRing.beobachtende.size());
    }

    @Test
    public void testBenachrichtigeBeobachtende() throws Exception {

        final int[] anzahl = new int[1];

        s.registriereBeobachter(new Beobachter() {
            @Override
            public void aktualisieren(QuakBeobachtungsSubjekt ente) {
                anzahl[0] = 1;
            }
        });

        s.benachrichtigeBeobachtende();

        assertEquals(1, anzahl[0]);

    }

    @Test
    public void testToString() throws Exception {
        assertEquals("Stockente", s.toString());
    }
}