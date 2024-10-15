import java.util.List;
import java.util.ListIterator;

public class Liste {

    private Listenelement head;
    private Listenelement z;

    // leere Liste erzeugen
    public Liste() {
        head = new Listenelement();
        z = new Listenelement();
        head.data = null;
        head.next = z;
        z.data = null;
        z.next = z;
    }

    // Ausgabe aller Elemente der Liste
    public void print() {
        Listenelement ele = head.next;
        while (ele != z) {
            ele.data.print();
            ele = ele.next;
        }
    }

    // Länge der Liste bestimmen: iterativ
    private int length() {
        int count = 0;
        Listenelement help = head.next;

        while (help != z) {
            ++count;
            help = help.next;
        }

        return count;
    }

    // neues Element mit dem als Parameter übergebenen Daten-Obkekt
    // am Kopf der Liste einfügen
    public void insert(Ausgabe dataEle) {
        Listenelement newEle = new Listenelement();
        newEle.data = dataEle; // nur Referenzkopie
        newEle.next = head.next;
        head.next = newEle;
    }

    /* *** Aufgabenteil (a) *** */

    public double getSummeAusgaben() {
        double summe = 0.0;
        double betrag = 0.0;
        Listenelement ele = head.next;
        while (ele != z) {
            betrag = ele.data.getBetrag();
            summe += betrag;
            ele = ele.next;
        }
        return summe;
    }

    /* *** Aufgabenteil (b) *** */
    public Liste getAusgabenListeMonat(String monat) {
        Listenelement ele = head.next;
        Liste neueListe = new Liste();
        while (ele != z) {
            if (ele.data.istImMonat(monat)) {
                neueListe.insert(ele.data);
            }
            ele = ele.next;
        }

        return neueListe;
    }

    /* *** Aufgabenteil (c) *** */
    public boolean groesser(Listenelement e1, Listenelement e2) {

        return e1.data.getTag() > e2.data.getTag();
    }

    public void tausche(Listenelement e1, Listenelement e2) {
        if (groesser(e1, e2)) {
            Ausgabe temp = e1.data;
            e1.data = e2.data;
            e2.data = temp;
        }
    }

    public void sort() {
        Listenelement e1 = head.next;
        Listenelement e2 = e1.next;

        for (int i = 0; i < length() - 1; i++) {
            e1 = head.next;
            e2 = e1.next;
            while (e2 != z) {
                if (groesser(e1, e2)) {
                    tausche(e1, e2);
                }
                e1 = e2;
                e2 = e1.next;
            }
        }
    }

    /* *** Aufgabenteil (d) *** */
    public void tausche(Listenelement p, Listenelement e1, Listenelement e2) {
        if (groesser(e1, e2)) {
            p.next = e2;
            e1.next = e2.next;
            e2.next = e1;
        }

    }

    public void sort2() {
        for (int i = 0; i < length() - 1; i++) {
            Listenelement p = head;
            Listenelement e1 = p.next;
            Listenelement e2 = e1.next;
            while (e2 != z) {
                if (groesser(e1, e2)) {
                    tausche(e1, e2);
                }
                p = e1;
                e1 = e2;
                e2 = e2.next;
            }
        }

    }
}
