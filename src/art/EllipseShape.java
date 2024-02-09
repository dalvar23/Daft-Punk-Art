package art;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class EllipseShape extends Pane {
	/**
	 * Name:        David Alvarado
	*/
	public EllipseShape() {
		Ellipse ellipse = new Ellipse();
		
		
		ellipse.setCenterX(85.0f);
		ellipse.setCenterY(420.0f);
		ellipse.setRadiusX(30.0f);
		ellipse.setRadiusY(65.0f);
		
		ellipse.setFill(Color.SILVER);
		
		getChildren().add(ellipse);
		
		Ellipse ellipse2 = new Ellipse();
		
		
		ellipse2.setCenterX(575.0f);
		ellipse2.setCenterY(420.0f);
		ellipse2.setRadiusX(30.0f);
		ellipse2.setRadiusY(65.0f);
		
		ellipse2.setFill(Color.SILVER);
		
		getChildren().add(ellipse2);
	}
}
