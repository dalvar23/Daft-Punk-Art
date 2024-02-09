package art;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;

public class CurveLines extends Pane{
	/**
	 * Name:        David Alvarado
	 * CIN:         401439516
	 * Course:      CS 2012
	 * Section:     31315
	*/
	public CurveLines() {
		Path path = new Path();
        path.setStroke(Color.GOLD);
        path.setStrokeWidth(6);

        path.getElements().add(new MoveTo(100, 360));

        path.getElements().add(new LineTo(180, 375));

        path.getElements().add(new QuadCurveTo(355, 390, 370, 385));

        path.getElements().add(new LineTo(560, 360));

        
        getChildren().addAll(path);
	}
}
