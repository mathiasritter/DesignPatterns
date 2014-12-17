package s06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LockPfeifeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    LockPfeife l;

    @Before
    public void setUp() throws Exception {
        l = new LockPfeife();
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
        l.quaken();
        assertEquals("Kwaak\n", outContent.toString());
    }

    @Test
    public void testRegistriereBeobachter() throws Exception {
        l.registriereBeobachter(new Beobachter() {
            @Override
            public void aktualisieren(QuakBeobachtungsSubjekt ente) {

            }
        });
        assertEquals(1, l.senderRing.beobachtende.size());
    }

    @Test
    public void testBenachrichtigeBeobachtende() throws Exception {

        final int[] anzahl = new int[1];

        l.registriereBeobachter(new Beobachter() {
            @Override
            public void aktualisieren(QuakBeobachtungsSubjekt ente) {
                anzahl[0] = 1;
            }
        });

        l.benachrichtigeBeobachtende();

        assertEquals(1, anzahl[0]);
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("Lockpfeife", l.toString());
    }
}