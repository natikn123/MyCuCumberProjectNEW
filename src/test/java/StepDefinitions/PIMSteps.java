package StepDefinitions;

import Pages.PIMPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class PIMSteps {


    PIMPage pimPage=new PIMPage();

    @Then("user should be able to click on PIM tab")
    public void user_should_be_able_to_click_on_PIM_tab() throws InterruptedException {
        Thread.sleep(2000);
       pimPage.pimTap.click();
    }

    @Then("user should verify PIM tabs")
    public void user_should_verify_PIM_tabs(DataTable data) {
    List<Map<String ,String>> maps=data.asMaps(String.class,String.class);
    int i=0;
        for (Map<String,String> map:maps) {
            String expectedTabs=map.get("pimTabs");
            String actualTabs =pimPage.allPimTaps.get(i).getText();
            Assert.assertEquals("PIM tab verification failed!",actualTabs,expectedTabs);
            i++;
        }
    }



    @And("user should be able to navigate to Add employee page and verify")
    public void userShouldBeAbleToNavigateToAddEmployeePageAndVerify() throws InterruptedException {
        Thread.sleep(2000);
        pimPage.addButton.click();

        String expectedText="Add Employee";
        String actualText=pimPage.addEmployee.getText();
        Assert.assertEquals("Add Employee verification failed!",actualText,expectedText);
    }

}
