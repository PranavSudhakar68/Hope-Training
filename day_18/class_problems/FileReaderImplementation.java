 

import java.io.*;
public class FileReaderImplementation {
    public static void main(String[] args) {
        try{
            FileReader reader=new FileReader("example.txt");
             int character;
             while((character=reader.read())!=-1){
                 System.out.print((char)character);
            }
            // System.out.println("File content:"+reader.read());
            reader.close();
        }catch(IOException e){
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
