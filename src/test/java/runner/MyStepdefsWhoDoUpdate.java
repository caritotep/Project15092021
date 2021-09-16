package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import whoDoClean.ListWhoDo;
import whoDoClean.UpdateWhoDo;

import java.net.MalformedURLException;

public class MyStepdefsWhoDoUpdate {

    private UpdateWhoDo updateWhoDo = new UpdateWhoDo();
    private ListWhoDo listWhoDo= new ListWhoDo();

    @When("click in the record")
    public void clickInTheRecord() throws MalformedURLException, InterruptedException {
        updateWhoDo.selectRegister.click();
    }

    @And("i modify the text {string} with {string}")
    public void iModifyTheTextWith(String nameControl, String value) throws MalformedURLException, InterruptedException {
        updateWhoDo.editRecord.click();
        Thread.sleep(1000);
        System.out.println("nameControl nameControl nameControl :"+nameControl);
        System.out.println("nameControl update :"+value);
        if ( nameControl.equals("Nota del VALOR1")){
            //updateWhoDo.UpdatedWhenDo.setText(value);
            /* para cloud: boton de borrar del teclado del celular */
            updateWhoDo.borrarTecladoCloud.click();
            updateWhoDo.UpdatedWhenDo.setText(value);
            Thread.sleep(2000);
        }
    }

    @And("click {string} button update")
    public void clickButtonUpdate(String arg0) throws MalformedURLException, InterruptedException {
        updateWhoDo.saveEditRecord.click();
        Thread.sleep(1000);
    }

    @Then("the note {string} should be created")
    public void theNoteShouldBeCreated(String expectedResult) throws MalformedURLException {

        Assertions.assertTrue(listWhoDo.isContactCreated(expectedResult),"Contacto NO CREADO!!");

    }



}
