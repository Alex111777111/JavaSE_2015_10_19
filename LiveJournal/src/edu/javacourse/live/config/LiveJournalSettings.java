package edu.javacourse.live.config;

import java.util.PropertyResourceBundle;

public class LiveJournalSettings
{
    public static final String DAO_CLASS_NAME = "dao.class.name";
    public static final String FILE_NAME_COMMA = "dao.file.comma";
    
    private static PropertyResourceBundle props;

    static {
        props = (PropertyResourceBundle) PropertyResourceBundle.getBundle("livejournal");
    }

    public static String getProperty(String name) {
        return props.getString(name);
    }
    
    public static String getDaoClassName() {
        return getProperty(DAO_CLASS_NAME);
    }
}
