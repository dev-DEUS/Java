public class WuerfelTest {
	public static void main(String[] args) {
		int n = 3;
		Wuerfel[] wuerfel = new Wuerfel[n];

		/* *** Aufgabenteil (b) *** */

		for (int i = 0; i < wuerfel.length; i++) {
			Wuerfel myWuerfel = new Wuerfel(); // Erstellt bei jeder Iteration ein neues Objekt myWuerfel
			wuerfel[i] = myWuerfel; // Fuellt das Feld wuerfel[] an der Stelle i mit dem erstellten Objekt
			myWuerfel.print(); // Gibt die Wuerfel mit dem Startwert 1 aus
		}
		System.out.println("---------------");

		for (int i = 0; i < wuerfel.length; i++) {
			System.out.println((i + 1) + ". Wuerfeln:");
			for (int j = 0; j < wuerfel.length; j++) {
				wuerfel[j].werfen(); // Simuliert nun für jedes erstellte Objekt (Wuerfel) einen Wurf. 3 Wuerfe mit 3 Wuerfeln.
				wuerfel[j].print(); // Gibt die simulierten Wuerfe an Stelle j aus.
			}
		}
	}
}
