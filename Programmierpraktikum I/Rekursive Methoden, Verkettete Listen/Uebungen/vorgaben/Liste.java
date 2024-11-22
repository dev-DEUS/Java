// Aufgabe 4

public class Liste {

    // innere Klasse
    public class Listenelement {
	Inhalt data;
	Listenelement next;


	public String toString(){
	    return data.toString();
	}
    }
	
    Listenelement head;
    Listenelement z;
	
    // leere Liste erzeugen
    public Liste(){
	head = new Listenelement();
	z = new Listenelement();
	head.data = null;
	head.next = z;
	z.data = null;
	z.next = z;
    }
	
    // Ausgabe aller Elemente der Liste
    public void print(){
	Listenelement ele = head.next;
	while (ele != z){
	    System.out.println(ele.data);
	    ele = ele.next;
	}
    }
    
  
    // neues Element mit dem als Parameter übergebenen Daten-Objekt 
    // am Kopf der Liste einfügen
    public void insert(Inhalt dataEle){
	Listenelement newEle = new Listenelement();
	newEle.data = dataEle; // nur Referenzkopie
	newEle.next = head.next;
	head.next = newEle;
    }


    // Länge der Liste bestimmen: iterativ
    private int length(){
	int count = 0;
	Listenelement help = head.next;
	
	while (help != z){
	    ++count;
	    help = help.next;
	}

	return count;
    }
	
    // Länge der Liste bestimmen: rekursiv 
    private int lengthR(Listenelement ele){
	if (ele == z){
	    return 0;
	}
	else {
	    return 1 + lengthR(ele.next);
	}
    }

    // Länge der Liste bestimmen: Aufruf von außen mit
    // Weiterleitung an rekursive Methode
    public int lengthR(){
	return lengthR(head.next);
    }





      
    public static void main(String[] args) {
	Liste liste = new Liste(); // neue Liste anlegen
	// Liste füllen
	liste.insert(new Inhalt("alpha"));
	liste.insert(new Inhalt("beta"));
	liste.insert(new Inhalt("gamma"));
	liste.insert(new Inhalt("delta"));
	liste.insert(new Inhalt("epsilon"));	
	

	System.out.println("Erstes Listenelement: ");
        //	System.out.println(liste.first());
	System.out.println("Letztes Listenelement: ");
        //      System.out.println(liste.last());
	System.out.println();

	// Liste ausgeben 
	System.out.println("Liste ausgeben");
	liste.print();
	System.out.println("Liste rekursiv ausgeben (rechts nach links)");
	//liste.printRek();
	System.out.println("Liste rekursiv ausgeben (links nach rechts)");
	//liste.printRek2();
	System.out.println();

	// i-tes Element ausgeben (i = 1,3,5,7)
	for (int i : new int[] {1,3,5,7}){
            //	    Inhalt data = liste.nth(i);
	    //      System.out.println(i +  ".tes Element: " + data);
	}
	System.out.println();

	// Liste als Feld
	System.out.println("\nFeldinhalt 1:");
	// Inhalt[] feld = liste.toArray();
	// for (Inhalt in : feld){
	//     System.out.println(in);
	// }

	System.out.println("\nElemente an Position 1, 2, n (am Ende) einfügen:\n");
	Inhalt t1 = new Inhalt("test-1");
	Inhalt t2 = new Inhalt("test-2");

	//liste.insertAt(t1,1);
	//liste.insertAt(t2,2);
	int n = liste.length();
	Inhalt tn = new Inhalt("test-n");
	//liste.insertAt(tn,n+1);	    
	liste.print();
        System.out.println("--------------");
	liste.print();
        System.out.println("--------------");
        //Liste rListe = liste.reverse();
        //rListe.print();

   }

}
