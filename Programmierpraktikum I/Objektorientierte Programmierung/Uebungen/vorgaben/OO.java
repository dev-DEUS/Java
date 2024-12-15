class Punkt1D {
    private double x;

    // Getter und Setter für x
    public double getX() {
	return x;
    }

    public void setX(double x) {
	this.x = x;
    }

    // Konstruktor von Punkt1D
    public Punkt1D(double x) {
	this.x = x;
    }

    public String toString() {
	return "x: " + x;
    }
}

class Punkt2D extends Punkt1D {
    private double y;

    // Getter und Setter für y
    public double getY() {
	return y;
    }

    public void setY(double y) {
	this.y = y;
    }

    // Konstruktor für Punkt2D
    public Punkt2D(double x, double y) {
        super(x);
	this.y = y;
    }

    public String toString() {
	return super.toString() + ", y: " + y;
    }
}

class Punkt3D extends Punkt2D {
    private double z;

    // Getter und Setter für z
    public double getZ() {
	return z;
    }

    public void setZ(double z) {
	this.z = z;
    }

    // Konstruktor für Punkt3D
    public Punkt3D(double x, double y, double z) {
        super(x,y);
	this.z = z;
    }

    public String toString() {
	return super.toString() + ", z: " + z;
    }

    public double abstand(Punkt3D andererPunkt) {
	double dx = andererPunkt.getX() - this.getX();
        double dy = andererPunkt.getY() - this.getY();
        double dz = andererPunkt.getZ() - this.getZ();

	return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class OO {
    public static void main(String[] args) {
        // Erstellen zweier Punkt3D-Objekte
        Punkt3D punkt1 = new Punkt3D(1.0, 2.0, 3.0);
        Punkt3D punkt2 = new Punkt3D(4.0, 6.0, 8.0);

        // Ausgabe der Punkt3D-Objekte
        System.out.println("Punkt 1: " + punkt1);
        System.out.println("Punkt 2: " + punkt2);

        // Berechnung des Abstands zwischen den beiden Punkten
        double abstand = punkt1.abstand(punkt2);
        System.out.println("Abstand zwischen den Punkten: " + abstand);
    }
}
