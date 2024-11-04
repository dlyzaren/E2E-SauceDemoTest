# *Sauce Demo Test Otomasyon Projesi*
### Bu proje, Sauce Demo web sitesi üzerinde başarılı giriş yapma, ürün ekleme ve bilgi girme gibi temel senaryoları otomatikleştirmek için oluşturulmuştur. Projede TestNG, Page Object Model (POM) mimarisi ve Allure raporlama araçları kullanılmıştır.

## *Proje Özeti*
Bu test otomasyon projesinin temel amacı, belirli kullanıcı işlemlerinin otomatik test senaryoları aracılığıyla doğruluğunu test etmektir. Geliştirilen senaryolar şunlardır:

- Başarılı giriş yapma testi
- Ürün ekleme testi
- Bilgi girme testi

## *Kullanılan Teknolojiler ve Araçlar*
- Java: Ana programlama dili
- Maven:
- TestNG: Test çalıştırma ve raporlama framework'ü
- Selenium WebDriver: Web otomasyonu
- Page Object Model (POM): Kodun daha modüler ve bakımı kolay olmasını sağlayan mimari
- Allure: Test sonuçlarını detaylı ve okunabilir raporlar halinde sunan raporlama aracı

## *Kurulum ve Çalıştırma*
*Gereksinimler*
- Java Development Kit (JDK) 17 veya üzeri
- Maven 3.9.6 veya üzeri
- IntelliJ IDEA veya diğer bir Java IDE
- WebDriver (WebDriverManager kullanılarak otomatik yönetim)
- Allure Commandline yüklü

*Projeyi Klonlama*
- Aşağıdaki komutu kullanarak projeyi klonlayın:
- İlk adım olarak, GitHub'daki projeyi klonlamanız gerekmektedir. Bunun için aşağıdaki adımları izleyebilirsiniz:

- Projeyi Klonlayın: https://github.com/dlyzaren/E2E-SauceDemoTest.git
- IntelliJ IDEA'yı açın.
- Üst menü çubuğundan File > New > Project from Version Control... seçeneğini seçin.
- Açılan pencerede, Repository URL sekmesini seçin.
- URL kısmına yukarıdaki linki yapıştırın ve 'Clone' düğmesine tıklayın.

*Proje Maven tabanlı olduğu için, pom.xml dosyasında tanımlanan bağımlılıkları yüklemek için aşağıdaki komutu kullanabilirsiniz:*

-mvn clean install

*Testlerin Çalıştırılması*
- E2E-SauceDemo\src\test\java dizinde yer alan yer alan Testleri çalıştırabilirsiniz.

- E2E-SauceDemo\configuration.properties dosyasını oluşturulduğundan emin olun.

*Raporlama*
Allure raporlarını incelemek için için:

Terminal'e 
cd 'bu kısmı projenizin path'ini yapıştıırn' enter
allure serve enter

*Proje Yapısı*
- src\test\java\pages: Proje kodları ve Page Object sınıfları
- src\test\java\Tests: Test senaryoları
- src\test\java\utilities: Utilities class'ı
