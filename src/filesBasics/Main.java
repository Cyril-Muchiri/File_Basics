package filesBasics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String [] args){

        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\Baby Beast\\Desktop\\Secret message.txt");
            fileWriter.append("Hello world");
            fileWriter.write("\nHow are you this is the added text");

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
