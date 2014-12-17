package at.geyerritter.s06;

/**
 * Adapter fuer eine Gans.
 * Somit kann ein Client eine Gans auch als "Quakfaehig" nutzen.
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public class GansAdapter implements Quakfaehig {

	Gans gans;
	SenderRing senderRing;

	/**
	 * Initialisieren des Adapters mit Hilfe einer angegebenen Gans
	 *
	 * @param gans Gans, die durch den Adapter genutzt werden soll
	 */
	public GansAdapter(Gans gans) {
		this.gans = gans;
		senderRing = new SenderRing(this);
	}

	/**
	 * @see Quakfaehig#quaken()
	 */
	public void quaken() {
		gans.schnattern();
		benachrichtigeBeobachtende();
	}

	/**
	 * @see at.geyerritter.s06.Quakfaehig#registriereBeobachter(Beobachter)
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}

	/**
	 * Benachrichtigen aller im senderRing eingetragener Beobachter
	 */
	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}

	/**
	 * @see Object#toString()
	 */
	public String toString() {
		return "GansAdapter: gans=[Gans]";
	}
}
