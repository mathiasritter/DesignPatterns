package at.geyerritter.s06;

public class Quakologe implements Beobachter {
 
	public void aktualisieren(QuakBeobachtungsSubjekt ente) {
		System.out.println("Quakologe: [" + ente + ": senderRing=[SenderRing: ente]]");
	}
 
	public String toString() {
		return "Quakologe";
	}
}
