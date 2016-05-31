package Main.StopOverOverview;


import javafx.scene.layout.HBox;

/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class Frame extends HBox {

    private StopOverOverview stopOverOverview;


    public Frame() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        stopOverOverview = new StopOverOverview();
    }

    private void layoutControls() {
        getChildren().add(stopOverOverview);
    }


}