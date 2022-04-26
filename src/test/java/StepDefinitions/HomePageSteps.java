package StepDefinitions;

import Pages.HomePage;
import Utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class HomePageSteps {

    HomePage homepage= new HomePage();

    @Then("user should be able to verify all tabs on Homepage")
    public void user_should_be_able_to_verify_all_tabs_on_Homepage(DataTable data) {
        List<Map<String,String>> maps=data.asMaps(String.class,String.class);
        int i=0;
        for (Map<String,String> map:maps ) {
            String expectedTabNames=map.get("tabNames");
            String actualTabNames=homepage.allMainTabs.get(i).getText();
            Assert.assertEquals("Tab names verification failed!",actualTabNames,expectedTabNames);
            i++;
        }
    }



}
