package at.geyerritter.s06;

/**
 * Ein Quakzaehler zaehlt mit, wie oft eine Ente quakt.
 * Es beinhaelt diese Ente als Attribut.
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public class QuakZaehler implements Quakfaehig {

	Quakfaehig ente;
	static int anzahlDerQuaks;

	/**
	 * Initialisieren des Zaehlers, indem die Ente angegeben wird,
	 * bei der die Quaks gezaehlt werden sollen.
	 *
	 * @param ente Die Quaks dieser Ente werden gezaehlt
	 */
	public QuakZaehler(Quakfaehig ente) {
		this.ente = ente;
	}

	/**
	 * @see Quakfaehig#quaken()
	 */
	public void quaken() {
		ente.quaken();
		anzahlDerQuaks++;
	}

	/**
	 * Abrufen der Anzahl der bisher gezaehlten Quaks
	 *
	 * @return Anzahl der Quaks
	 */
	public static int getQuaks() {
		return anzahlDerQuaks;
	}

	/**
	 * @see at.geyerritter.s06.Quakfaehig#registriereBeobachter(Beobachter)
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		ente.registriereBeobachter(beobachter);
	}

	/**
	 * @see Quakfaehig#benachrichtigeBeobachtende()
	 */
	public void benachrichtigeBeobachtende() {
		ente.benachrichtigeBeobachtende();
	}

	/**
	 * @see Object#toString()
	 */
	public String toString() {
		return ente.toString();
	}
}
