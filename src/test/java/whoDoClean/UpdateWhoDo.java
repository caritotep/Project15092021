package whoDoClean;
import control.Button;

import control.TextBox;
import org.openqa.selenium.By;


public class UpdateWhoDo {
    public Button selectRegister = new Button(By.xpath("//android.widget.TextView[@text='VALOR1']"));
    public Button editRecord = new Button(By.xpath("//android.widget.EditText[@text='Nota del VALOR1']"));
    public TextBox deltenoteWhenDo = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public TextBox UpdatedWhenDo =new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));

    //public Button saveEditRecord = new Button(By.id("//android.widget.TextView[@content-desc='Guardar']"));
    public TextBox borrarTecladoCloud = new TextBox(By.id("android:id/deleteButton"));
    public Button saveEditRecord = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

}
