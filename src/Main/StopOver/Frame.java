package Main.StopOver;

import Main.TimePattern.TimePattern;
import javafx.scene.layout.VBox;

/**
 * Created by Michael Läuchli & Irina Terribilini 
 */
public class Frame extends VBox {


    private StopOver stopOver;
    private TimePattern timePattern;

    public Frame(){
        initializeControls();
        layoutControls();
    }

    private void initializeControls(){
        stopOver = new StopOver();
        timePattern = new TimePattern();
    }

    private void layoutControls() {
        getChildren().add(stopOver);
        getChildren().add(timePattern);
    }


}
