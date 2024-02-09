package art;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.Random;

public class WindowColor extends Pane{
	/**
	 * Name:        David Alvarado
	 * CIN:         401439516
	 * Course:      CS 2012
	 * Section:     31315
	*/
    private Color bgColor;

    public WindowColor() {
        generateRandomColor();
    }

    public String getRGBCode() {
        return toRGBCode(bgColor);
    }

    private void generateRandomColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        bgColor = Color.rgb(red, green, blue);
    }

    private String toRGBCode(Color color) {
        return String.format("#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }
}
