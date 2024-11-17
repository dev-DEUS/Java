import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.awt.geom.*;

public class OscarGUI extends JFrame{
    private static Nominee[] nominees = Nominee.getNominees();  

    private JComboBox<Integer> years = new JComboBox<>();     // Combobox für Jahre
    private JComboBox<String> categories = new JComboBox<>(); // Combobox für Kategorien
    // (a) + (b) weitere Instanzvariableb
    
    public OscarGUI(){
	super ("Academy Awards GUI");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.createComponents();
	this.pack();
    }

    public void createComponents() {
        JPanel p1 = createControlPanel();
        createCombinedBorder(p1);
        
        JPanel p2 = createTextPanel();
        createCombinedBorder(p2);

        Container c = this.getContentPane();
        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.CENTER);
    }

    /* *** Aufgabe 2a *** */
    // 4
    private JPanel createControlPanel(){
        JPanel p = new JPanel();

        
        return p;
    }

    /* *** Aufgabe 2b *** */
    // 2
    private JPanel createTextPanel() {
        Nominee[] nmArr = FilterUtils.getNomineesInYear(nominees, 2024, "ALL", true);
        
        JPanel p = new JPanel();

        
        return p;
    }

    /* erzeugt einen Text aus den String-Repräsentationen der Elemente
       in dem Feld nmArr
    */
    private String createText(Nominee[] nmArr) {
        StringBuffer sBuf = new StringBuffer();
        for (Nominee nm : nmArr) {
            sBuf.append(nm + "\n");
        }
        return sBuf.toString();
    }

    /* Methode rzeugt einen zweiteiligen Rahmen für eine Komponente. 
       Die Komponente wird durch einen leeren Rahmen (5 Pixel Plat nach oben und
       unten, 10 nach links und rechts) umgeben und dieser wiederum durch eine
       schwarze Linie.
     */
    private static void createCombinedBorder(JComponent c) {
        c.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK),
                                                       BorderFactory.createEmptyBorder(5,10,5,10)));
    }
                

    public static void main(String[] args) {
	OscarGUI gui = new OscarGUI();
	gui.setVisible(true);
    }
    
}
