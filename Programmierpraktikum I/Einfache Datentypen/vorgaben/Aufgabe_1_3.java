
public class Aufgabe_1_3 {

    public static void main(String[] args){
	System.out.println("Bitte geben Sie folgende Daten ein:");
    int grundkapital = IOTools.readInteger("Grundkapital: ");
    double zinssatz = IOTools.readDouble("Zinssatz: ");
    int jahre = IOTools.readInteger("Jahre: ");

    double a = 1 + (zinssatz / 100);
    double b = grundkapital * Math.pow(a, jahre);
    System.out.println("Das Ergebnis nach" + jahre + " Jahren beträgt " + b);

    }
}
