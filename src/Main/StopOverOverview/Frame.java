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

    private static final ObservableList<StopOver> allItems = FXCollections.observableArrayList();
    private StopOverOverview stopOverOverview;
    private Button addButton;

    public Frame() {
        initializeControls();
        layoutControls();
        addEventHandlers();
    }

    private void initializeControls() {
        stopOverOverview = new StopOverOverview();
        addButton = new Button("hinzufügen");
    }

    private void layoutControls() {
        getChildren().addAll(stopOverOverview, addButton);
        addButton.setMaxWidth(Double.MAX_VALUE);}

    private void addEventHandlers() {
        addButton.setOnAction(event -> stopOverOverview.addItem());
}


}