package utility;

import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

public class UtilityClass {
    public static Object fetchConfigProp(String value) throws IOException {

        FileInputStream myFile = new FileInputStream("./Configuration/configurationProp");

        Properties prop = new Properties();
        prop.load(myFile);

        return prop.get(value);
    }
}
