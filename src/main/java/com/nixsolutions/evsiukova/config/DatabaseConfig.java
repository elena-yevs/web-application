package com.nixsolutions.evsiukova.config;

import java.util.Properties;

import com.nixsolutions.evsiukova.utils.ConfigReader;

public class DatabaseConfig {
    private static final String CONFIG_FILE_NAME = "jdbc.properties";

    private final static String DATABASE_DRIVER_PROPERTY_NAME = "db.driver.class";
    private final static String DATABASE_URL_PROPERTY_NAME = "db.conn.url";
    private final static String DATABASE_USER_PROPERTY_NAME = "db.username";
    private final static String DATABASE_PASSWORD_PROPERTY_NAME = "db.password";

    private static final Properties DATABASE_CONFIG;
    public static final String DATABASE_URL;
    public static final String DATABASE_USER;
    public static final String DATABASE_PASSWORD;

    static {
        DATABASE_CONFIG = ConfigReader.readConfig(CONFIG_FILE_NAME);
        DATABASE_URL = DATABASE_CONFIG.getProperty(DATABASE_URL_PROPERTY_NAME);
        DATABASE_USER = DATABASE_CONFIG.getProperty(DATABASE_USER_PROPERTY_NAME);
        DATABASE_PASSWORD = DATABASE_CONFIG.getProperty(DATABASE_PASSWORD_PROPERTY_NAME);
    }

    private DatabaseConfig() {
    }
}
