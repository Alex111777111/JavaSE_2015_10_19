package edu.javacourse.live.dao;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.exception.LiveJournalDAOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class LiveUserFileSerialDAO extends LiveUserFileDAO
{
    private static final String FILE_NAME = "users.bin";
    
    @Override
    protected void saveCollection() throws LiveJournalDAOException {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            try {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(users);
            } finally {
                fos.close();
            }
        } catch (IOException ex) {
            throw new LiveJournalDAOException(ex);
        }
    }

    @Override
    protected void loadCollection() throws LiveJournalDAOException {
        users = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            try {
                ObjectInputStream ois = new ObjectInputStream(fis);
                users = (List<LiveUser>)ois.readObject();
            } catch (ClassNotFoundException ex) {
            } finally {
                fis.close();
            }
        } catch (IOException ex) {
        }
    }
    
}
