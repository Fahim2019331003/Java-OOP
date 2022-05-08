package List;

import java.util.ArrayList;
import java.util.List;



/**
 * list
 */

class Pair
{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class list {

    public static void main(String[] args) {

        List<Pair> lst=new ArrayList<Pair>();

        for(int i=0;i<10;i++){
            int x= ((int) (Math.random()*1000000)) % 101 + 1 ;
            int y= ((int) (Math.random()*1000000)) % 101 + 1 ;
            Pair temp=new Pair(x, y);
            lst.add(temp);
        }


        for(int i=9;i>=0;i--){
            System.out.println(i+" "+lst.get(i).x + "   "+ lst.get(i).y);
        }
        for(int i=0;i<10;i++){
            System.out.println(i+" "+lst.get(i).x + "   "+ lst.get(i).y);
        }
        
    }   
}