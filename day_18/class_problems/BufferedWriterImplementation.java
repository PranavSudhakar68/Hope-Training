import java.io.*;

public class BufferedWriterImplementation {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt", true)); // 'true' for appending to the file
            writer.write("Hello, this is a test file.");
            writer.newLine(); // Add a new line
            writer.write("This file is created using BufferedWriter.");
            writer.newLine(); // Add another new line
            writer.close();
            System.out.println("File written successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
    }
}
}
