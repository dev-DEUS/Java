// Aufgabe 2
public class ObjRef {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        ObjRef[] hq = new ObjRef[5];
        while (x < 3) {
            hq[x] = new ObjRef();
            hq[x].id = ++x;
        }

        hq[3] = hq[1]; // hq[3] zeigt auf hq[1]
        hq[4] = hq[1]; // h1[4] zeigt auf h1[1]
        hq[3] = null;  // h1[3] wird auf null gesetzt
        hq[4] = hq[0]; // hq[4] zeigt auf hq[0]
        hq[0] = hq[3]; // h1[0] wird auf null gesetzt, da hq[3] null ist
        hq[3] = hq[2]; // hq[3] zeigt auf hq[2]
        hq[2] = hq[0]; // hq[2] wird auf null gesetzt, da hq[0] null ist

        // Endstand:
        // hq[0] = null
        // hq[1] = Objekte mit id = 2
        // hq[2] = null
        // hq[3] = Objekte mit id = 3
        // hq[4] = null
    }
}