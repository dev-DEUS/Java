
public class Liste {
	
    private Listenelement head;
    private Listenelement z;
	
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
	    ele.data.print();
	    ele = ele.next;
	}
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
    
    // neues Element mit dem als Parameter übergebenen Daten-Obkekt 
    // am Kopf der Liste einfügen
    public void insert(Ausgabe dataEle){
	Listenelement newEle = new Listenelement();
	newEle.data = dataEle; // nur Referenzkopie
	newEle.next = head.next;
	head.next = newEle;
    }


    /* *** Aufgabenteil (a) *** */
    
    public double getSummeAusgaben(){

        return 0.0;   // Dummy Return: muss ersetzt werden
    }

    /* *** Aufgabenteil (b) *** */
    public Liste getAusgabenListeMonat(String monat){
        
        return null;   // Dummy Return: muss ersetzt werden
    }



    /* *** Aufgabenteil (c) *** */

 
    /* *** Aufgabenteil (d) *** */

 
 


}
