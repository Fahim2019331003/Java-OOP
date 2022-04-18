package Interface;


public class Interface {
    public static void main(String[] args) {
        System.out.println("This is interface Package");
        
        Attributes a=new Square(5,9);
        Rectangle r=new Square(1,2);
        Square s=new Square(15,1);
        
        // Rectangle rr=new Rectangle(1,2); cannot create instance variable but can create pointer.
        
        //for s
        System.out.println("The area is : "+s.area());        
        System.out.println("The perimeter is : "+s.perimeter(10, 1110));       
        System.out.println("Is Square? : "+s.isSquare());
        System.out.println("Is parallelogram? : "+s.isParallelogram());
        System.out.println("Height : "+s.Height());
        
        System.out.println("\n\n\n");
        
        // for a
        System.out.println("The area is : "+a.area());        
        System.out.println("The perimeter is : "+a.perimeter(10, 1110));       
        System.out.println("Is Square? : "+a.isSquare());
        
        
        System.out.println("\n\n\n");
        
        
        //for r
        System.out.println("The area is : "+r.area());        
        System.out.println("The perimeter is : "+r.perimeter(10, 1110));       
        System.out.println("Is Square? : "+r.isSquare());
        System.out.println("Is parallelogram? : "+r.isParallelogram());
        System.out.println("Height : "+r.Height());
        
        /**
        System.out.println("Is parallelogram? : "+a.isParallelogram());
        System.out.println("Height : "+a.Height());
        * 
        * 
        * Rectangle can call because it inherited from interface Attributes.
        * 
        * These cannot be called.
        */
        


        
    }
}
