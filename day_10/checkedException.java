//compiler checks
import java.io.FileReader;
public class checkedException{
    public static void main(String[] args) {
        try {
            FileReader f = new  FileReader("hope batch");
            System.out.println(f);
        } catch (Exception e) {
                  System.out.println(e);
        }
    }}
