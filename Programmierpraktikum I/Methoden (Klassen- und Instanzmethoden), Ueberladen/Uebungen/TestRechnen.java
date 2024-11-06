public class TestRechnen {

    public static void main(String[] args){
	int z1 = IOTools.readInteger("-->Zahl 1: ");
	int z2 = IOTools.readInteger("-->Zahl 2: ");

	System.out.println("Absolutbetrag von " + z1 + " = " + Rechnen.abs(z1));
	System.out.println("Negation von  " + z1 + " = " + Rechnen.neg(z1));
	System.out.println("Quadrat von " + z1 + " = " + Rechnen.sqr(z1));
	System.out.println(z1 + " hoch " + z2 + " = " + Rechnen.pow(z1,z2));
	
	int n = IOTools.readInteger("-->n: ");
 	System.out.println("1 + 1/2 + ... + 1/" + n + " = " + Rechnen.harmSum(n));
 	System.out.println("1 * 2 * ... * " + n + " = " + Rechnen.fak(n));

	int len = IOTools.readInteger("-->Feldlaenge: ");
	int feld[] = new int[len];
	for (int i=0;i<len;i++) {
	    feld[i] = IOTools.readInteger("-->feld[" +  i + "] = ");
	}
	System.out.println("Maximum ist: " + Rechnen.max(feld));
	
 }
    
}
