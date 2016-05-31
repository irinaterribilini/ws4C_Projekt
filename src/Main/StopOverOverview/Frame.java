package Main.StopOverOverview;

import javafx.scene.layout.HBox;

/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class Frame extends HBox {

    private StopOverOverview stopOverOverbiew;

    public Frame(){
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        stopOverOverbiew = new StopOverOverview();
    }

    private void layoutControls() {
        getChildren().add(stopOverOverbiew);
    }

}
