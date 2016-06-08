package Main.TimePattern;


import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class TimePattern extends HBox{

    private HourTextField hour;
    private MinuteTextField minute;
    private Text points;

    public TimePattern(){

        hour = new HourTextField();
        minute = new MinuteTextField();
        points = new Text(" : ");


        hour.getStyleClass().add("timeField");
        minute.getStyleClass().add("timeField");



        hour.textProperty().addListener(((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()){
                hour.getStyleClass().remove("timeField-active");
                hour.getStyleClass().add("timeField");
            } else if(!hour.getStyleClass().contains("timeField-active")) {
                hour.getStyleClass().remove("timeField");
                hour.getStyleClass().add("timeField-active");
            }
        }));

        minute.textProperty().addListener(((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()){
                minute.getStyleClass().remove("timeField-active");
                minute.getStyleClass().add("timeField");
            } else if(!minute.getStyleClass().contains("timeField-active")) {
                minute.getStyleClass().remove("timeField");
                minute.getStyleClass().add("timeField-active");
            }
        }));

        layoutControls();
    }

    public TimePattern(String hour,String minute){

        if(hour != null){
            this.hour = new HourTextField(hour);
            this.hour.getStyleClass().add("timeField-active");
        } else{
            this.hour = new HourTextField("");
            this.hour.getStyleClass().add("timeField");
        }

        points = new Text(" : ");

        if(minute != null){
            this.minute = new MinuteTextField(minute);
            this.minute.getStyleClass().add("timeField-active");
        } else{
            this.minute = new MinuteTextField("");
            this.minute.getStyleClass().add("timeField");
        }

        this.hour.textProperty().addListener(((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()){
                this.hour.getStyleClass().remove("timeField-active");
                this.hour.getStyleClass().add("timeField");
            } else if(!this.hour.getStyleClass().contains("timeField-active")) {
                this.hour.getStyleClass().remove("timeField");
                this.hour.getStyleClass().add("timeField-active");
            }
        }));

        this.minute.textProperty().addListener(((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()){
                this.minute.getStyleClass().remove("timeField-active");
                this.minute.getStyleClass().add("timeField");
            } else if(!this.minute.getStyleClass().contains("timeField-active")) {
                this.minute.getStyleClass().remove("timeField");
                this.minute.getStyleClass().add("timeField-active");
            }
        }));

        layoutControls();
    }

    public String saveStopOver(){
        String returnValue = hour.getText()+ ":" + minute.getText();
        return returnValue;
    }

    private void layoutControls() {
        hour.setPrefWidth(40);
        minute.setPrefWidth(40);
        this.getChildren().add(hour);
        this.getChildren().add(points);
        this.getChildren().add(minute);
    }
}
