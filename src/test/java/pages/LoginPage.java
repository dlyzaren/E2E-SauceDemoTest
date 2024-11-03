package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement userName;


    @FindBy(id= "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

     @FindBy(css = ".title")
    public WebElement products;

     @FindBy(css=".error-button")
    public WebElement error;

     @FindBy(css="h3")
    public WebElement requiredInformation;


}
