package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import java.util.Properties;
// this class for to read properties
public class LoadProp {
    static FileInputStream input = null;
    static Properties prop = null;


    public String getProperty(String Key){
        prop = new Properties();
        try {
            input = new FileInputStream("src/test/Resource/TestDataConfig.Properties");
            prop.load(input);
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(Key);
    }
}
