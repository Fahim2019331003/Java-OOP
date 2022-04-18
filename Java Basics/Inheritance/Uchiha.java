public class Uchiha extends Shinobi{
    
    String style;
    int villNo;

    Uchiha()
    {
        style="fire";

    }
    Uchiha(String x,int y)
    {
        name=x;
        villNo=y;

    }

    @Override
    public void print()
    {
        super.print();
        System.out.println(name+" "+ id +" "+style+" "+villNo);
        
        
    }

}
