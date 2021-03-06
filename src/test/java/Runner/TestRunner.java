package Runner;

import Utilities.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



@RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/Features",
            glue = {"StepDefinitions"},
            dryRun = false,
            tags = {"@YA105"},
            plugin = { "pretty", "html:target/cucumber-reports"},
            monochrome = true
    )


    public class TestRunner {
   @AfterClass
    public  static void tearDown(){
       Driver.closeDriver();
   }

    }
