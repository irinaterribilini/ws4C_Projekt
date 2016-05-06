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

        layoutControls();
    }

    public TimePattern(String hour,String minute){

        this.hour = new TextField(hour);
        this.minute = new TextField(minute);
        points = new Text(" : ");

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
