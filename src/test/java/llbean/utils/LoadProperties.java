package llbean.utils;

import io.appium.java_client.AppiumDriver;
import llbean.tests.BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by gjariwala on 4/17/2017.
 */
public class LoadProperties {

    public static Properties loadProperties(String filename) {

        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = AppiumDriver.class.getClassLoader().getResourceAsStream(filename);
            if (input == null){
                System.out.println("Sorry, unable to find" + filename);
                return null;
            }

            // load a properties file
            prop.load(input);

            Enumeration<?> e = prop.propertyNames();
            while (e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String value = prop.getProperty(key);
                System.out.println("Key : " + key + ", Value : " + value);
            }

            // get the property value and print it out


        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }return prop;
    }

}

