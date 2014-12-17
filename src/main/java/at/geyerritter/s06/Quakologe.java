package at.geyerritter.s06;

/**
 * Der Quakologe ist ein Beobachter, welcher benachrichtigt werden moechte.
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public class Quakologe implements Beobachter {

	/**
	 * @see at.geyerritter.s06.Beobachter#aktualisieren(QuakBeobachtungsSubjekt)
	 */
	public void aktualisieren(QuakBeobachtungsSubjekt ente) {
		System.out.println("Quakologe: [" + ente + ": senderRing=[SenderRing: ente]]");
	}

	/**
	 * @see Object#toString()
	 */
	public String toString() {
		return "Quakologe";
	}
}
