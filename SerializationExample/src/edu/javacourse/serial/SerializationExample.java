package edu.javacourse.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializationExample
{
    private static final String FILE_NAME = "person.bin";

    public static void main(String[] args) throws Exception {
        writeObject();
        readObject();
    }

    private static void writeObject() throws IOException {
        Person simple = createPerson();
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(simple);
        oos.close();
        fos.close();
    }

    private static void readObject() throws Exception {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person ro = (Person)ois.readObject();
        System.out.println(ro);
        System.out.println(ro.getClass().getCanonicalName());
    }
    
    private static Person createPerson() {
        Person simple = new Child();
        simple.setFirstName("FirstName");
        simple.setLastName("LastName");
        simple.setDateOfBirth(new Date());
        simple.setSocialId("12345");
        return simple;
    }
}
