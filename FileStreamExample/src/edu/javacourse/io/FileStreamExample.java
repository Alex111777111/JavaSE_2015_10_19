package edu.javacourse.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamExample
{
    public static void main(String[] args) {
        readWriteStream();
        readWriteChars();
    }

    private static void readWriteStream() {
        try {
            FileInputStream fis = new FileInputStream("test.bin");
            try {
                FileOutputStream fos = new FileOutputStream("other.bin", false);
                try {
                    byte[] buffer = new byte[4096];
                    int bt = fis.read(buffer);
                    while (bt != -1) {
                        fos.write(buffer, 0, bt);
                        bt = fis.read(buffer);
                    }
                } finally {
                    fos.close();
                }
            } finally {
                fis.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    private static void readWriteChars() {
        try {
            FileReader fis = new FileReader("build.xml");
            try {
                FileWriter fos = new FileWriter("other.xml", false);
                try {
                    char[] buffer = new char[4096];
                    int bt = fis.read(buffer);
                    while (bt != -1) {
                        fos.write(buffer, 0, bt);
                        bt = fis.read(buffer);
                    }
                } finally {
                    fos.close();
                }
            } finally {
                fis.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
}
