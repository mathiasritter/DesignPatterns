package at.geyerritter.s06;

/**
 * Stellt ein Observable dar, welches Methoden zum Registrieren
 * und Benachrichtigen der zuvor registrierten Observer ermoeglicht
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public interface QuakBeobachtungsSubjekt {

	/**
	 * Registrieren eines neuen Beobachters.
	 * Dieser Beobachter wird in Zukunft benachrichtigt.
	 *
	 * @param beobachter Zu registrierender Beobachter
	 */
	public void registriereBeobachter(Beobachter beobachter);

	/**
	 * Benachrichtigen aller Beobachter.
	 * Es werden nur die zuvor registrierten Beobachter benachrichtigt.
	 */
	public void benachrichtigeBeobachtende();
}
