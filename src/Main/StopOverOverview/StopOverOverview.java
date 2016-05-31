package Main.StopOverOverview;

import Main.StopOver.StopOver;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class StopOverOverview extends VBox {

    private Button addButton;
    private ObservableList<StopOver> stopOverArrayList;
    private static final ObservableList<StopOver> allItems = FXCollections.observableArrayList();

    public StopOverOverview(){
        stopOverArrayList = FXCollections.observableArrayList();
        stopOverArrayList.add(new StopOver());
        addButton = new Button("hinzufügen");
        addButton.setOnAction(event -> addItem());
        layoutControls();
    }

    private void layoutControls() {
        for(StopOver stopOver : stopOverArrayList){
           this.getChildren().add(stopOver);
            addButton.setMaxWidth(Double.MAX_VALUE);
            getChildren().addAll(addButton);
        }

    }

    public void addItem(){
        allItems.add(new StopOver());
        this.getChildren().add(allItems.get(allItems.size()-1));
    }

    public ObservableList<StopOver> getAllItems(){
        return allItems;
    }
}
