package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {

    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement addToCart;

     @FindBy(id="remove-sauce-labs-bolt-t-shirt")
    public WebElement remove;

     @FindBy(css = ".shopping_cart_link")
    public WebElement basketIcon;

     @FindBy(css = ".inventory_item_name")
     public WebElement productName;




}
