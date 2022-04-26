package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="welcome")
    public WebElement welcome;

    @FindBy(xpath = "//*[@class='menu']/ul/li")
    public List<WebElement> allMainTabs;
}
