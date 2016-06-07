package Main.StopOverOverview;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class Frame extends HBox {

    VBox buttonBox;
    private StopOverOverview stopOverOverview;
    private StopOverOverview stopOverOverview2;
    private Button addButton;
    private Button deleteButton;
    private String imputstring = "Olten  05:57 - Zürich HB  06:28 - Zürich Flughafen  06:50 - Winterthur  07:05 - Wil SG  07:24 - Uzwil  07:32 - Flawil  07:38 - Gossau SG  07:43 - St. Gallen  07:53";

    public Frame() {
        initializeControls();
        layoutControls();
        addEventHandlers();
    }

    private void initializeControls() {
        stopOverOverview = new StopOverOverview();
        stopOverOverview2 = new StopOverOverview(imputstring);
        buttonBox = new VBox();

        addButton = new Button("+");
        deleteButton = new Button ("-");
        addButton.getStyleClass().add("addButton");
        deleteButton.getStyleClass().add("deleteButton");
    }

    private void layoutControls() {
        getChildren().addAll(stopOverOverview, stopOverOverview2, addButton, deleteButton, buttonBox);
        addButton.setMaxWidth(Double.MAX_VALUE);
        deleteButton.setMaxWidth(Double.MAX_VALUE);
        buttonBox.getChildren().addAll(addButton, deleteButton);
    }

    private void addEventHandlers() {
        addButton.setOnAction(event -> stopOverOverview.addItem());
                deleteButton.setOnAction(event -> stopOverOverview.removeItem());
}


}