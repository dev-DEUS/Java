import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class PuzzleListener implements ActionListener {
   private PuzzlePanel parent;

   public PuzzleListener(PuzzlePanel parent) {
      this.parent = parent;
   }

   public void actionPerformed(ActionEvent e) {
      ZahlButton zb = (ZahlButton) e.getSource();

      if (!zb.istLeerfeld()) {
         ZahlButton zbCheck = parent.checkLeerteilNachbar(zb);
         if (zbCheck != null) {
            zbCheck.tauscheMit(zb);
            parent.update();
         }
      }

      if (parent.fertig()) {
         String[] optionen = {"Neues Spiel", "Beenden"};
         int spielEnde = JOptionPane.showOptionDialog(null, "Fertig in " + parent.getAnzahlZuege(), "Spielende", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionen, optionen[0]);

         if (spielEnde == JOptionPane.YES_OPTION) {
            parent.neuesSpiel();
         }

         if (spielEnde == JOptionPane.NO_OPTION) {
            System.exit(0);
         }
         
      }
   }
}
