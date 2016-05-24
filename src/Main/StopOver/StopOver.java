package Main.StopOver;

import Main.TimePattern.TimePattern;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class StopOver extends HBox {

    private TimePattern timePattern;
    private TextField stop;

public StopOver(){

    this.setSpacing(10);
    timePattern = new TimePattern();
    stop = new TextField();

    stop.getStyleClass().add("timeField");


    stop.textProperty().addListener(((observable, oldValue, newValue) -> {
        if (newValue.isEmpty()){
            stop.getStyleClass().remove("timeField-active");
            stop.getStyleClass().add("timeField");
        } else if(!stop.getStyleClass().contains("timeField-active")) {
            stop.getStyleClass().remove("timeField");
            stop.getStyleClass().add("timeField-active");
        }
    }));

    layoutControls();
}

    private void layoutControls() {
        this.getChildren().add(timePattern);
        this.getChildren().add(stop);

    }
}
