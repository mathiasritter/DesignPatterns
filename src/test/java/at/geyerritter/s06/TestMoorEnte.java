package at.geyerritter.s06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Stefan on 17.12.2014.
 */
public class TestMoorEnte {

    private ByteArrayOutputStream sysOut;

    @Before
    public void before() {
        this.sysOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(sysOut));
    }

    @Test
    public void testRegistriereBeobachter() {
        MoorEnte me = new MoorEnte();
        me.registriereBeobachter(new TestBeobachter());
        assertEquals(1, me.senderRing.beobachtende.size());
    }

    @Test
    public void testToString() {
        MoorEnte me = new MoorEnte();
        assertEquals("Moorente", me.toString());
    }

    @After
    public void after() throws IOException {
        this.sysOut.flush();
        this.sysOut.close();
    }
}
