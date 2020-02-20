package com.patrick;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class PropertiesUtil {

    public static String getValue(String key) {
        try {
            ResourceBundle mappingConfig = ResourceBundle.getBundle("mapping");
            String value = mappingConfig.getString(key);
            return value;
        } catch (MissingResourceException e) {
            System.out.println("Key [" + key + "] is not found in the properties file.");
        }
        return "";
    }

    public static String getValue(int key) {
        return getValue(String.valueOf(key));
    }

}
