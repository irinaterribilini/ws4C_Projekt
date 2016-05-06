package Main.TimePattern;


import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class TimePattern extends HBox{

    private TextField hour;
    private TextField minute;
    private Text points;

    public TimePattern(){

        hour = new TextField();
        minute = new TextField();
        points = new Text(" : ");

        hour.getStyleClass().add("timeField");
        minute.getStyleClass().add("timeField");


        hour.setOnMouseEntered(event -> focusEvent(hour.getText().isEmpty()));

        layoutControls();
    }

    public TimePattern(String hour,String minute){

        this.hour = new TextField(hour);
        this.minute = new TextField(minute);
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

    private void focusEvent(boolean b){

        if(!b){
            hour.getStyleClass().add("timeField-active");
            hour.getStyleClass().remove("timeField");
        }
        else{
            hour.getStyleClass().remove("timeField-active");
            hour.getStyleClass().add("timeField");
        }

    }
}
