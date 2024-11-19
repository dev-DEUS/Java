import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class OscarGUI extends JFrame {
    private static Nominee[] nominees = Nominee.getNominees();

    private JComboBox<Integer> years = new JComboBox<>(); // Combobox für Jahre
    private JComboBox<String> categories = new JComboBox<>(); // Combobox für Kategorien
    // (a) + (b) weitere Instanzvariableb
    private JCheckBox box = new JCheckBox();
    private JTextArea text = new JTextArea();

    // (c)
    public static final Color controlPanelColor = new Color(218, 165, 32);
    public static final Color textPanelColor = new Color(245, 222, 179);

    public OscarGUI() {
        super("Academy Awards GUI");
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
    private JPanel createControlPanel() {
        JPanel p = new JPanel();

        // 1. Punkt
        for (int i = 1928; i <= 2024; i++) {
            years.addItem(i);
        }
        years.setSelectedItem(2024);

        // 2. Punkt
        categories.addItem("ALL ");
        for (int i = 0; i < Nominee.CATEGORIES.length; i++) {
            categories.addItem(Nominee.CATEGORIES[i]);
        }
        categories.setSelectedIndex(0);

        // 3. Punkt
        box = new JCheckBox();

        // 4. Punkt
        JLabel yearLabel = new JLabel("Year: ");
        yearLabel.setHorizontalAlignment(JLabel.RIGHT);
        JLabel categoryLabel = new JLabel("Category: ");
        categoryLabel.setHorizontalAlignment(JLabel.RIGHT);
        JLabel winnerLabel = new JLabel("Show Winners Only: ");
        winnerLabel.setHorizontalAlignment(JLabel.RIGHT);

        // 5. Punkt
        p.setLayout(new GridLayout(3, 2, 20, 5));
        p.setOpaque(true);
        p.setBackground(controlPanelColor);

        p.add(yearLabel);
        p.add(years);

        p.add(categoryLabel);
        p.add(categories);

        p.add(winnerLabel);
        p.add(box);

        JPanel p2 = new JPanel();
        p2.setPreferredSize(new Dimension(350, 100));
        p2.add(p);
        p2.setBackground(controlPanelColor);

        return p2;
    }

    /* *** Aufgabe 2b *** */
    // 2
    private JPanel createTextPanel() {
        Nominee[] nmArr = FilterUtils.getNomineesInYear(nominees, 2024, "ALL", true);

        JPanel p = new JPanel();
        p.setOpaque(true);
        createCombinedBorder(p);

        text = new JTextArea(15, 40);
        text.setBackground(textPanelColor);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(text);

        text.setText(createText(nmArr));

        p.add(scrollPane);
    
        return p;
    }

    /*
     * erzeugt einen Text aus den String-Repräsentationen der Elemente
     * in dem Feld nmArr
     */
    private String createText(Nominee[] nmArr) {
        StringBuffer sBuf = new StringBuffer();
        for (Nominee nm : nmArr) {
            sBuf.append(nm + "\n");
        }
        return sBuf.toString();
    }

    /*
     * Methode rzeugt einen zweiteiligen Rahmen für eine Komponente.
     * Die Komponente wird durch einen leeren Rahmen (5 Pixel Plat nach oben und
     * unten, 10 nach links und rechts) umgeben und dieser wiederum durch eine
     * schwarze Linie.
     */
    private static void createCombinedBorder(JComponent c) {
        c.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    }

    public static void main(String[] args) {
        OscarGUI gui = new OscarGUI();
        gui.setVisible(true);
    }

}
