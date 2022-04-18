package abstructclass;


public abstract class Keychrone extends Keyboard{
    
    
//    @Override
//    public abstract void print(); //abstract methods must be overridden. But if the 
                                   //class is abstract itself, it can be overridden or can be given 
                                    //a body. both is fine.
    
    @Override
    public void print()
    {
        System.out.println("This print is in keychrone");
    }
    
}
