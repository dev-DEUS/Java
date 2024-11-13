public class TestNumbers {

    /* Aufgabenteil (a) */
    public static void print(Number[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i].toString() + " ");
        }
    }

    /* Aufgabenteil (b) */
    public static void sort(Number[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j].compareTo(numbers[j + 1]) > 0) {
                    Number temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int k = 10;
        Number[] brueche = new Number[k];
        int zaehler = 1, nenner = 0;

        /* Aufgabenteil (d) */
        for (int i = 0; i < brueche.length; i++) {
            zaehler = (int) (Math.random() * 20) + 1; // Laut Aufgabenstellung sollen Zaehler und Nenner zufaellig
                                                      // geneiert werden. Die Beispiel Ausgabe gibt jedoch als Zaehler
                                                      // eine 1 vor. Falls dies gefordert ist, kann man einfach die
                                                      // zufallsgeneration fuer den Zaehler auskommentieren und enthaelt
                                                      // das geforderte Ergebnis.
            nenner = (int) (Math.random() * 20) + 1;

            Bruch bruch = new Bruch(zaehler, nenner);
            brueche[i] = bruch;
        }

        print(brueche);
        sort(brueche);
        System.out.println();
        print(brueche);
    }
}
