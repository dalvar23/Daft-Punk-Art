package art;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Name:        David Alvarado
 */

public class DaftPunk extends Application {
    @Override
    public void start(Stage primaryStage) {

        Words txt = new Words();

        Helmet1 helmet1 = new Helmet1();

        Helmet2 helmet2 = new Helmet2();

        Lines line = new Lines();

        CurveLines curve = new CurveLines();

        EllipseShape ellipse = new EllipseShape();

        RectangleMouth mouth2 = new RectangleMouth(220, 485, 200, 200);

        RectangleShape rec = new RectangleShape(105, 360, 450, 125, 30, 30);

        RectangleShape rec2 = new RectangleShape(250, 600, 140, 25, 30, 30);

        TriangleMouth m1 = new TriangleMouth(220, 685, 220, 484, 115, 484);

        TriangleMouth m2 = new TriangleMouth(420, 685, 420, 484, 545, 484);

        WindowColor bgColor = new WindowColor();

        // Create a Pane to hold the background and helmet
        Pane pane = new Pane();
        pane.getChildren().addAll(mouth2, helmet1, helmet2, line, curve, rec2, ellipse, m1, m2, rec, txt); // Add background and helmet to the pane

        pane.setStyle("-fx-background-color: " + bgColor.getRGBCode() + ";"); // Set the background color

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 1280, 750);
        primaryStage.setTitle("DaftPunk"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}
