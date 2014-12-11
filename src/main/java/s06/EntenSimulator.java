package s06;

public class EntenSimulator {
	public static void main(String[] args) {
		EntenSimulator simulator = new EntenSimulator();
		AbstrakteEntenFabrik entenFabrik = new ZaehlendeEntenFabrik();
 
		simulator.simulieren(entenFabrik);
	}
  
	void simulieren(AbstrakteEntenFabrik entenfabrik) {

		Quakfaehig gummiEnte = entenfabrik.erzeugeGummiEnte();
		Quakfaehig lockPfeife = entenfabrik.erzeugeLockPfeife();
		Quakfaehig moorEnte = entenfabrik.erzeugeMoorEnte();

		Quakfaehig gansEnte = new GansAdapter(new Gans());
 
		Schar EntenSchar = new Schar();
		Schar stockEntenSchar = new Schar();

		Quakfaehig stockEnte1 = entenfabrik.erzeugeStockEnte();
		stockEntenSchar.hinzufuegen(stockEnte1);

		EntenSchar.hinzufuegen(gummiEnte);
		EntenSchar.hinzufuegen(lockPfeife);
		EntenSchar.hinzufuegen(moorEnte);
		EntenSchar.hinzufuegen(stockEntenSchar);
		EntenSchar.hinzufuegen(gansEnte);


		Quakologe quakologe = new Quakologe();
		EntenSchar.registriereBeobachter(quakologe);

		simulieren(EntenSchar);

		System.out.println("Die Enten haben " +
		                   QuakZaehler.getQuaks() + 
		                   "-mal gequakt.");
	}
 
	void simulieren(Quakfaehig ente) {
		ente.quaken();
	}
}
