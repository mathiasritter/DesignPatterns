package at.geyerritter.s06;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * Der SenderRing benachrichtigt alle registrierten Beobachter.<br>
 * Das zu beobachtende Subjekt (Ente) wird als Attribut gespeichert.
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @author 0.1
 */
public class SenderRing implements QuakBeobachtungsSubjekt {
	ArrayList<Beobachter> beobachtende = new ArrayList<Beobachter>();
	QuakBeobachtungsSubjekt ente;

	/**
	 * Beim Initialisieren wird die zu beobachtende Ente angegeben
	 *
	 * @param ente Zu beobachtende Ente
	 */
	public SenderRing(QuakBeobachtungsSubjekt ente) {
		this.ente = ente;
	}

	/**
	 * @see at.geyerritter.s06.Quakfaehig#registriereBeobachter(Beobachter)
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		beobachtende.add(beobachter);
	}

	/**
	 * @see Quakfaehig#benachrichtigeBeobachtende()
	 */
	public void benachrichtigeBeobachtende() {
		Iterator iterator = getBeobachtende();
		while (iterator.hasNext()) {
			Beobachter beobachter = (Beobachter)iterator.next();
			beobachter.aktualisieren(ente);
		}
	}

	/**
	 * Ein neuer Interator fuer die Beobachtenden wird zurueckgegeben.
	 *
	 * @return Interator
	 */
	public Iterator getBeobachtende() {
		return beobachtende.iterator();
	}
}
