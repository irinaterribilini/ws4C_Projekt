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

               layoutControls();
    }

    public TimePattern(String hour,String minute){

        this.hour = new HourTextField(hour);
        this.minute = new MinuteTextField(minute);
        points = new Text(" : ");

        this.hour.getStyleClass().add("timeField");
        this.minute.getStyleClass().add("timeField");

        layoutControls();
    }

    private void layoutControls() {
        hour.setPrefWidth(40);
        minute.setPrefWidth(40);
        this.getChildren().add(hour);
        this.getChildren().add(points);
        this.getChildren().add(minute);
    }

}
