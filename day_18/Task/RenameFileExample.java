
import java.io.File;

public class RenameFileExample {
    public static void main(String[] args) {
        File oldFile=new File("oldname.txt");
        File newFile=new File("newname.txt");
        if (oldFile.exists()) {
            boolean result=oldFile.renameTo(newFile);
            if (result){
                System.out.println("File renamed successfully!");
            }else{
                System.out.println("Failed to rename file.");
            }
        }else{
            System.out.println("File does not exist.");
        }
    }
}