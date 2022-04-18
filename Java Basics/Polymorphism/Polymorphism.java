public class Polymorphism {

    public static void main(String[] args) {
        Game[] g=new Game [3];  
        

        

        g[0]=new Game(); // Just categorizing all sub classes in one form.
        g[1]=new Cricket();
        g[2]=new Football();

        for(int i=0;i<3;i++){
            g[i].print(); //calls its own overridden methods
            
        }

    }
}