package Projekte.Taschenrechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class TaschenrechnerGUI extends JFrame{
    Container c;
    
    public TaschenrechnerGUI() {
        JFrame window = new JFrame();
        window.setTitle("Taschenrechner");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 800);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        TaschenrechnerGUI tGUI = new TaschenrechnerGUI();
        
    }
}
