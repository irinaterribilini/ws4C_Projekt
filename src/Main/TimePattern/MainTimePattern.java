package Main.TimePattern;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Michael on 03.05.2016.
 *
 */
public class MainTimePattern extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootPanel = new Frame();

        Scene scene = new Scene(rootPanel);

        String stylesheet = getClass().getResource("../../style.css").toExternalForm();
        scene.getStylesheets().add(stylesheet);

        primaryStage.setTitle("TimePattern");
        primaryStage.setScene(scene);

        primaryStage.setWidth(300);
        primaryStage.setHeight(300);

        primaryStage.show();
    }

}
