public class DynQueue extends DynSequence {
    // Fuegt einen Wert am Ende der Queue hinzu
    public void enqueue(double wert) {
        insertValueAt(size(), wert);
    }

    // Entfernt den Wert am Anfang der Queue und gibt ihn zurueck
    public double dequeue() {
        if (isEmpty()) {
            return Double.NaN;
        }
        return removeValueAt(0);
    }

    public static void main(String[] args) {
        DynQueue werte = new DynQueue();

        // Fuegt zufaellige Werte zur Queue hinzu
        for (int i = 1; i <= 5; i++) {
            werte.enqueue((int) (Math.random() * 100));
            System.out.println(werte);
        }
        double summe = 0.0;

        // Entfernt alle Werte aus der Queue und berechnet die Summe
        for (int i = 4; i >= 0; i--) {
            summe += werte.dequeue();
            System.out.println(werte);
        }
        System.out.println("Summe: " + summe);
    }
}
