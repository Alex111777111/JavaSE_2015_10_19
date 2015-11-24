package edu.javacourse.live.dao;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.exception.LiveJournalDAOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LiveUserFileCommaDAO extends LiveUserFileDAO
{
    private static final String FILE_NAME = "users.txt";

    @Override
    protected void saveCollection() throws LiveJournalDAOException {
        try {
            FileWriter fw = new FileWriter(FILE_NAME);
            try {
                BufferedWriter bw = new BufferedWriter(fw);
                for(LiveUser lu : users) {
                    bw.write(lu.getUserId() +"," + lu.getAlias() +"," + lu.getPassword() + "," + lu.getEmail() 
                            + System.lineSeparator());
                }
                bw.close();
            } finally {
                fw.close();
            }
        } catch (IOException ex) {
            throw new LiveJournalDAOException(ex);
        }
    }

    @Override
    protected void loadCollection() throws LiveJournalDAOException {
        users = new ArrayList<>();
        try {
            FileReader fr = new FileReader(FILE_NAME);
            try {
                BufferedReader br = new BufferedReader(fr);
                String line = null;
                while((line = br.readLine()) != null) {
                    String[] params = line.split("\\s*,\\s*");
                    LiveUser lu = new LiveUser();
                    lu.setUserId(Long.parseLong(params[0]));
                    lu.setAlias(params[1]);
                    lu.setPassword(params[2]);
                    lu.setEmail(params[3]);
                    
                    users.add(lu);
                }
            } finally {
                fr.close();
            }
        } catch (IOException ex) {
        }
    }

}
