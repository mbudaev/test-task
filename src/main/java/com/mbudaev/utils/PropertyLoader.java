package com.mbudaev.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Mikhail_Budaev on 09-Jun-16.
 */
public class PropertyLoader {
    private static PropertyLoader instance = new PropertyLoader();

    Properties prop = new Properties();
    InputStream input = null;

    public PropertyLoader() {
        try {
            input = new FileInputStream("application.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static PropertyLoader getInstance() {
        return instance;
    }

    public String getDataBaseDriver() {
        return prop.getProperty("database.driver");
    }

    public String getDataBasePath() {
        return prop.getProperty("database.path");
    }

    public String[] getDataBaseTables() {
        String list = prop.getProperty("database.tables");
        return list.split(";");
    }


}
