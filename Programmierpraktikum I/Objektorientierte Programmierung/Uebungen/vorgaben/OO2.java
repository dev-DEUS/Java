class A {
    int a = 2;
    
    // Konstruktor für die Klasse A, der das Attribut 'a' initialisiert
    public A(int a) {
        this.a = a;
    }
}

class B extends A {
    int b = 0;

    // Konstruktor von B, der das Attribut 'b' initialisiert
    public B(int b) {
        super(b);  // Ruft den Konstruktor von A mit b auf
        this.b = b;  // Setzt das Attribut 'b' von B
    }

    // Parameterloser Konstruktor von B
    public B() {
        this(0);  // Ruft den Konstruktor von B mit b = 0 auf
    }
}

public class OO2 {
    public static void main(String[] args) {
        B b = new B(1);  // Erstellt ein B-Objekt mit dem Wert 1 für 'b'
    }
}
