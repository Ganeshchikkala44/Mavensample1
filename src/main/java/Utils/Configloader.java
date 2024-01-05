
package Utils;

import java.util.Properties;

public class Configloader {
    private final Properties properties;
    private static Configloader configloader;

    private Configloader() {
        String env = System.getProperty("env", "STAGE");
        switch (env) {
            case "PROD":
                properties =
                        Propertyutils.Propertyloader("src\\test\\java\\resources\\prod_config.properties");
                break;
            case "STAGE":
                properties = Propertyutils.Propertyloader("src\\test\\java\\resources\\stage_config.properties");
                break;
            default:
                throw new IllegalStateException("m valid enviroment" + env);
        }
    }


    public static Configloader getConfigloader() {
        if (configloader == null) {
            configloader = new Configloader();
        }
        return configloader;
    }

    public String geturl() {
        return properties.getProperty("baseURL");
    }

    public String getUsername() {
        return properties.getProperty("username");
    }
}







