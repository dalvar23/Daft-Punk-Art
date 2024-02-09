package art;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class TriangleMouth extends Pane {
	/**
	 * Name:        David Alvarado
	 * CIN:         401439516
	 * Course:      CS 2012
	 * Section:     31315
	*/

    public TriangleMouth(double vertex1X, double vertex1Y,
                    double vertex2X, double vertex2Y,
                    double vertex3X, double vertex3Y) {
        // Create a Polygon to represent the triangle
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(new Double[]{
            vertex1X, vertex1Y,
            vertex2X, vertex2Y,
            vertex3X, vertex3Y
        });
        triangle.setFill(Color.GREEN);
        triangle.setStroke(Color.BLACK);

        getChildren().add(triangle);
    }
}
