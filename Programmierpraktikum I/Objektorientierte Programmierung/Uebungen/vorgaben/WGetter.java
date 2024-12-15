import java.io.*;

public class WGetter {
    public static final String filename = "words.txt";

    public static String[] getAllWords (){
	File wfile = new File("./" + filename); // aus aktuellem Verzeichnis laden
	
	StringBuffer buf = getContent(wfile);
	return buf.toString().split("\\n");
    }

    
    public static StringBuffer getContent(File f){
	StringBuffer buf = new StringBuffer();
	try {
	    BufferedReader reader = new BufferedReader(new FileReader(f));
	    String line;
	    while ((line = reader.readLine()) != null){
		buf.append(line.toLowerCase() + "\n");
	    }
	}
	catch (FileNotFoundException fnfe){
	    System.out.println("File " + f + " not found. Ignore!");
	}
	catch(IOException ioe){
	    System.out.println("Problem when reading " +  f);
	    ioe.printStackTrace();
	}
	return buf;
    }

    public static void main(String[] args){
	String[] words = WGetter.getAllWords();
	for (int i=0;i<words.length;i++)
	    System.out.println(words[i]);
    }

}
