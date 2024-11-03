package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InformationPage {
    public InformationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="checkout")
    public WebElement checkoutButton;

    @FindBy(id="first-name")
    public WebElement firstName;

    @FindBy(id="last-name")
    public WebElement lastName;

    @FindBy(id="postal-code")
    public WebElement postalCode;

    @FindBy(id="continue")
    public WebElement continueButton;

    @FindBy(id="finish")
    public WebElement finishButton;

}
