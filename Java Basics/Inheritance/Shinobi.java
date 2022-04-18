public class Shinobi {
    String name;
    int id;

    Shinobi()
    {
        name="xxx";
        id=-1;
    }

    public void print()
    {
        System.out.println(name + " "+id );
        
    }
    public void f(int x)
    {
        x+=10;
    }
    public int f(double y)
    {
        y=10;
        return (int )y;
    }

}
