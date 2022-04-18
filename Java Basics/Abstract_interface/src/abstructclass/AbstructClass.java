
package abstructclass;


public class AbstructClass {


    public static void main(String[] args) {
        System.out.println("Hello Fahim");
        System.out.println("Yesss");
        
        Keyboard key=new RoyalKludge(); //calls RoyalKludge constructor which contains Keyboard constructor by defalt;
        key.print(); //so keypercent becomes 60
        key.paint(); //changes keypercent to 100
        key.print();
        
        //key =new Keychrone(); //abstract class cannot be allocated.
        
    }
    
}
