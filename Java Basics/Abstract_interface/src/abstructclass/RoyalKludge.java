package abstructclass;
public class RoyalKludge extends Keyboard {
    
    
    @Override
    public void print() //abstract methods must be overridden.
    {
        
        System.out.println("This is Royal Kludge Keyboard  " + keyspercent ); // any variables can freely inherited.
    }
    
    
    
    void paints()
    {
        System.out.println("This is paints");
    }
}
