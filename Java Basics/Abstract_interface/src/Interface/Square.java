package Interface;


public class Square implements Rectangle,Attributes {  //can implement multiple interfaces because the methods are not given a body.
    
    int height,width;
    Square(int height,int width)
    {
        this.height=height;
        this.width=width;
        
    }
    
    @Override
    public int area(){
        return height*width;
    }
    
    @Override
    public int perimeter(int height,int width) ///If the parameter is given the oevrridden method should also have the exact copy.
    {
        return 2*(this.height+this.width);
    }
    
    @Override
    public boolean isSquare()
    {
        return true;
    }
    
    @Override
    public int Height()
    {
        return this.height;
    }
    
    @Override
    public boolean isParallelogram()
    {
        return true;
    }
}

//we have to implement all methods of the interfaces.
