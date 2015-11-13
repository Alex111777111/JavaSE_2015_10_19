package edu.javacourse.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInfoReader
{
    private final String FILE_NAME = "C:/Java/readme.txt";
    
    public String readString() throws FileInfoReaderException {
        try {
//            new RuntimeException().printStackTrace(System.out);
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String s = br.readLine();
            br.close();
            return s;
        } catch (FileNotFoundException ex) {
            throw new FileInfoReaderException(ex.getMessage());
        } catch (IOException ex) {
            throw new FileInfoReaderException(ex.getMessage());
        }
    }
}
