
public class Aufgabe_2_2 {
	// Aufgabenteil (a)
	// 1 2 5 14 41 122 ...
	// Schema: 3 * a(n-1) - 1 (a(n-1) = a an der Stelle n - 1)

	public static void folge_a() {
		int a = 1;
		int n = 15;
		int temp = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a = 3 * temp - 1;
			temp = a;
		}
	}

	// Aufgabenteil (b)
	// 3 4 2 5 1 6 0 7 ...
	// Schema: Ich weiß nicht wie man das als Formel darstellen kann.
	// Das Schema ist +1, -2, +3, -4, +5, -6, +7 etc.
	public static void folge_b() {
		int a = 3;
		int n = 15;
		int sign = 1;

		for (int i = 0; i <= n; i++) {
			System.out.print(a + " ");
			a = a + sign;
			sign = sign * -1;

			if (sign < 0) {
				sign = sign * -1;
				sign++;
				sign = sign * -1;
			} else {
				sign++;
			}
		}
	}

	// Aufgabenteil (c)
	// 12 6 3 8 4 2 1 6
	// Schema: a(n) = (a(n-1)) / 2, wenn a(n-1) gerade, sonst 	(a(n-1) = a an der Stelle n - 1; a(n) = a an der Stelle n)
	// a(n) + 5, wenn a(n-1) ungerade
	public static void folge_c() {
		int a = 12;
		int n = 15;

		for (int i = 0; i <= n; i++) {
			System.out.print(a + " ");

			if (a % 2 == 0) {
				a = a / 2;
			} else {
				a = a + 5;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Aufgabenteil (a)");
		folge_a(); // erste Folge berechnen und ausgeben
		System.out.println("\nAufgabenteil (b)");
		folge_b(); // zweite Folge berechnen und ausgeben
		System.out.println("\nAufgabenteil (c)");
		folge_c(); // dritte Folge berechnen und ausgeben
		System.out.println();
	}

}
