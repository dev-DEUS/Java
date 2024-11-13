public class Bruch implements Number {
    private int zaehler, nenner;

    public Bruch(int z, int n) {
        this.zaehler = z;
        this.nenner = n;
    }

    public String toString() {
        return "(" + this.zaehler + "/" + this.nenner + ")";
    }

    /* Aufgabenteil (c) */
    public double toDouble() {
        return (double) this.zaehler / this.nenner;
    }

    public boolean equals(Number number) {
        if (number == null) {
            return false;
        }

        return Double.compare(this.toDouble(), number.toDouble()) == 0;
    }

    public int compareTo(Number number) {
        double value1 = this.toDouble();
        double value2 = number.toDouble();

        return Double.compare(value1, value2);

    }
}
