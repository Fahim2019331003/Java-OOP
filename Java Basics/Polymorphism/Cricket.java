public class Cricket extends Game{
    public int run=0;

    Cricket()
    {   
        //calls Game constuctor here.
        run=10;
        //score=10;  
    }

    //these are overridden methods.
    @Override
    public void print()
    {
        System.out.println("Cricket score : "+ score +" "+run);
    }
}
