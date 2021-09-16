package whoDoClean;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

//import java.util.HashMap;
//import java.util.Map;


public class CreateWhoDo {

    //public Map<String,TextBox> textBoxMap = new HashMap<>();

    public Button saveWhoDo= new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    public TextBox titleWhenDo= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteWhenDo=new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));


    /*public CreateWhoDo(){
        textBoxMap.put("titleWhenDo",new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")));
        textBoxMap.put("noteWhenDo",new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")));
   }*/

}