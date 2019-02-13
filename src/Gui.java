import shed.mbed.LCD;
import java.util.ArrayList;

public class Gui {

    private ArrayList<GuiTab> tabs;
    private LCD lcd;
    private String topLevelString = "";

    public Gui(ArrayList<GuiTab> tabs, LCD lcd)
    {
        this.tabs = tabs;
        this.lcd = lcd;
        lcd.print(0,0,".");
    }

    public void displayTopLevel()
    {
        lcd.print(0, 0, topLevelString);
        for(GuiTab tab : tabs){
            topLevelString = topLevelString + tab.getTitle() + "  ";
        }
    }

    public void selectTab(String title)
    {
        topLevelString = topLevelString.replace(">", "");
        topLevelString = topLevelString.replace(title, ">"+title);
    }
}
