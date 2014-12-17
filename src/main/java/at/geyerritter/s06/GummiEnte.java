package at.geyerritter.s06;

/**
 * Eine GummiEnte ist eine Ente, deshalb implementiert sie das Interface Quakfaehig
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public class GummiEnte implements Quakfaehig {
	SenderRing senderRing;

	/**
	 * Initialisieren einer neuen Gummi-Ente und eines senderRings
	 */
	public GummiEnte() {
		senderRing = new SenderRing(this);
	}

	/**
	 * @see Quakfaehig#quaken()
	 */
	public void quaken() {
		System.out.println("Quietsch");
		benachrichtigeBeobachtende();
	}

	/**
	 * @see at.geyerritter.s06.Quakfaehig#registriereBeobachter(Beobachter)
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}

	/**
	 * @see at.geyerritter.s06.Quakfaehig#registriereBeobachter(Beobachter)
	 */
	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}

	/**
	 * @see Object#toString()
	 */
	public String toString() {
		return "Gummiente";
	}
}
