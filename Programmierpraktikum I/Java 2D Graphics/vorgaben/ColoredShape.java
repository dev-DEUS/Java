import java.awt.*;
import java.awt.geom.*;

public class ColoredShape {
    private Shape shape; // Form
    private Color cInner, cBoundary; // Füllfarbe und Farbe für den Rand der Figur
    private BasicStroke stroke; // Strich für die Unrandung (hier nur Breite einstellbar)
    AffineTransform at = new AffineTransform();
    /* ************************************* */
    /* *** Aufgabe 1a *** */
    /* ************************************* */

    /* Verschiebung um dx horizontal und dy vertikal */
    // 1P
    public void translate(double dx, double dy) {

        at.translate(dx, dy);
    }

    /*
     * Rotation um den Punkt p und um den Winkel theta
     * theta muss im Bogenmaß angegeben werden
     */
    // 1P
    public void rotate(double theta, Point p) {

        at.rotate(theta, p.getX(), p.getY());
    }

    /*
     * Rotation um den Punkt p und um den Winkel theta
     * um das Zentrum der Form
     * theta muss im Bogenmaß angegeben werden
     */
    public void rotate(double theta) {
        Point p = getCenter();
        rotate(theta, p);
    }

    /*
     * Skalierung der Form um den Faktor sx in x-Richtung und sy in y-Richtung
     * Die Skalierung erfolgt so, dass die Zentren der Shapes übereinander liegen
     * Hierzu wird eine entsprechende Verschiebung vorgenommen.
     */
    // 2P
    public void scale(double sx, double sy) {
        Point2D beforeCenter = getCenter();

        at.scale(sx, sy);

        Point2D afterCenter = getCenter();

        double dx = beforeCenter.getX() - afterCenter.getX();
        double dy = beforeCenter.getY() - afterCenter.getY();

        at.translate(dx, dy);
    }

    /*
     * zeichnet die Form:
     * 1. Füllung zeichnen
     * 2. Umrandung mit dem gesetzten Stroke zeichnen
     * Wenn die Farben für das Innere / Äußere den Wert null haben,
     * wird der zugehörige Teil nicht gezeichnet
     */
    // 2P
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        AffineTransform originalTransform = g2.getTransform();
    
        // Erstelle eine Kopie der Transformationsmatrix
        AffineTransform tempTransform = new AffineTransform(at);
        g2.setTransform(tempTransform);
        g2.setStroke(stroke);
        
        if (cInner != null) {
            g2.setColor(cInner);
            g2.fill(shape);
        }
    
        if (cBoundary != null) {
            g2.setColor(cBoundary);
            g2.draw(shape);
        }
    
        g2.setTransform(originalTransform);  // Setzt die ursprüngliche Transformationsmatrix zurück
    }
    

    /* ************************************************************** */
    /* ab hier nichts mehr ändern */
    /* ************************************************************** */

    /* Konstruktor */
    public ColoredShape(Shape shape, Color color1, Color color2, Float f) {
        this.shape = shape;
        this.cInner = color1;
        this.cBoundary = color2;
        if (stroke != null) {
            this.stroke = new BasicStroke(f.floatValue());
        } else {
            this.stroke = new BasicStroke(1.0f);
        }
    }

    /*
     * Kopierkonstruktor
     * Eine neue Shape-Instanz wird durch die Anwendung einer Einheitstransformation
     * durchgeführt.
     */
    public ColoredShape(ColoredShape cShape) {
        this(new AffineTransform().createTransformedShape(cShape.shape),
                cShape.cInner, cShape.cBoundary, cShape.stroke.getLineWidth());
    }

    /*
     * bestimmt das Zentrum der Form durch den Mittelpunkt der Bounding Box
     * und gibt dieses als Punkt zurück
     */
    private Point getCenter() {
        Rectangle r = this.shape.getBounds();
        int cx = (int) (r.getX() + r.getWidth() / 2);
        int cy = (int) (r.getY() + r.getHeight() / 2);
        return new Point(cx, cy);
    }

}
