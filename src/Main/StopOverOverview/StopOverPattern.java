
package Main.StopOverOverview;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by Michael Läuchli & Irina Terribilini
 */
public class StopOverPattern extends HBox{

    private StopOverOverview stopOverOverview;
    private Button addButton;
    private Button deleteButton;
    VBox buttonBox;

    public StopOverPattern(){
        stopOverOverview = new StopOverOverview();
        initializeControls();
        layoutControls();
        addEventHandlers();

    }

    public void setStops(String input){
        stopOverOverview.fill(input);
    }

    public StopOverPattern(String input){
        stopOverOverview = new StopOverOverview(input);
        initializeControls();
        layoutControls();
        addEventHandlers();
    }

    public String saveStopOver(){
        return stopOverOverview.saveStopovers();
    }

    private void initializeControls() {
        buttonBox = new VBox();
        buttonBox.setSpacing(10);
        buttonBox.setMinWidth(30);
        addButton = new Button("+");
        deleteButton = new Button ("-");
        addButton.getStyleClass().add("addButton");
        deleteButton.getStyleClass().add("deleteButton");
    }

    private void layoutControls() {
        getChildren().addAll(stopOverOverview, buttonBox);
        addButton.setMaxWidth(Double.MAX_VALUE);
        deleteButton.setMaxWidth(Double.MAX_VALUE);
        buttonBox.getChildren().addAll(addButton, deleteButton);
    }

    private void addEventHandlers() {
        addButton.setOnAction(event -> stopOverOverview.addItem());
        deleteButton.setOnAction(event -> stopOverOverview.removeItem());
    }
}
