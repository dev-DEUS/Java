class A {
    int a = 1;
}

class B extends A {
    int b = 2;
}

class C extends B { // Es ist nicht erlaubt, 2 Klassen gleichzeitig zu veerben. Wenn wir in class C die class B veerbt bekommen, erben wir auch gleichzeitig class A
    int c = 3;
}

public class OO3 {
    public static void main(){
	C c = new C();
    }
}
