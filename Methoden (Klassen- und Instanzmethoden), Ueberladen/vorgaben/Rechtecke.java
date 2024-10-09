class Punkt {
    public int x, y;
}

class Rechteck {
    public String name;
    public Punkt loEcke; // linke, obere Ecke
    public int breite, hoehe;
}

public class Rechtecke {

    /* *** Aufgabenteil (a) *** */
    public static void fuellen(Rechteck[] rechtecke) {
        for (int i = 0; i < rechtecke.length; i++) {
            Rechteck myRechteck = new Rechteck();
            myRechteck.name = "R" + (i + 1);

            myRechteck.loEcke = new Punkt();
            myRechteck.loEcke.x = (int) (Math.random() * 10);
            myRechteck.loEcke.y = (int) (Math.random() * 10);

            myRechteck.breite = (int) (Math.random() * 50) + 1;
            myRechteck.hoehe = (int) (Math.random() * 50) + 1;

            rechtecke[i] = myRechteck;
        }
    }

    /* *** Aufgabenteil (b) *** */
    public static void ausgeben(Rechteck[] rechtecke) {
        for (int i = 0; i < rechtecke.length; i++) {
            System.out.println((i + 1) + ". Rechteck");
            System.out.println("   Ecke:\t(" + rechtecke[i].loEcke.x + "|" + rechtecke[i].loEcke.y + ")");
            System.out.println(
                    "   Groesse:\t" + rechtecke[i].breite + " x " + rechtecke[i].hoehe + " = " + groesse(rechtecke[i]));
            System.out.println("----------------");
        }
    }

    public static int groesse(Rechteck r) {
        return r.breite * r.hoehe;
    }

    /* *** Aufgabenteil (c) *** */
    public static int findeIndexVonMin(Rechteck[] rechtecke, int vonIndx) {

        int minGroesse = groesse(rechtecke[vonIndx]);
        int indexGroesse = vonIndx;
        for (int i = vonIndx; i < rechtecke.length; i++) {
            if (groesse(rechtecke[i]) < minGroesse) {
                minGroesse = groesse(rechtecke[i]);
                indexGroesse = i;
            }
        }
        return indexGroesse;
    }

    public static void sortieren(Rechteck[] rechtecke) {
        // Unzulaessige Eingaben von vonIndx werden verhindert (nicht sortiert).

        for (int i = 0; i < rechtecke.length; i++) {
            Rechteck temp = rechtecke[i];
            int indexFound = findeIndexVonMin(rechtecke, i);

            rechtecke[i] = rechtecke[indexFound];
            rechtecke[indexFound] = temp;
        }
    }

    public static void main(String[] args) {
        int N = 5;
        Rechteck[] rechtecke = new Rechteck[N];

        System.out.println("Vor der Sortierung:");
        fuellen(rechtecke);
        ausgeben(rechtecke);
        System.out.println("\n\nAb hier geaendert:");
        sortieren(rechtecke);
        ausgeben(rechtecke);
    }
}
