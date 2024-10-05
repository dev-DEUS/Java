
public class Aufgabe_2_5 {
	public static void main(String[] args) {
		// Gitter zeichnen:
		// 1. n einlesen
		// 2. abwechselnd zwei Zeilen zeichnen
		// a. 1. Zeile besteht aus n-1 Mal o- und 1x 0
		// b. 2. Zeile besteht aus n Mal | + Leerzeichen
		// 1. Zeile muss n Mal gezeichnet werden, 2. Zeile n-1 Mal

		int n;

		do {
			n = IOTools.readInteger("n = ");
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - 1; j++) {
				System.out.print("o-");
			}
			System.out.print("o");
			System.out.println();

			if (i < n) {
				for (int k = 1; k <= n; k++) {
					System.out.print("| ");
				}
				System.out.println();
			}
		}

		System.out.println();

	}

}
