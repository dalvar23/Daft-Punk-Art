package art;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Lines extends Pane {
	public Lines() {
		Line line1 = new Line(130, 275, 520, 275);
		line1.setStrokeWidth(12);
		line1.setStroke(Color.GREEN);
		getChildren().add(line1);

		Line line2 = new Line(525, 280, 560, 360);
		line2.setStrokeWidth(6);
		line2.setStroke(Color.PURPLE);
		getChildren().add(line2);
		
		Line line3 = new Line(100,355,130,280);
		line3.setStrokeWidth(6);
		line3.setStroke(Color.PURPLE);
		getChildren().add(line3);
	}

}
