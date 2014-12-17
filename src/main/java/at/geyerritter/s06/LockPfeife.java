package at.geyerritter.s06;

/**
 * Eine LockPfeife bringt andere Enten zum quaken (Benachrichtigung mittels Observer-Pattern)
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public class LockPfeife implements Quakfaehig {
	SenderRing senderRing;

	/**
	 * Initialisieren eines neuen senderRing im Konstruktor
	 */
	public LockPfeife() {
		senderRing = new SenderRing(this);
	}

	/**
	 * @see Quakfaehig#quaken()
	 */
	public void quaken() {
		System.out.println("Kwaak");
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
	 * @see Object#toString()
	 */
	public String toString() {
		return "Lockpfeife";
	}
}
