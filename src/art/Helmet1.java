package art;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Helmet1 extends Pane {
	/**
	 * Name:        David Alvarado
	 * CIN:         401439516
	 * Course:      CS 2012
	 * Section:     31315
	*/
    public Helmet1() {
        Arc helmetShape = new Arc();
        helmetShape.setCenterX(325.0f);
        helmetShape.setCenterY(275.0f);
        helmetShape.setRadiusX(200.0f);
        helmetShape.setRadiusY(200.0f);
        helmetShape.setStartAngle(0);
        helmetShape.setLength(180);
        helmetShape.setType(ArcType.ROUND);

        Color matteBlack = Color.rgb(192,192,192);
        helmetShape.setFill(matteBlack);

        helmetShape.setStroke(Color.RED);
        helmetShape.setStrokeWidth(6.0);

        getChildren().addAll(helmetShape);
    }
}
