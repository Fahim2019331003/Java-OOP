import java.io.IOException;
import java.io.FileWriter;

public class WritingFile {

    public static void main(String[] args) {
        
        try{

            FileWriter file=new FileWriter("sample.txt");
        

            file.write("This is my first writing!!!");

            file.write("What is 12 + 26? \n");
            file.write("12 + 26 = "+Integer.toString(12+26));

            file.close();
            
            


        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
