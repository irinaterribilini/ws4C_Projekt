package Main.TimePattern;

import javafx.scene.control.TextField;

/**
 * Created by Michael on 17.05.2016.
 */
public class MinuteTextField extends TextField {

    public MinuteTextField(){
        super();
    }

    public MinuteTextField(String time) {
        super(time);
    }

    @Override
    public void replaceText(int start, int end, String text) {
        if ((text.matches("[0-9]") || text == "") && (getText().length() < 2 || text == "")) {
            if(text == "" || getText().length()<1 || (getText().toCharArray()[0]<'6')){
                super.replaceText(start, end, text);
            }
        }
    }
    @Override
    public void replaceSelection(String text) {
        if ((text.matches("[0-9]") || text == "") && (getText().length() < 2 || text == ""))  {
            if(text == "" || getText().length()<1 || (getText().toCharArray()[0]<'6')){
                super.replaceSelection(text);
            }
        }
    }
}

