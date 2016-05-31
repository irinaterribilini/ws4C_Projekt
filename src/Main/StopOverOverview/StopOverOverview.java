package Main.StopOverOverview;

import Main.StopOver.StopOver;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class StopOverOverview extends VBox {

    private ObservableList<StopOver> stopOverArrayList;

    public StopOverOverview(){
        stopOverArrayList = FXCollections.observableArrayList();
        stopOverArrayList.add(new StopOver());
        layoutControls();
    }

    private void layoutControls() {

        for(StopOver stopOver : stopOverArrayList){
           this.getChildren().add(stopOver);
        }


    }

}
