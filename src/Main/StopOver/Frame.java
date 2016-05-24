package Main.StopOver;

import Main.TimePattern.TimePattern;
import javafx.scene.layout.VBox;

/**
 * Created by Michael Läuchli & Irina Terribilini 
 */
public class Frame extends VBox {


    private StopOver stopOver;
    private StopOver stopOver2;

    public Frame(){
        initializeControls();
        layoutControls();
    }

    private void initializeControls(){
        stopOver = new StopOver("12", "30", "Aarau");
        stopOver2 = new StopOver();
    }

    private void layoutControls() {
        getChildren().add(stopOver);
        getChildren().add(stopOver2);
    }


}
