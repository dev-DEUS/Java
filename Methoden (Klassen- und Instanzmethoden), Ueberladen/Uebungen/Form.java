// Aufgabe 4
class Punkt {
    public double x;
    public double y;
}

class Strecke {
    public Punkt from;
    public Punkt to;
}

public class Form {
    public Strecke[] streckenzug;

    public static void main(String[] args) {
        Punkt p1 = new Punkt(); // p1(0,0)
        p1.x = 0;
        p1.y = 0;
        Punkt p2 = new Punkt(); // p2(5,0)
        p2.x = 5;
        p2.y = 0;
        Punkt p3 = new Punkt(); // p3(5,5)
        p3.x = 5;
        p3.y = 5;
        Punkt p4 = new Punkt(); // p4(0,5)
        p4.x = 0;
        p4.y = 5;

        Strecke s1 = new Strecke(); // s1(p1, p2); s1.from(0,0) -> s1.to(5,0)
        s1.from = p1;
        s1.to = p2;
        Strecke s2 = new Strecke(); // s2(p2,p3); s2.from(5,0) -> s2.to(5,5)
        s2.from = p2;
        s2.to = p3;
        Strecke s3 = new Strecke(); // s3(p3,p4); s3.from(5,5) -> s3.to(0,5)
        s3.from = p3;
        s3.to = p4;
        Strecke s4 = new Strecke(); // s4(p4,p1); s4.from(0,5) -> s4.to(0,0)
        s4.from = p4;
        s4.to = p1;
        Form form = new Form();
        form.streckenzug = new Strecke[] { s1, s2, s3, s4 };
        // *** hier ***
        form.streckenzug[1].to.y = 3; // Aenderung vom y-Wert des Punktes p3 von 5 auf 3. Vorher: p3(5,5); Nachher: p3(5,3)
        form.streckenzug[3].from.y = 3; // Aenderung vom y-Wert des Punktes p4 von 5 auf 3. Vorher p4(0,5); Nachher: p4(0,3) 
        // *** und hier ***
        // Nun repraesentiert form nicht mehr ein Rechteck, sondern ein Tapez.
    }
}