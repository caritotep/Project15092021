package whoDoClean;
import control.Button;
import control.Label;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class ListWhoDo {

    public Button addWhoDo = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public ListWhoDo(){}

    public boolean isContactCreated(String nameWhoDo) throws MalformedURLException {
        Label contactList = new Label(By.xpath("//android.widget.TextView[@text='"+nameWhoDo+"']"));
        return contactList.isDisplayed();
    }
}