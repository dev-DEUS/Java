import java.awt.event.*;

public class PuzzleListener implements ActionListener {
   private PuzzlePanel parent;

   public PuzzleListener(PuzzlePanel parent) {
      this.parent = parent;
   }

   public void actionPerformed(ActionEvent e) {
      ZahlButton zb = (ZahlButton) e.getSource();

      if (!zb.istLeerfeld()) {
         if (parent.checkLeerteilNachbar(zb) != null) {
            
         }
      }
   }
}
