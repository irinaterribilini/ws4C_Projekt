package Main.StopOverOverview;

import Main.StopOver.StopOver;
import javafx.beans.value.ChangeListener;
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

    //private Button addButton;
    private ObservableList<StopOver> stopOverArrayList;
    private static final ObservableList<StopOver> allItems = FXCollections.observableArrayList();

    public StopOverOverview(){
        stopOverArrayList = FXCollections.observableArrayList();
        allItems.add(new StopOver());
        addEvent(allItems.get(allItems.size()-1));
        //addButton = new Button("hinzufügen");
        //addButton.setOnAction(event -> addItem());
        layoutControls();
    }

    private void layoutControls() {
        for(StopOver stopOver : allItems){
           this.getChildren().add(stopOver);
            //addButton.setMaxWidth(Double.MAX_VALUE);
            //getChildren().addAll(addButton);
        }

    }

    public void addItem(){
        allItems.add(new StopOver());
        this.getChildren().add(allItems.get(allItems.size()-1));
    }

    public ObservableList<StopOver> getAllItems(){
        return allItems;
    }

    private void addEvent(StopOver so){
        so.setOnMouseEntered(event ->
        {if(true) addItem();
            addEvent(allItems.get(allItems.size()-1));
            if(allItems.size()>1){
                removeEvent(allItems.get(allItems.size()-2));
            }
        });
    }
    private void removeEvent(StopOver so){
        so.setOnMouseEntered(event ->
        {});
    }
}
