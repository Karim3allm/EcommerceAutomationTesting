package com.LUMA.utils;
import java.util.Properties;
public class ConfigUtils {



    private Properties properties;
    private static ConfigUtils configUtils;
   // private WebDriver driver;






    private ConfigUtils ()
    {
        String env = System.getProperty("env", "production").toUpperCase();
        switch (env)
        {
            case "PRODUCTION":
                properties = PropertiesUtils.loadProperties("src/test/java/com/LUMA/config/production.properties");
                break;
            case "LOCAL":
                properties = PropertiesUtils.loadProperties("src/test/java/com/LUMA/config/local.properties");
                break;
            default:
                throw new RuntimeException("Environment is not supported");
        }



    }

    public static ConfigUtils getInstance()
    {
        if(configUtils == null) {
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }

    public String getBaseUrl() {
        String prop = properties.getProperty("baseUrl");
        if(prop != null) return prop;
            throw new RuntimeException("could not find the base url in the property file");
    }

    public String getShippingUrl() {
        String prop = properties.getProperty("getShippingUrl");
        if(prop != null) return prop;
        throw new RuntimeException("could not find the base url in the property file");
    }

    public String getEmail() {
        String prop = properties.getProperty("email");
        if(prop != null) return prop;
        throw new RuntimeException("could not find the email in the property file");
    }

    public String getPassword() {
        String prop = properties.getProperty("password");
        if(prop != null) return prop;
        throw new RuntimeException("could not find the password in the property file");
    }



}
