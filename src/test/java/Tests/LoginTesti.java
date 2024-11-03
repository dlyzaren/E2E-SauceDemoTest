package Tests;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static utilities.Driver.driver;

public class LoginTesti {

    LoginPage loginPage = new LoginPage();
    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }


    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @Test(description ="Başarılı giriş kontrolü" )
    public void BasariliGirisTesti() {
        Allure.step("Doğru kullanıcı adı ve şifre girilir");
        loginPage.userName.click();
        loginPage.userName.sendKeys(ConfigReader.getProperty("userName"));
        loginPage.password.click();
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();
        assertTrue(loginPage.products.isDisplayed());

    }

    @Test (description = "Hatalı kullanıcı adı girişi kontrolü" )
    public void HataliKullaniciAdiTesti() {
        Allure.step("Hatalı kullanıcı adı ve doğru şifre girilir");
        loginPage.userName.click();
        loginPage.userName.sendKeys(ConfigReader.getProperty("hataliUserName"));
        loginPage.password.click();
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();

        assertTrue(loginPage.error.isDisplayed());
        //,
    }

    @Test(description = "Hatalı şifre girişi kontrolü")
    public void HataliSifreTesti() {
        Allure.step("Doğru kullanıcı adı ve hatalı şifre girilir");

        loginPage.userName.click();
        loginPage.userName.sendKeys(ConfigReader.getProperty("userName"));
        loginPage.password.click();
        loginPage.password.sendKeys(ConfigReader.getProperty("hataliPassword"));
        loginPage.loginButton.click();

        assertTrue(loginPage.error.isDisplayed());

    }

    @Test(description = "Hatalı şifre ve kullanıcı adı girişi kontrolü")
    public void HataliSifreHataliKullaniciAdiTesti() {
        Allure.step("Hatalı şifre ve kullanıcı adı girilir");
        loginPage.userName.click();
        loginPage.userName.sendKeys(ConfigReader.getProperty("hataliUserName"));
        loginPage.password.click();
        loginPage.password.sendKeys(ConfigReader.getProperty("hataliPassword"));
        loginPage.loginButton.click();

        assertTrue(loginPage.error.isDisplayed());

    }

    @Test(description = "Eksik şifre kontrolü")
    public void EksikSifreTesti() {
        Allure.step("Şifre girişi yapılmaz");
        loginPage.userName.click();
        loginPage.userName.sendKeys(ConfigReader.getProperty("userName"));
        loginPage.loginButton.click();
        String requriedMessage = loginPage.requiredInformation.getText();
        assertEquals(requriedMessage, "Epic sadface: Password is required");
        screenshot();

    }

    @Test(description = "Eksik kullanıcı adı kontrolü")
    public void EksikKullaniciAdiTesti() {
        Allure.step("Kullanıcı adı girişi yapılmaz");
        loginPage.password.click();
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();
        String requriedMessage = loginPage.requiredInformation.getText();
        assertEquals(requriedMessage, "Epic sadface: Username is required");
        screenshot();
    }

}
