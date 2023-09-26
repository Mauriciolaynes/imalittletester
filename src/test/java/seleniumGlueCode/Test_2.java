package seleniumGlueCode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private ChromeDriver driver = Hooks.getDrive();

    @Given("^: El usuario se encuentra en la pagina home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_imalittletester() throws Throwable {
        String tittle = "Testing | imalittletester";
        Assert.assertEquals(tittle,driver.getTitle());
    }

    @When("^: hace click en el boton de littletester comics$")
    public void hace_click_en_el_boton_de_littletester_comics() throws Throwable {

        driver.findElement(By.id("comp-iiyocj9v5label")).click();

    }

    @Then("^: se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {

        WebElement pageTitleLocator = driver.findElement(By.xpath("//*[@id=\'comp-lc61aui31\']/h2"));

        Assert.assertTrue("No se redirecciono correctamente a la pagina de comics",pageTitleLocator.isDisplayed());
        Assert.assertEquals("THE LITTLE TESTER COMICS SERIES",pageTitleLocator.getText());
    }
}
