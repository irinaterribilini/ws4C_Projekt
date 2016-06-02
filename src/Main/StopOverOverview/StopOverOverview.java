package Main.StopOverOverview;

import Main.StopOver.StopOver;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;

/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class StopOverOverview extends VBox {

    private ObservableList<StopOver> stopOverArrayList;
    private static final ObservableList<StopOver> allItems = FXCollections.observableArrayList();

    public StopOverOverview(){
        stopOverArrayList = FXCollections.observableArrayList();
        layoutControls();
    }

    private void layoutControls() {
        for(StopOver stopOver : allItems){
           this.getChildren().add(stopOver);
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
