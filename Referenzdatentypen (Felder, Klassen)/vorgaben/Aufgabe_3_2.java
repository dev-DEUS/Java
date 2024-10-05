
public class Aufgabe_3_2 {

	public static void main(String[] args) {
		int[] prim = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
				43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
		int z;

		/* *** Aufgabenteil (a) *** */
		// 3 P
		int add = 0;
		System.out.println("Aufgabenteil (a):");
		do {
			z = IOTools.readInteger("z: ");
		} while (z < 4 || z > 100);

		for (int p1 = 0; p1 < prim.length; p1++) {
			for (int p2 = p1; p2 < prim.length; p2++) {
				add = prim[p1] + prim[p2];

				if (add == z) {
					System.out.println(prim[p1] + " + " + prim[p2] + " = " + add);
				}
			}
		}
		/* *** Aufgabenteil (b) *** */
		// 4 P
		boolean found = false;
		System.out.println("\nAufgabenteil (b):");
		for (int i = 4; i <= z; i++) {
			found = false;
			for (int p1 = 0; p1 < prim.length && (!found); p1++) {
				for (int p2 = p1; p2 < prim.length && (!found); p2++) {
					add = prim[p1] + prim[p2];

					if (add == i) {
						found = true;
						System.out.println(prim[p1] + " + " + prim[p2] + " = " + add);
					}
				}
			}
			if (!found) {
				System.out.println("Nichts gefunden fuer " + i);
			}
		}
		System.out.println();
	}
}
