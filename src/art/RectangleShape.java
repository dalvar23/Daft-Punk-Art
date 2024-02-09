package art;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleShape extends Pane {
	/**
	 * Name:        David Alvarado
	*/
    private Rectangle rectangle;

    public RectangleShape(double x, double y, double width, double height, double arcWidth, double arcHeight) {
        setLayoutX(x);
        setLayoutY(y);
        rectangle = new Rectangle();
        rectangle.setFill(Color.BLACK);
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        rectangle.setArcWidth(arcWidth);
        rectangle.setArcHeight(arcHeight);
        
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

    public void setArcDimensions(double arcWidth, double arcHeight) {
        rectangle.setArcWidth(arcWidth);
        rectangle.setArcHeight(arcHeight);
    }

    public double getArcWidth() {
        return rectangle.getArcWidth();
    }

    public double getArcHeight() {
        return rectangle.getArcHeight();
    }
    
    
}