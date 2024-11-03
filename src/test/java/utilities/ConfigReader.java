package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;
    static {
        String dosyaYolu="configuration.properties";
        try{
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
        //Test metodundan yollanan stringlerin key değerini alır properties classında get.property metodunu kullanarak bu key'e ait value bize göndermesi için
        // ornek: configuration.propeties'deki browser bir key chrome ise bir value'dur
    }
}
