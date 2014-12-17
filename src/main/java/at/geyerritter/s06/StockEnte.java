package at.geyerritter.s06;

/**
 * Eine StockEnte ist eine Ente, deshalb implementiert sie das Interface Quakfaehig
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public class StockEnte implements Quakfaehig {
	SenderRing senderRing;

	/**
	 * Beim Initialisieren wird auch ein neuer senderRing initialisiert
	 */
	public StockEnte() {
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
	 * @see at.geyerritter.s06.Quakfaehig#registriereBeobachter(Beobachter)
	 */
	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}

	/**
	 * @see Object#toString()
	 */
	public String toString() {
		return "Stockente";
	}
}
