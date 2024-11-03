package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.Driver.driver;

public class ReasubleMethod {



    public static void GirisYap(){
        WebElement userNameButton = driver.findElement(By.id("user-name"));
        userNameButton.sendKeys(ConfigReader.getProperty("userName"));

        WebElement passwordButton = driver.findElement(By.id("password"));
        passwordButton.sendKeys(ConfigReader.getProperty("password"));

        driver.findElement(By.id("login-button")).click();

    }


    }
