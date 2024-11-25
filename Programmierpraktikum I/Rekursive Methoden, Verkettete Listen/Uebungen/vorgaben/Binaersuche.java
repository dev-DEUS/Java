public class Binaersuche {

	public static boolean binSucheRek(int[] feld, int wert, int anf, int ende) {
		int mitte = (anf + ende) / 2;

		if (anf > ende) {
			return false;
		}

		if (feld[mitte] == wert) {
			return true;
		}

		if (wert < feld[mitte]) {
			return binSucheRek(feld, wert, anf, mitte - 1);
		} else {
			return binSucheRek(feld, wert, mitte + 1, ende);
		}
	}

	public static boolean binSucheIt(int[] feld, int wert) {
		int mitte = (feld.length / 2) - 1;

		for (int i = 0; i < feld.length; i++) {
			if (feld[mitte] == wert) {
				return true;
			}

			if (feld[mitte] < wert) {
				
			}
		}
		return false; // Dummy return
	}

	/* Zufallszahl aus dem Intervall [a,b] */
	public static int rand(int a, int b) {
		return (int) (Math.random() * (b - a + 1)) + a;
	}

	public static void main(String[] args) {
		int N = IOTools.readInteger("Laenge des Felds: ");
		int[] feld = new int[N];
		feld[0] = 1;
		// Feld mit sortierten Zufallszahlen generieren
		for (int i = 1; i < N; i++) {
			feld[i] = rand(feld[i - 1], feld[i - 1] + 10);
		} // jedes Element in dem Feld ist um max. 10 groesser als das Vorhergehende

		// Feld ausgeben
		for (int v : feld) {
			System.out.print(v + " ");
		}
		System.out.println();

		int k = IOTools.readInteger("Suchelement = ");

		System.out.println("Rekursiv: ");
		boolean gefunden = binSucheRek(feld, k, 0, N - 1);
		if (gefunden) {
			System.out.println("Element gefunden");
		} else {
			System.out.println("Element nicht gefunden");
		}

		System.out.println("Iterativ: ");
		gefunden = binSucheIt(feld, k);
		if (gefunden) {
			System.out.println("Element gefunden");
		} else {
			System.out.println("Element nicht gefunden");
		}
	}

}
