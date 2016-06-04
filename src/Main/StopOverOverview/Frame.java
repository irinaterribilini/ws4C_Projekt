package Main.StopOverOverview;


import Main.StopOver.StopOver;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;


/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class Frame extends HBox {

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
        addButton = new Button("hinzufügen");
        deleteButton = new Button ("löschen");
    }

    private void layoutControls() {
        getChildren().addAll(stopOverOverview, addButton, deleteButton);
        addButton.setMaxWidth(Double.MAX_VALUE);
        deleteButton.setMaxWidth(Double.MAX_VALUE);}

    private void addEventHandlers() {
        addButton.setOnAction(event -> stopOverOverview.addItem());
                deleteButton.setOnAction(event -> stopOverOverview.removeItem());
}


}