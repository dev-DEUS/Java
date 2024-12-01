import java.awt.geom.*;
import java.awt.*;

public class CustomShape {
    Rectangle2D.Double r = new Rectangle2D.Double(4, 0, 2, 80);
    Polygon triangle = new Polygon();
    Area arrow;

    public CustomShape() {
        // Dreieck
        triangle.addPoint(0, 0); // Linke Ecke
        triangle.addPoint(10, 0); // Rechte Ecke
        triangle.addPoint(5, -30); // Spitze

        // Zusammenfuegen der beiden Formen um ein Pfeil zu bilden
        arrow = new Area(r);
        arrow.add(new Area(triangle));

    }

    public Shape getShape() {
        return arrow;
    }
}
