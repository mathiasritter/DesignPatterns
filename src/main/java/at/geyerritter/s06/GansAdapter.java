package at.geyerritter.s06;

/**
 * Adapter fuer eine Gans.
 * Somit kann ein Client eine Gans auch als "Quakfaehig" nutzen
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
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
	 * Quaken loest bei der Gans ein Schnattern aus.
	 * Die Beobachter werden benachrichtigt.
	 */
	public void quaken() {
		gans.schnattern();
		benachrichtigeBeobachtende();
	}


	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}

	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}

	public String toString() {
		return "GansAdapter: gans=[Gans]";
	}
}
