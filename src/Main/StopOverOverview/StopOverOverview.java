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

    public StopOverOverview(String input){
        String[] stops = input.split("-");
        String[][] stopParts = new String[(stops.length)][3];

        for(int i = 0; i<stops.length; i++){
            if(stops[i].charAt(0)==(char)' '){
                stops[i] = stops[i].substring(1);
            }
            if(stops[i].charAt(stops[i].length()-1)==(char)' '){
                stops[i] = stops[i].substring(0, stops[i].length()-1);
            }
            stopParts[i][0] = stops[i].substring(stops[i].length()-5, stops[i].length()-3);
            stopParts[i][1] = stops[i].substring(stops[i].length()-2, stops[i].length());
            stopParts[i][2] = stops[i].substring(0, stops[i].length()-7);
        }
        for(int i = 0 ; i < stopParts.length; i++){
            allItems.add(new StopOver(stopParts[i][0],stopParts[i][1],stopParts[i][2]));
        }

        layoutControls();

    }
    public void fill(String input){
        allItems.removeAll();
        String[] stops = input.split("-");
        String[][] stopParts = new String[(stops.length)][3];

        for(int i = 0; i<stops.length; i++){
            if(stops[i].charAt(0)==(char)' '){
                stops[i] = stops[i].substring(1);
            }
            if(stops[i].charAt(stops[i].length()-1)==(char)' '){
                stops[i] = stops[i].substring(0, stops[i].length()-1);
            }
            stopParts[i][0] = stops[i].substring(stops[i].length()-5, stops[i].length()-3);
            stopParts[i][1] = stops[i].substring(stops[i].length()-2, stops[i].length());
            stopParts[i][2] = stops[i].substring(0, stops[i].length()-7);
        }
        for(int i = 0 ; i < stopParts.length; i++){
            allItems.add(new StopOver(stopParts[i][0],stopParts[i][1],stopParts[i][2]));
        }
    }

    public String saveStopovers(){
        String returnValue = "";
        for(StopOver stopOver:allItems){
            returnValue += (stopOver.saveStopOver() + " - ");
        }
        returnValue = returnValue.substring(0,returnValue.length()-3);
        return returnValue;
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

    public void removeItem(){
        if(allItems.size()>0) {
            this.getChildren().remove(allItems.get(allItems.size() - 1));
            allItems.remove(allItems.size() - 1);
        }
    }


    public ObservableList<StopOver> getAllItems(){
        return allItems;
    }

}
