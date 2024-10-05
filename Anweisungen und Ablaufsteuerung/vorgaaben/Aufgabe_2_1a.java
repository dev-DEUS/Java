
public class Aufgabe_2_1a {
    public static void main(String[] args){
	/* *** Aufgabenteil (a)  *** */
	/* 
	// TODO
        Die for-Schleife nimmt i den vom Nutzer angegeben Wert a an, und laeuft solange, bis i kleiner oder gleich b ist
	und erhoeht nach jedem Durchlauf i um +1;
	In der Schleife selbst werden 4 cases zur Verfuegung gestellt, die je nach dem Wert i folgendes ausloesen:
	Case 1 - 3 werden unterbrochen, also r1 wird keinem Wert zugewiesen und i erhoeht sich um +1.
	Wann immer i ein vielfache von 4 ist (also 4, 8, 12, 16...) wird der default ausgeloest, wobei dort r1 um +1 erhoeht
	wird. Die Ueberpruefung laeuft vom Intervall a bis b.
	Nachdem die Schleife vollstaendig durchlaufen ist, wird der Wert von r1 ausgegeben.
	*/
	int a = IOTools.readInteger("a = ");
	int b = IOTools.readInteger("b = ");
	int r1 = 0;

	for (int i=a;i<=b;i++){
	    switch(i%4){
	    case 1:
	    case 2:
	    case 3:
		break;
	    default:
		r1++;
		break;
	    }
	}
	System.out.println("r1 = " +  r1);
    }
}
