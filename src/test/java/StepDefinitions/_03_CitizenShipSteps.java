package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_CitizenShipSteps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @And("Navigate to Citizenships")
    public void navigateToCitizenships() {

        ln.myClick(ln.setupButton);
        ln.myClick(ln.parametersButton);
        ln.myClick(ln.citizenShipButton);
    }

    @When("Create a Citizenships")
    public void loginACitizenships() {
        String strName= RandomStringUtils.randomAlphanumeric(5);
        String strShortName=RandomStringUtils.randomNumeric(3);
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,strName);
        dc.mySendKeys(dc.shortName,strShortName);
        dc.myClick(dc.saveButton);
    }

    @When("Create a name as {string} as {string}")
    public void createANameAsAs(String kod1, String kod2) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,kod1);
        dc.mySendKeys(dc.shortName,kod2);
        dc.myClick(dc.saveButton);

    }

    @Then("Already exist message should be displayed")
    public void negativeSuccessMesage() {
        dc.verifyContainsText(dc.alreadyExist,"already exists.");

    }


    @When("user delete name as {string}")
    public void userDeleteNameAs(String deleteName) {
        dc.deleteItem(deleteName);
    }
}
