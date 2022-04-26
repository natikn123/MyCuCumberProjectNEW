package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage {
    WebDriver driver;

    public PIMPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimTap;

    @FindBy(xpath = "//*[@class='menu']/ul/li[2]/ul/li")
    public List<WebElement> allPimTaps;

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    @FindBy(xpath = "//h1[text()='Add Employee']")
    public WebElement addEmployee;
}
