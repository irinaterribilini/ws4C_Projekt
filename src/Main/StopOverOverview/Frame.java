package Main.StopOverOverview;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class Frame extends HBox {

    VBox buttonBox;
    private StopOverOverview stopOverOverview;
    private Button addButton;
    private Button deleteButton;

    public Frame() {
        initializeControls();
        layoutControls();
        addEventHandlers();
    }

    private void initializeControls() {
        stopOverOverview = new StopOverOverview();
        buttonBox = new VBox();
        addButton = new Button("+");
        deleteButton = new Button ("-");
        addButton.getStyleClass().add("addButton");
        deleteButton.getStyleClass().add("deleteButton");
    }

    private void layoutControls() {
        getChildren().addAll(stopOverOverview, addButton, deleteButton, buttonBox);
        addButton.setMaxWidth(Double.MAX_VALUE);
        deleteButton.setMaxWidth(Double.MAX_VALUE);
        buttonBox.getChildren().addAll(addButton, deleteButton);
    }

    private void addEventHandlers() {
        addButton.setOnAction(event -> stopOverOverview.addItem());
                deleteButton.setOnAction(event -> stopOverOverview.removeItem());
}


}