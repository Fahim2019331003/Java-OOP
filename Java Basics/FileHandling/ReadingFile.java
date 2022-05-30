import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadingFile {

    public static void main(String[] args) {
        
        try{
            File file=new File("sample.txt");
            Scanner scan=new Scanner(file);

            String name,last;
            List players=new ArrayList<String>();
            List Id=new ArrayList<Integer>();
            List Score=new ArrayList<Integer>();

            name=scan.nextLine();
            name=scan.nextLine();

            for(int i=0;i<3;i++)
            {
                if(scan.hasNext()) players.add(scan.next());
                if(scan.hasNext()) Id.add(scan.nextInt());
                if(scan.hasNext()) Score.add(scan.nextInt());
                
            }
            last=scan.nextLine();
            scan.close();
            System.out.println(name);
            for(int i=0;i<players.size();i++)
            {
                System.out.println(players.get(i)+" -> "+Id.get(i)+" -> "+Score.get(i));
            }
            System.out.println(last);
        }
        catch(InputMismatchException e)
        {
            e.printStackTrace();
        }
        catch(IllegalStateException e)
        {
            e.printStackTrace();
        }
        catch(NoSuchElementException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
}