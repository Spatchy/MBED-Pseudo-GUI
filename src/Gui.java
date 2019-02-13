import java.util.ArrayList;
import shed.mbed.LCD;

public class Gui {

    ArrayList<GuiTab> tabs;
    LCD lcd;
    String topLevelString;

    public Gui(ArrayList<GuiTab> tabs, LCD lcd)
    {
        this.tabs = tabs;
        this.lcd = lcd;
    }

    public void displayTopLevel()
    {
        lcd.print(0, 0, "boo");
        for(GuiTab tab : tabs){
            topLevelString = "" + tab.getTitle() + "  ";
        }
    }

    public void selectTab(String title)
    {
       String[] splitTabs = topLevelString.split(title);
       topLevelString = splitTabs[0] + ">" + splitTabs[1];
    }
}
