package Java2TM.demoExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("./miarchivo.txt");

            int c = file.read();

            while (c>=0){
                System.out.print((char)c);
                c=file.read();
            }

            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
