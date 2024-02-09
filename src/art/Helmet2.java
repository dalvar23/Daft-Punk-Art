package art;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;

public class Helmet2 extends Pane{
	/**
	 * Name:        David Alvarado
	*/
	public Helmet2() {
		Ellipse ellipse = new Ellipse();
		
		
		ellipse.setCenterX(950.0f);
		ellipse.setCenterY(410.0f);
		ellipse.setRadiusX(225.0f);
		ellipse.setRadiusY(275.0f);
		
		ellipse.setFill(Color.BLACK);
		
		getChildren().add(ellipse);
        
		Path path = new Path();
        path.setStroke(Color.GOLD);
        path.setStrokeWidth(50);

        path.getElements().add(new MoveTo(725, 400));
        path.getElements().add(new QuadCurveTo(750, 800, 1100, 625));
        path.getElements().add(new LineTo(1175, 400));

        
        getChildren().addAll(path);

    }
}
