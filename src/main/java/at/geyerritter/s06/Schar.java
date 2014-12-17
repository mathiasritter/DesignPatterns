package at.geyerritter.s06;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * Eine Schar von Quakfaehigen Objekten, die ein Quaken bei allen registrierten
 * Objekten ausloest.
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public class Schar implements Quakfaehig {

	ArrayList<Quakfaehig> quakende = new ArrayList<Quakfaehig>();

	/**
	 * Einen neuen Quaker zur Schar hinzufuegen.
	 *
	 * @param quaker Hinzuzufuegender Quaker
	 */
	public void hinzufuegen(Quakfaehig quaker) {
		quakende.add(quaker);
	}

	/**
	 * @see Quakfaehig#quaken()
	 */
	public void quaken() {
		Iterator iterator = quakende.iterator();
		while (iterator.hasNext()) {
			Quakfaehig quaker = (Quakfaehig)iterator.next();
			quaker.quaken();
		}
	}

	/**
	 * @see at.geyerritter.s06.Quakfaehig#registriereBeobachter(Beobachter)
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		Iterator iterator = quakende.iterator();
		while (iterator.hasNext()) {
			Quakfaehig quaker = (Quakfaehig)iterator.next();
			quaker.registriereBeobachter(beobachter);
		}
	}

	/**
	 * @see at.geyerritter.s06.Quakfaehig#registriereBeobachter(Beobachter)
	 */
	public void benachrichtigeBeobachtende() { }

	/**
	 * @see Object#toString()
	 */
	public String toString() {
		return "Entenschar";
	}
}
