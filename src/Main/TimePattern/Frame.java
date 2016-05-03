package Main.TimePattern;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 * Created by Michael on 03.05.2016.
 */
public class Frame extends VBox {


    private TimePattern timePattern1;
    private TimePattern timePattern2;

    public Frame(){

        initializeControls();
        layoutControls();

    }

    private void initializeControls(){
        timePattern1 = new TimePattern("10","15");
        timePattern2 = new TimePattern();
    }

    private void layoutControls() {

        getChildren().add(timePattern1);
        getChildren().add(timePattern2);
    }
}
