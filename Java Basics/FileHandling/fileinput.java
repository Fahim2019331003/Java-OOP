import java.io.File;
import java.io.IOException;

public class fileinput {
    public static void main(String[] args) {
        
        try{

            File file=new File("sample.txt");

            if(file.createNewFile()){
                System.out.println("File Created: "+file.getName());
                System.out.println("Readable: "+file.canRead());
                System.out.println("Write?:: "+file.canWrite());
                System.out.println("Location: "+file.getAbsolutePath());

            }
            else{
                System.out.println("Something Occurred.");
            }
            

        }catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
