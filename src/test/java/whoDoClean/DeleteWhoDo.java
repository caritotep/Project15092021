package whoDoClean;

import control.Button;
import org.openqa.selenium.By;

public class DeleteWhoDo {
    public Button SelectcheckBox = new Button(By.xpath("(//android.widget.ImageButton[@content-desc='Marcar como Hecha'])[1]"));
    public Button Toolbar = new Button(By.xpath("//android.widget.ImageView[@content-desc='Más opciones']"));
    public Button deleteCompletadas = new Button(By.xpath("//android.widget.TextView[@text='Eliminar Completadas']"));
    public Button deleteRegitPopUp = new Button(By.xpath("//android.widget.Button[@text='ELIMINAR']"));
}
