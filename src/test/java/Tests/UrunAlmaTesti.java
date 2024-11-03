package Tests;

import io.qameta.allure.Allure;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.InformationPage;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReasubleMethod;

public class UrunAlmaTesti {
    SoftAssert softAssert;

    //softAssert = new SoftAssert();
    ProductsPage productsPage = new ProductsPage();
    LoginPage loginPage = new LoginPage();
    InformationPage informationPage = new InformationPage();



    @Test(priority = 1 , description = "Başarılı ürün ekleme kontrolü")
    public void urunEklemeTesti() {
        Allure.step("Siteye girer ürünü ekler");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReasubleMethod.GirisYap();
        productsPage.addToCart.click();
        if(productsPage.remove.isDisplayed()){
        System.out.println("Ürünü eklediniz");
        }else
        {
            System.out.println("Ürün eklenmedi");
            softAssert.assertTrue(productsPage.remove.isDisplayed());
        }


    }

    @Test(priority = 2, description = "Doğru ürün kontrolü")
    public void  dogruUrunKontrol()

    {

        Allure.step("Sepet ikonuna tıklanarak ürün ismi kontrol edilir");
        productsPage.basketIcon.click();
        String urunIsmi = productsPage.productName.getText();

        if(urunIsmi.equals(ConfigReader.getProperty("beklenenUrun"))){
            System.out.println("Dogru ürün secildi");
        } else {
            System.out.println("Urun yanlis secildi");
            softAssert.assertEquals(urunIsmi,ConfigReader.getProperty("beklenenUrun"));

        }

    }

    @Test(priority = 3, description = "Başarılı bilgi giriş kontrolü")
    public void bilgiGiris() {
        Allure.step("Kullanıcı bilgileri girilir ve başarılı giriş kontrolü yapılır");
        informationPage.checkoutButton.click();
        informationPage.firstName.click();
        informationPage.firstName.sendKeys(ConfigReader.getProperty("isim"));
        informationPage.lastName.click();
        informationPage.lastName.sendKeys(ConfigReader.getProperty("soyisim"));

        informationPage.postalCode.click();
        informationPage.postalCode.sendKeys(ConfigReader.getProperty("postalCode"));
        informationPage.continueButton.click();


        if(informationPage.finishButton.isDisplayed()){
            System.out.println("Bilgi girişi başarıyla yapıldı");
        }
       else {
            System.out.println("Eksik bilgi girişi yapıldı");
        }


    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }

}
