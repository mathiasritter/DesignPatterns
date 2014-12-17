package at.geyerritter.s06;

/**
 * Eine MoorEnte ist eine Ente, deshalb implementiert sie das Interface Quakfaehig
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public class MoorEnte implements Quakfaehig {

	SenderRing senderRing;

	/**
	 * Beim Initialisieren einer neuen MoorEnte wird auch ein
	 * neuer senderRing initialisiert.
	 */
	public MoorEnte() {
		senderRing = new SenderRing(this);
	}

	/**
	 * @see Quakfaehig#quaken()
	 */
	public void quaken() {
		System.out.println("Quak");
		benachrichtigeBeobachtende();
	}

	/**
	 * @see at.geyerritter.s06.Quakfaehig#registriereBeobachter(Beobachter)
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}

	/**
	 * @see Quakfaehig#benachrichtigeBeobachtende()
	 */
	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}

	/**
	 * @see Quakfaehig#toString()
	 */
	public String toString() {
		return "Moorente";
	}
}
