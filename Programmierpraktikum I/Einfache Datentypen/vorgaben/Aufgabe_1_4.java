
public class Aufgabe_1_4 {
    public static void main(String[] args){
	int parkbeginnS = IOTools.readInteger("Parkbeginn, Stunde: ");
    int parkbeginnM = IOTools.readInteger("Parkbeginn, Minute: ");
    int parkendeS = IOTools.readInteger("Parkende, Stunde: ");
    int parkendeM = IOTools.readInteger("Parkende, Minute: ");

    int parkdauerbeginn = parkbeginnS * 60 + parkbeginnM;
    int parkdauerende = parkendeS * 60 + parkendeM;

    int parkdauer = parkdauerende - parkdauerbeginn;
    int parkdauerstunden = parkdauer / 60;
    int parkdauerminuten = parkdauer % 60;

    double parkgebuehr = (parkdauerminuten == 0) ? parkdauerstunden * 1.5 : (parkdauerstunden + 1) * 1.5;
    System.out.println("Parkdauer: " + parkdauerstunden + " Stunde(n) " + parkdauerminuten + " Minuten");
    System.out.println("Parkgebuehr: " + parkgebuehr + " \u20AC");
   }
}
