package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    String tittle = "Testing | imalittletester";
    By tittlecomicsLocator = By.xpath("//*[@id=\'comp-iiyocj9v5label\']");
    By getTittleBlogLocator = By.xpath("//*[@id=\'comp-k6695bfi\']/p/span/span");
    By HomeBlog = By.id("comp-iiyocj9v1label");

    public HomePage(WebDriver driver){
        super(driver);
    }
    public boolean homePageIsDisplay()throws Exception{
        return this.getTitle().equals(tittle);
    }
    public void clickOnTitleComics() throws Exception{
        this.click(tittlecomicsLocator);
    }
}
