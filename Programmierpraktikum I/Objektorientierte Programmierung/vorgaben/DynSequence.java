public class DynSequence {
    private double[] array;

    public DynSequence() {
        array = new double[0];
    }

    public int size() {
        return array.length;
    }

    /* Aufgabe 2a */

    // Prueft, ob das Array leer ist (d.h. keine Elemente enthaelt)
    public boolean isEmpty() {
        if (array.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Fuegt einen Wert an einer bestimmten Stelle (Index) in das Array ein
    public void insertValueAt(int index, double wert) {
        // Prueft, ob der Index ausserhalb der erlaubten Grenzen liegt, und korrigiert
        // ihn
        if (index < 0) {
            index = 0;
        } else if (index > size()) {
            index = size();
        }

        // Erstellt ein neues Array, das um ein Element groesser ist
        double[] newArray = new double[size() + 1];

        // Kopiert die alten Werte und fügt den neuen Wert an der entsprechenden Stelle
        // ein
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (index == i) { // Fuegt den neuen Wert an der richtigen Stelle ein
                newArray[i] = wert;
            } else { // Kopiert die alten Werte
                newArray[i] = array[j];
                j++;
            }
        }
        // Aktualisiert das Array mit dem neuen Array
        array = newArray;
    }

    // Entfernt den Wert an einer bestimmten Stelle (Index) aus dem Array
    public double removeValueAt(int index) {
        // Prueft, ob der Index ungueltig ist (zu klein oder zu gross)
        if (index < 0 || index >= size()) {
            return Double.NaN; // Gibt NaN zurueck, wenn der Index ungueltig ist
        }

        // Erstellt ein neues Array, das um ein Element kleiner ist
        double[] newArray = new double[size() - 1];
        double removedValue = array[index]; // Speichert den zu entfernenden Wert

        // Kopiert die Werte in das neue Array, ueberspringt den zu entfernenden Wert
        for (int i = 0, j = 0; i < array.length; i++) {
            if (index == i) { // Ueberspringt den zu entfernenden Wert
                continue;
            }
            newArray[j++] = array[i];
        }
        // Aktualisiert das Array mit dem neuen Array
        array = newArray;

        return removedValue; // Gibt den entfernten Wert zurueck
    }

    // Gibt den Inhalt des Arrays als Zeichenkette zurueck
    public String toString() {
        StringBuffer buf = new StringBuffer("Inahlt: ");

        for (int i = 0; i < array.length; i++) {
            buf.append(" ").append(array[i]); // Fuegt jedes Element des Arrays zur Zeichenkette hinzu
        }
        return buf.toString();
    }

    // Main-Methode zum Testen der Klasse DynSequence
    public static void main(String[] args) {
        DynSequence werte = new DynSequence();

        // Fuegt Werte von 9.5 bis 0.5 in das Array ein
        for (double i = 9.5; i >= 0.5; i -= 1.0) {
            werte.insertValueAt(werte.size(), i); // Fuegt jeden Wert am Ende des Arrays ein
        }
        System.out.println(werte);

        // Entfernt mehrere Werte aus dem Array und gibt das Ergebnis aus
        werte.removeValueAt(werte.size() - 2); // Entfernt das zweitletzte Element
        System.out.println(werte);
        werte.removeValueAt(werte.size() - 3); // Entfernt das drittletzte Element
        System.out.println(werte);
        werte.removeValueAt(werte.size() - 4); // Entfernt das viertletzte Element
        System.out.println(werte);
    }
}
