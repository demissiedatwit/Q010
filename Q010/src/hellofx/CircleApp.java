// CircleApp.java
package hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        final Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        // Bind the circle's center properties to the pane's properties
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Circle!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
