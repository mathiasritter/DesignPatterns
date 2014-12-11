package s06;

/**
 * Schnittstelle fuer die Abstrake Fabrik zu Erzeugung der Enten
 */
public abstract class AbstrakteEntenFabrik {
 
	public abstract Quakfaehig erzeugeStockEnte();
	public abstract Quakfaehig erzeugeMoorEnte();
	public abstract Quakfaehig erzeugeLockPfeife();
	public abstract Quakfaehig erzeugeGummiEnte();
}
