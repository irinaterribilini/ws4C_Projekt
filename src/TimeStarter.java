import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Irina Terribilini & Michael Läuchli on 05.04.2016.
 */
public class TimeStarter extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootPanel = new TimePane();

        Scene scene = new Scene(rootPanel);

   /*     String fonts = getClass().getResource("fonts.css").toExternalForm();
        scene.getStylesheets().add(fonts);*/

        String stylesheet = getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(stylesheet);

        primaryStage.setTitle("Zwischenhalte");
        primaryStage.setScene(scene);
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

