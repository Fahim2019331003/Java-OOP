public class Exception2 {

    static void f(int a) throws ArithmeticException
    {
        if(a == -1 ){
            throw new ArithmeticException("This is not what you wanted.");
        }
        else System.out.println("No Exceptions found");

    }
    public static void main(String[] args) {
        
        f(15);
        //f(-1); //If exceptions found the next lines will not be executed.
        try{
            f(15);
            f(-1);

        }
        catch(ArithmeticException e) 
        {
            System.out.println("This is an arithmetic exception "+e);
        }
        

    }
}
//throw & throws
//