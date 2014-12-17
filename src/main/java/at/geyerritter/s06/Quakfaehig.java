package at.geyerritter.s06;

/**
 * Alle Klassen der Objekte, die Quaken sollen, implementieren dieses Interface.
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public interface Quakfaehig extends QuakBeobachtungsSubjekt {

	/**
	 * Loest das Quaken aus.<br>
	 * Je nach Implementierung wird dadurch ein unterschiedliches Verhalten ausgeloest.
	 */
	public void quaken();
}
