package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComicsPage extends BasePage {
    private By pageTitleLocator = By.xpath("//*[@id=\'comp-lc61aui31\']/h2");
    private String tittlePage = "THE LITTLE TESTER COMICS SERIES";

    public ComicsPage(WebDriver driver) {
        super(driver);
    }
    public boolean isTitleComicDisplay() throws Exception {
        return this.isDisplay(pageTitleLocator) && this.getTex(pageTitleLocator).equals(tittlePage);
    }
}
