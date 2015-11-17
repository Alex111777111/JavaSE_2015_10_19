package edu.javacourse.live.config;

import java.io.BufferedReader;
import java.io.FileReader;

public class LiveJournalSettings
{
    private static final String FILE_NAME = "livejournal.properties";
    private static final String DAO_CLASS_NAME = "dao.class.name";

    private static String daoClassName = null;

    static {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String str = null;
            while ((str = br.readLine()) != null) {
                if (!str.trim().isEmpty()) {
                    String[] array = str.split("=");
                    if (array.length == 2 && array[0].equals(DAO_CLASS_NAME)) {
                        daoClassName = array[1];
                    }
                }
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String getDaoClassName() {
        return daoClassName;
    }
}
