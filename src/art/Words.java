package art;

import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.Random;

public class Words extends Pane {
	/**
	 * Name:        David Alvarado
	 * CIN:         401439516
	 * Course:      CS 2012
	 * Section:     31315
	*/
    private static final Random random = new Random();

    public Words() {
        Text txt1 = new Text("DAFT");

        txt1.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 100));

        txt1.setFill(getRandomColor());

        txt1.setX(195);
        txt1.setY(450);

        BoxBlur blur = new BoxBlur(5, 5, 1);

        txt1.setEffect(blur);
        
        Text txt2 = new Text("PUNK");

        txt2.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 100));

        txt2.setFill(getRandomColor());

        txt2.setX(800);
        txt2.setY(450);

        BoxBlur blur2 = new BoxBlur(5, 5, 1);

        txt2.setEffect(blur2);

        Text txt3 = new Text("DAVID ALVARADO");

        txt3.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 20));

        txt3.setFill(getRandomColor());

        txt3.setX(1000);
        txt3.setY(725);

        getChildren().addAll(txt1, txt2, txt3);
    }

    private Color getRandomColor() {
        double red = random.nextDouble();
        double green = random.nextDouble();
        double blue = random.nextDouble();

        return Color.color(red, green, blue);
    }
}
