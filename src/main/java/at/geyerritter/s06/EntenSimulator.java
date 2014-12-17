package at.geyerritter.s06;

/**
 * Der EntenSimulator startet die Simulation
 *
 * @author Geyer Stefan
 * @author Ritter Mathias
 *
 * @version 0.1
 */
public class EntenSimulator {

	/**
	 * Neuen Simulator und neue Entenfabrik initialisieren. <br>
	 * Simulation starten.
	 *
	 * @param args Kommandozeilenargumente
	 */
	public static void main(String[] args) {
		EntenSimulator simulator = new EntenSimulator();
		AbstrakteEntenFabrik entenFabrik = new ZaehlendeEntenFabrik();
 
		simulator.simulieren(entenFabrik);
	}

	/**
	 * Die Simulation wird gestartet und ausgefuhert.
	 *
	 * @param entenfabrik Die Entenfabrik, die fuer die Simulation genutzt wird
	 */
	void simulieren(AbstrakteEntenFabrik entenfabrik) {

		// Mit Hilfe der Fabrik werden die Enten erzeugt
		Quakfaehig gummiEnte = entenfabrik.erzeugeGummiEnte();
		Quakfaehig lockPfeife = entenfabrik.erzeugeLockPfeife();
		Quakfaehig moorEnte = entenfabrik.erzeugeMoorEnte();

		// Die Gans stellt eine Ausnahme dar, da sie nur mit Adapter genutzt werden kann
		Quakfaehig gansEnte = new GansAdapter(new Gans());

		//Zwei Scharen werden initialisiert
		Schar EntenSchar = new Schar();
		Schar stockEntenSchar = new Schar();

		// Eine neue StockEnte wird mit Hilfe der Fabrik erzeugt
		Quakfaehig stockEnte1 = entenfabrik.erzeugeStockEnte();
		stockEntenSchar.hinzufuegen(stockEnte1);

		// Zur Entenschar werden diverse Enten und die Stockenten-Schar hinzugefuegt
		EntenSchar.hinzufuegen(gummiEnte);
		EntenSchar.hinzufuegen(lockPfeife);
		EntenSchar.hinzufuegen(moorEnte);
		EntenSchar.hinzufuegen(stockEntenSchar);
		EntenSchar.hinzufuegen(gansEnte);

		//Der Quakologe registriert sich bei der Enten-Schar
		Quakologe quakologe = new Quakologe();
		EntenSchar.registriereBeobachter(quakologe);

		//Das Quaken der Enten-Schar wird ausgeloest
		simulieren(EntenSchar);

		//Ausgabe, wie oft die Enten gequakt haben
		System.out.println("Die Enten haben " +
		                   QuakZaehler.getQuaks() + 
		                   "-mal gequakt.");
	}

	/**
	 * Simuliert das Quaken eines Quakfaehigen Objekts (z.B. Ente)
	 *
	 * @param ente Quakfaehiges Objekt (z.B. Ente)
	 */
	void simulieren(Quakfaehig ente) {
		ente.quaken();
	}
}
