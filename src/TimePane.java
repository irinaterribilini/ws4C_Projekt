
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


/**
 * Created by Irina Terribilini & Michael Läuchli on 05.04.2016.
 */
    public class TimePane extends HBox {
        private TextField text;

        public TimePane() {
            initializeControls();
            layoutControls();
        }

        private void initializeControls() {
            text = new TextField("Hello World");
        }

        private void layoutControls() {
            getChildren().add(text);
        }
    }
