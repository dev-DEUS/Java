
public class Aufgabe_2_1b {
    public static void main(String[] args){
	/* *** Aufgabenteil (b)  *** */
	/* 
	   // TODO
	   n = (n * (n + 1)) / 2

	   Mit der while Bedingung wird ueberprueft, ob a groeßer als b ist. Falls dies erfuellt ist, wird bei jedem Durchlauf
	   zu r2, a + b addiert und a dekrementiert und b inkrementiert. Dies sorgt dafuer, dass a nicht fuer immer groeßer
	   als b ist und somit die Schleife nie abbricht. Sobald a nicht mehr groeßer als b ist, wird die while Schleife
	   unterbrochen. Dann wird ueberprueft, ob a = b (im Code a == b) ist. In dem Fall wird r2 nochmals um den letzten
	   Wert von a erhoeht und zum Schluss ausgegeben.
	 */
	int n = IOTools.readInteger("n = ");
	int a = n;
	int b = 1;
	int r2 = 0;
	
	while (a > b){
	    r2 += (a + b);
	    a--;
	    b++;
	}
	if (a == b){
	    r2 += a;
	}
	System.out.println("r2 = " +  r2);
    }
}
