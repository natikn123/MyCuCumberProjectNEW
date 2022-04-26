package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps {
    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    HomePage homepage =new HomePage();

    @Given("user navigates to HRM Login Page")
    public void user_navigates_to_HRM_Login_Page() throws InterruptedException {
        driver.get("http://dev-hrm.yoll.io/index.php/auth/login");
        Thread.sleep(1000);
    }
    @When("user enters {string} username and {string} password")
    public void userEntersUsernameAndPassword(String userName, String passWord) throws InterruptedException {
        loginPage.usernameTextBox.sendKeys(userName);
        Thread.sleep(2000);
        loginPage.passwordTextBox.sendKeys(passWord);
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user should be successfully land on HRM Home Page")
    public void user_should_be_successfully_land_on_HRM_Home_Page() {
        String expectedUsername = "Welcome Yoll";
        String actualUsername = homepage.welcome.getText();
        Assert.assertEquals("Username validation failed on Homepage", expectedUsername, actualUsername);
    }

    @Then("user should verify {string} error message")
    public void user_should_verify_error_message(String errorMessage) {
        String actualErrorMessage=loginPage.errorMessage.getText();
        Assert.assertEquals("Error message verification failed!",actualErrorMessage,errorMessage);
    }

//teting new git and lets see this
}
