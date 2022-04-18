package abstructclass;
public abstract class Keyboard {
    int keyspercent;
    
    Keyboard()
    {
        keyspercent=60;
    }
    
    
    public abstract void print(); //this cannot have a body.
    
    void paint() //abstract class doesn't have anything with the non-abstract classes, these are easily inherited by subclass.  
    {
        keyspercent=100;
    }
    
}
