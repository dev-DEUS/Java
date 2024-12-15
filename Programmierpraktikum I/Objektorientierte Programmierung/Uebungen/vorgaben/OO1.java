Class A {
    int a = 2;

    public A(int a){
    	this.a = a;
    }
}

class B extends A {
    int b;

    public B(int b){
	// Die Klasse B erbt von der Klasse A. Das es einen Standard-Konstruktor in A gibt, erwartet der Compiler
	// den Aufruf dieses Konstruktors, welches jedoch hier fehlt.
	// Dies behabt man, indem man super(b) initialisiert, welches den Konstruktor von A aufruft.
	this.b = b;
    }
}

public class OO1 {
    public static void main(){
	B b = new B(1);
    }
}

