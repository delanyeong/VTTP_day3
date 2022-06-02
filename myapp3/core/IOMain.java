package myapp3.core;

//java IOMain <src> <dest>

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
//java IOMain <src> <dest>
//java IOMain myfile myfile.dup

public class IOMain {
    public static void main(String[] args) {

        
        // //? Create a file object
        // Path p = Paths.get("");
        // //? Convert path to file object
        // File hostFile = p.toFile();

        // //? Directly create a file object (Second Method)
        // File hostFile2 = new File("");
        // File etcDir = new File("/etc");
        // System.out.printf("%s directory? %b \n", hostFile2.getAbsoluteFile(),
        // hostFile.isDirectory());
        // System.out.printf("is directory? %b\n", etcDir.getName(),
        // etcDir.isDirectory());

        String srcFile = args[0];
        String dstFile = args[1];

        // 1k byte buffer
        byte[] buff = new byte[1024];
        int size = 0;
        try {
            // -1 impossible value = error (from the day2 lesson car start stop time)
            InputStream is = new FileInputStream(srcFile);
            System.out.printf("%s File Opened\n" , srcFile);

            OutputStream os = new FileOutputStream(dstFile);
            
            while (size >= 0) {
                size = is.read(buff);
                System.out.printf("read: %d\n", size);
                if (size > 0)
                os.write(buff, 0 , size);
            }

            is.close();

            os.flush(); //read ahead by anticipating 
            os.close();

        } catch (FileNotFoundException ex) {
            System.err.printf("Error: %s\n " , ex.getMessage());
        } catch (IOException ex) {
            System.err.printf("Error: %s\n " , ex.getMessage());
        }

    }
}