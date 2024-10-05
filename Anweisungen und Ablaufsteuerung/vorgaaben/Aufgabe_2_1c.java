
public class Aufgabe_2_1c {
    public static void main(String[] args){
	/* *** Aufgabenteil (c)  *** */
	/* 
	// TODO
	Binomische Formel: a^2 + 2*a*b + b^2

	Zunaechst wird in einer Schleife b insgesamt a Mal zu y addiert, was a * b ergibt.
	Gleichzeitig erhoeht eine verschachtelte Schleife x um 1 für jede Kombination von i und j, insgesamt also a^2 Mal.
	Dann wird in einer weiteren Schleife a insgesamt b Mal zu y addiert, wodurch sich y um weitere a * b erhoeht
	(insgesamt 2*a*b).
	Eine weitere verschachtelte Schleife erhoeht z um 1 für jede Kombination von i und j, insgesamt b^2 Mal.
	Am Ende summiert das Programm die Werte von x, y und z, die den Termen a^2, 2ab und b^2 entsprechen.
	Es berechnet somit a^2 + 2*a*b + b^2 und gibt das Ergebnis r3 aus.
	*/
	int a = IOTools.readInteger("a = ");
	int b = IOTools.readInteger("b = ");
	int r3 = 0;
	int x=0,y=0,z=0;

	for (int i=1;i<=a;i++){
	    y += b;
	    for (int j=1;j<=a;j++,x++){}
	}

	for (int i=1;i<=b;i++){
	    y += a;
	    for (int j=1;j<=b;j++,z++){}
	}	
	
	r3 = x + y + z;
	
	System.out.println("r3 = " +  r3);
    }
}
