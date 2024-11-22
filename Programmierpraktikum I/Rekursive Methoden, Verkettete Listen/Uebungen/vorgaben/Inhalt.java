public class Inhalt {
    private static int count = 0;
    private int nr;
    private String name;

    public Inhalt(String name){
	this.nr = ++count;
	this.name = name;
    }

    public int getNummer(){
	return this.nr;
    }

    public String getName(){
	return this.name;
    }

    public String toString(){
	return "Nr. " + this.nr + ": " + this.name;
    }


}
 
