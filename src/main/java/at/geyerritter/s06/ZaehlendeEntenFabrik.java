package at.geyerritter.s06;

/**
 * Diese Fabrik implementiert die abstrake Entenfabrik.
 * Dadurch koennen neue Enten erzeugt werden.<br>
 * Alle erzeugten Enten werden in einen Quakzaehler "eingepackt".
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public class ZaehlendeEntenFabrik extends AbstrakteEntenFabrik {

	/**
	 * @see AbstrakteEntenFabrik#erzeugeStockEnte()
	 */
	public Quakfaehig erzeugeStockEnte() {
		return new QuakZaehler(new StockEnte());
	}

	/**
	 * @see at.geyerritter.s06.AbstrakteEntenFabrik#erzeugeMoorEnte()
	 */
	public Quakfaehig erzeugeMoorEnte() {
		return new QuakZaehler(new MoorEnte());
	}

	/**
	 * @see at.geyerritter.s06.AbstrakteEntenFabrik#erzeugeLockPfeife()
	 */
	public Quakfaehig erzeugeLockPfeife() {
		return new QuakZaehler(new LockPfeife());
	}

	/**
	 * @see at.geyerritter.s06.AbstrakteEntenFabrik#erzeugeGummiEnte()
	 */
	public Quakfaehig erzeugeGummiEnte() {
		return new QuakZaehler(new GummiEnte());
	}
}
