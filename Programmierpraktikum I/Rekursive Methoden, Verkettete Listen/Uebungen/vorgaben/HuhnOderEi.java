public class HuhnOderEi{
    public static void main(String[] args){
	String urahn = "Emma";
	Huhn h = new Huhn(null,urahn);
	Ei ei;
	for (int i=1;i<=10;i++){
	    ei = h.legEinEi();
	    h = ei.schluepfen(urahn + "-" + ++Huhn.count);
	}

	System.out.println(h);
    }
}
