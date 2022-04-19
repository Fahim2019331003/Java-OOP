import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {


        try{
            int[] n=new int[2];
            Scanner scan=new Scanner(System.in);

            n[0]=scan.nextInt();// If any of this input is not given in correct format, RuntimeException will occur.
            n[1]=scan.nextInt();

            System.out.println(n[0]/n[1]); //If n[1]=0 then this breaks try.The next lines are ignored.
            System.out.println(n[2]);//more than one exceptions.

        }
        catch(ArithmeticException e){
            System.out.println("this is Arithmatic. Baka baka "+ e );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("this is one of the exceptions that you should never do. "+ e);
        }
        catch(RuntimeException e) //subclass of the expection should be in the last.
        {
            System.out.println("What is this behaviour "+ e);
        }
        

        finally{
            System.out.println("This block will run no matter what");
        }
        
        
    }
    
}

//1. try 
//catch
//finally
//throw
//throws