package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParantPage{
    public LeftNav(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Setup'][1]")
    public WebElement setupButton;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Countries'][1])")
    public WebElement countriessButton;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenShipButton;

    @FindBy(xpath = "//span[text()='Nationalities']")
    public WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    public WebElement fees;

    @FindBy(xpath = "//span[text()='Inventory'][1]")
    public WebElement inventory;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    public WebElement setupInventory;

    @FindBy(xpath = "//span[text()='Item Categories']")
    public WebElement inventoryCat;

    @FindBy(xpath = "//span[text()='States']")
    public WebElement states;




    public WebElement getWebElement(String strElement){

        switch (strElement){
            case "setup" : return this.setupButton;
            case "parameters" : return this.parametersButton;
            case "countries" : return this.countriessButton;
            case "citizenship" : return this.citizenShipButton;
            case "nationalities": return this.nationalities;
            case "fees":return this.fees;
            case "inventory": return this.inventory;
            case "setupInventory":return this.setupInventory;
            case "inventoryCat": return this.inventoryCat;
            case "states": return this.states;

        }

        return null;
    }

}
