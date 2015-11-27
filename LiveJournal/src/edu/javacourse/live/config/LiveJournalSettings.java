package edu.javacourse.live.config;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LiveJournalSettings
{
    private static final String FILE_NAME = "livejournal.properties";

    public static final String DAO_CLASS_NAME = "dao.class.name";
    public static final String FILE_NAME_COMMA = "dao.file.comma";
    
    private static Properties props = new Properties();

    static {
        try {
            props.load(new FileReader(FILE_NAME));
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static String getProperty(String name) {
        return props.getProperty(name);
    }
    
    public static String getDaoClassName() {
        return getProperty(DAO_CLASS_NAME);
    }
}
