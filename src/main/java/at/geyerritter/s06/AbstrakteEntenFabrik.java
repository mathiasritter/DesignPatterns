package at.geyerritter.s06;

/**
 * Schnittstelle der abstraken Fabrik zu Erzeugung der Enten
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public abstract class AbstrakteEntenFabrik {

	/**
	 * Erzeugen einer neuen Stockente
	 *
	 * @return Quakfaehige Stockente
	 */
	public abstract Quakfaehig erzeugeStockEnte();

	/**
	 * Erzeugen einer neuen Moorente
	 *
	 * @return Quakfaehige Moorente
	 */
	public abstract Quakfaehig erzeugeMoorEnte();

	/**
	 * Erzeugen einer neuen LockPfeife
	 *
	 * @return Quakfaehige LockPfeife
	 */
	public abstract Quakfaehig erzeugeLockPfeife();

	/**
	 * Erzeugen einer neuen Gummiente
	 *
	 * @return Quakfaehige Gummiente
	 */
	public abstract Quakfaehig erzeugeGummiEnte();
}
