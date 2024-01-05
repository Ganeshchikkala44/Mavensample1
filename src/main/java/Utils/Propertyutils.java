
package Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propertyutils {
    public static Properties Propertyloader(String filepath) {
        Properties properties = new Properties();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filepath));
            properties.load(reader);

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Properties file is not found at" + filepath);

        } catch (IOException e) {
            throw new RuntimeException("Failed to load proerties file to the properties object" + filepath);

        }
        return properties;
        }


    }


