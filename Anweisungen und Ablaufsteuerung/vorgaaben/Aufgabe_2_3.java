
public class Aufgabe_2_3 {
	public static void main(String[] args) {
		int h;
		char buchstabe;

		do {
			h = IOTools.readInteger("Zahl zwischen 3 - 26: ");
		} while (h < 3 || h > 26);

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < i; j++) {
				buchstabe = (char) ('A' + j);
				System.out.print(buchstabe + "");
			}
			System.out.println();
		}

		for (int i = h - 1; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				buchstabe = (char) ('A' + i - j);
				System.out.print(buchstabe + "");
			}
			System.out.println();
		}
		System.out.println();
	}
}
