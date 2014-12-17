package at.geyerritter.s06;

/**
 * Interface fuer einen Beobachter (Observer), welches eine Methode
 * zum Aktualisieren der Beobachter enthaelt
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public interface Beobachter {

	/**
	 * Aktualisiert einen bestimmten Beobachter.
	 * Wird vom Observable aufgerufen
	 *
	 * @param ente Zu beobachtende Ente
	 */
	public void aktualisieren(QuakBeobachtungsSubjekt ente);
}
