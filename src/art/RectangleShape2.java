package art;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleShape2 extends Pane {
	/**
	 * Name:        David Alvarado
	 * CIN:         401439516
	 * Course:      CS 2012
	 * Section:     31315
	*/
    private Rectangle rectangle;
    
    public RectangleShape2(double x, double y, double width, double height) {
        setLayoutX(x);
        setLayoutY(y);
        rectangle = new Rectangle();
        rectangle.setFill(Color.SILVER);
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        
        getChildren().add(rectangle);
    }

    public void setDimensions(double width, double height) {
        rectangle.setWidth(width);
        rectangle.setHeight(height);
    }

    public double getRectangleWidth() {
        return rectangle.getWidth();
    }

    public double getRectangleHeight() {
        return rectangle.getHeight();
    }
    
    
}
