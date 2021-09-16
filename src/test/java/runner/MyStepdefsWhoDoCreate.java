package runner;

import org.junit.jupiter.api.Assertions;
import whoDoClean.CreateWhoDo;
import whoDoClean.ListWhoDo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class MyStepdefsWhoDoCreate {

    private ListWhoDo listWhoDo= new ListWhoDo();
    private CreateWhoDo createWhoDo = new CreateWhoDo();

    @Given("have access to WhoDo")
    public void haveAccessToWhoDo() {

    }

    @When("click {string} button in main screen")
    public void clickButtonInMainScreen(String arg0) throws MalformedURLException, InterruptedException {
        listWhoDo.addWhoDo.click();
    }

    @And("fill {string} textbox with {string}")
    public void fillTextboxWith(String nameControl, String value) throws MalformedURLException, InterruptedException {
        if( nameControl.equals("title")){
            createWhoDo.titleWhenDo.setText(value);
        Thread.sleep(1000);
        }
        else if ( nameControl.equals("notes")){
            createWhoDo.noteWhenDo.setText(value);
            Thread.sleep(1000);
        }
    }

    @And("click {string} button")
    public void clickButton(String arg0) throws MalformedURLException, InterruptedException {
        createWhoDo.saveWhoDo.click();
    }

    @Then("contact {string} should be created")
    public void contactShouldBeCreated(String expectedResult) throws MalformedURLException {
        Assertions.assertTrue(listWhoDo.isContactCreated(expectedResult),"Contacto NO CREADO!!");
    }
}
