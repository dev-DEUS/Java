public class DynStack extends DynSequence {
    // Fuegt einen Wert am Ende des Stacks hinzu
    public void push(double wert) {
        insertValueAt(size(), wert);
    }

    // Entfernt den Wert am Ende des Stacks und gibt ihn zurueck
    public double pop() {
        if (isEmpty()) {
            return Double.NaN;
        }
        return removeValueAt(size() - 1);
    }

    public static void main(String[] args) {
        DynStack werte = new DynStack();

        // Fuegt zufaellige Werte zum Stack hinzu
        for (int i = 1; i <= 5; i++) {
            werte.push((int) (Math.random() * 100));
            System.out.println(werte); // Gibt den aktuellen Zustand des Stacks aus
        }
        double summe = 0.0;

        // Entfernt alle Werte vom Stack und berechnet die Summe
        for (int i = 4; i >= 0; i--) {
            summe += werte.pop();
            System.out.println(werte); // Gibt den aktuellen Zustand des Stacks aus
        }
        System.out.println("Summe: " + summe); // Gibt die Summe der entfernten Werte aus
    }
}
