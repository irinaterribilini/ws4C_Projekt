package Main.StopOverOverview;

import javafx.scene.layout.VBox;


/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class Frame extends VBox {

    private StopOverPattern stopOverPattern;
    private String inputstring = "Olten  05:57 - Zürich HB  06:28 - Zürich Flughafen  06:50 - Winterthur  07:05 - Wil SG  07:24 - Uzwil  07:32 - Flawil  07:38 - Gossau SG  07:43 - St. Gallen  07:53";

    public Frame() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        stopOverPattern = new StopOverPattern(inputstring);

    }

    private void layoutControls() {
        getChildren().addAll(stopOverPattern);

    }

}