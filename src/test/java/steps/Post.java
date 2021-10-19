package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.Assert.assertTrue;

public class Post extends Base {
    private final Base base;
    public Post(Base base){
        this.base = base;
    }

    @Given("^que acesso a Wikipedia$")
    public void queAcessoAWikipedia() { base.driver.get(base.url);
    }

    @When("^pesquiso palavra por \"([^\"]*)\"$")
    public void pesquisoPalavraPor(String produto)  {
        base.driver.findElement(By.name("search")).sendKeys(produto + Keys.ENTER);}

    @Then("^exibe a expressao \"([^\"]*)\" no tiulo da guia$")
    public void exibeAExpressaoNoTiuloDaGuia(String produto)  {
        assertTrue(base.driver.getTitle().contains(produto));
    }
}
