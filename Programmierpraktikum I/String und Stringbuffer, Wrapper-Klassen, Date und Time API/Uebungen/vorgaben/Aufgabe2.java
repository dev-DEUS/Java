public class Aufgabe2{
    private double[] zahlen;
    private Double[] zahlObjekte;

    public void initZahlen(int n) {
	zahlen = new double[n];
	zahlObjekte = new Double[n];
    }

    public void setZahl(String s, int index) {
	zahlen[index] = Double.valueOf(s);
	zahlObjekte[index] = Double.valueOf(s);		
    }

    public double add1() {
	double sum = 0.0;
	for (int i = 0; i < zahlen.length; i++) {
	    sum += zahlen[i];
	}

	return sum;
    }

    public double add2() {
	double sum = 0.0;

	for (int i = 0; i < zahlObjekte.length; i++) {
	    sum += zahlObjekte[i].doubleValue();
	}

	return sum;
    }

    public static void main(String[] args){
	Aufgabe2 a2 = new Aufgabe2();
	a2.initZahlen(args.length);
	
	for (int i = 0; i < args.length; i++){
	    a2.setZahl(args[i], i);
	    a2.add1();
	}

	System.out.println("Summe 1: " + a2.add1());
	System.out.println("Summe 2: " + a2.add2());
   }
}
