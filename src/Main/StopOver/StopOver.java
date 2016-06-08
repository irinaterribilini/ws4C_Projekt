package Main.StopOver;

import Main.TimePattern.TimePattern;
import javafx.beans.Observable;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class StopOver extends HBox {

    private TimePattern timePattern;
    private TextField stop;
    private boolean empty;

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

    public StopOver(String hour, String minute, String stop){
        this.setSpacing(10);
        if(stop != null) {
            this.stop = new TextField(stop);
            this.stop.getStyleClass().add("timeField-active");
        } else{
            this.stop = new TextField();
            this.stop.getStyleClass().add("timeField");
        }
        timePattern = new TimePattern(hour, minute);

        this.stop.textProperty().addListener(((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()){
                this.stop.getStyleClass().remove("timeField-active");
                this.stop.getStyleClass().add("timeField");
            } else if(!this.stop.getStyleClass().contains("timeField-active")) {
                this. stop.getStyleClass().remove("timeField");
                this.stop.getStyleClass().add("timeField-active");
            }
        }));

        layoutControls();
    }

    public String saveStopOver(){
        String returnValue = stop.getText() + " " + timePattern.saveStopOver();
        return returnValue;
    }
    
    private void layoutControls() {
        this.getChildren().add(timePattern);
        this.getChildren().add(stop);

    }
}
