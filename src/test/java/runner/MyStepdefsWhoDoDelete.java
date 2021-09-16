/*package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import whoDoClean.DeleteWhoDo;

import java.net.MalformedURLException;

public class MyStepdefsWhoDoDelete {

    private DeleteWhoDo deleteWhoDo = new DeleteWhoDo();

    @When("click in the box record")
    public void clickInTheBoxRecord() throws MalformedURLException {
        deleteWhoDo.SelectcheckBox.click();
    }

    @And("click in toolbar")
    public void clickInToolbar() throws MalformedURLException, InterruptedException {
        System.out.println("entro valor");
        deleteWhoDo.Toolbar.click();
        Thread.sleep(1000);
        System.out.println("salio valor");
    }

    @And("click in delete completed")
    public void clickInDeleteCompleted() throws MalformedURLException {
        deleteWhoDo.deleteCompletadas.click();
    }

    @And("click in delete")
    public void clickInDelete() throws MalformedURLException {
        deleteWhoDo.deleteRegitPopUp.click();
    }

    @Then("the list should be empty")
    public void theListShouldBeEmpty() {

    }
}*/
