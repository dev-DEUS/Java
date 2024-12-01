import java.awt.*;
import java.awt.geom.*;

public class ShapeSequenceCreator {
    private ShapeAnimFrame.AnimCanvas aCanv;
    private int w, h;

    public ShapeSequenceCreator(int w, int h, ShapeAnimFrame.AnimCanvas aCanv) {
        this.aCanv = aCanv;
        this.w = w;
        this.h = h;

        /* *** rotierendes Windraedchen *** */

        /*
         * ColoredShape cShape1 = createShape_1();
         * ColoredShape[] shapeArr1 = createSequence_1(cShape1);
         * aCanv.addShapeSequence(shapeArr1);
         */

        /* für Aufgabe 1c den folgenden Blockkommentar entfernen */

        ColoredShape cShape2 = createShape_2();
        ColoredShape[] shapeArr2 = createSequence_2(cShape2);
        aCanv.addShapeSequence(shapeArr2);

    }

    /* *** Aufgabe 1c *** */

    public ColoredShape createShape_2() {
        CustomShape customShape = new CustomShape();
        Shape arrowShape = customShape.getShape();
        ColoredShape coloredArrow = new ColoredShape(arrowShape, Color.WHITE, Color.WHITE, 15.0f);

        coloredArrow.translate(50, 20);
        return coloredArrow;
    }

    public ColoredShape[] createSequence_2(ColoredShape shape) {
        ColoredShape[] shapeArr = new ColoredShape[500];
        shapeArr[0] = shape;

        double translateY = 0.0;
        double translateYIncrement = 1.5; // Anfangsbewegung Y-Achse

        double totalRotation = 0.0;
        double rotationIncrement = Math.toRadians(5); // Rotiert um 5 Grad pro Frame

        for (int i = 1; i < shapeArr.length; i++) {

            shapeArr[i] = new ColoredShape(shapeArr[0]);

            translateY += translateYIncrement; // Aktualisierung der gesamten Verschiebung
            shapeArr[i].translate(100, translateY); // Anwednung der Verschiebung und Startpunkt auf x = 100

            totalRotation += rotationIncrement; // Aktualisierung der gesamten Verschiebung

            if (totalRotation > 2 * Math.PI) { // Rotation im Bereich zwischen 0 und 2Pi
                totalRotation -= 2 * Math.PI;
            }

            shapeArr[i].rotate(totalRotation); // Anwendung der Rotation
        }

        return shapeArr;
    }

    /* *** Beispielcode (Rotation) *** */
    /*
     * public ColoredShape createShape_1() {
     * Shape shape = Windraedchen.getShape();
     * double sw = shape.getBounds().getWidth();
     * double sh = shape.getBounds().getHeight();
     * ColoredShape cShape = new ColoredShape(shape, Color.BLUE, Color.ORANGE,
     * 3.0f);
     * cShape.translate((w - sw) / 2, (h - sh) / 2);
     * return cShape;
     * }
     * 
     * public ColoredShape[] createSequence_1(ColoredShape shape) {
     * ColoredShape[] shapeArr = new ColoredShape[200];
     * shapeArr[0] = shape;
     * 
     * double dTheta = 2.0 * Math.PI / shapeArr.length;
     * for (int i = 1; i < shapeArr.length; i++) {
     * shapeArr[i] = new ColoredShape(shapeArr[0]);
     * shapeArr[i].rotate(i * dTheta);
     * }
     * 
     * return shapeArr;
     * }
     */

}
