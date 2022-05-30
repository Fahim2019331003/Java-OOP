import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    
    public static void main(String[] args) {
        
        try {
            FileWriter file=new FileWriter("sample.txt");

            file.write("My name is IP");
            file.close();

        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
