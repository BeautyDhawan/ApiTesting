package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class baseclass {
    public Properties prop;

    public baseclass() {

            prop = new Properties();
            try {
                FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Properties/config.properties");
            prop.load(ip);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}
