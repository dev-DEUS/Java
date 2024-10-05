
public class Aufgabe_2_4 {

	public static void main(String[] args) {
		double a = IOTools.readDouble("a = ");
		double xn = (1 + a) / 2;
		double xvorher = 0;
		int count = 0;

		while (Math.abs(xn - xvorher) >= 0.00000001) {
			xvorher = xn;
			xn = (xn / 2) * (3 - ((xn * xn) / a));
			count++;
		}

		System.out.print("Wurzel aus " + a + " approx. " + xn + " (" + count + " Iterationen)");
		System.out.println();
	}

}
