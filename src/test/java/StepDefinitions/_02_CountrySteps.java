package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to country")
    public void navigateToCountry() {
        //left nav da
        //setup
        ln.myClick(ln.setupButton);
        //parameters
        ln.myClick(ln.parametersButton);
        //countries
        ln.myClick(ln.countriessButton);

    }

    @When("Create a country")
    public void createACountry() {
        String ulkeAdi= RandomStringUtils.randomAlphanumeric(8); // 8 harf ver
        String ulkeKod=RandomStringUtils.randomNumeric(4); // 4 rakam ver
        // add butonuna bas
        dc.myClick(dc.addButton);
        // ismi gönder
        dc.mySendKeys(dc.nameInput,ulkeAdi);
        // kısa adı gönder
        dc.mySendKeys(dc.codeInput, ulkeKod);
        // save butonuna bas
        dc.myClick(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        // success yazısını doğrula
        dc.verifyContainsText(dc.successMessage,"success");
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String ulkead, String ulkekod) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,ulkead);
        dc.mySendKeys(dc.codeInput, ulkekod);
        dc.myClick(dc.saveButton);
    }
}
