public class classA {
    String name;
    int x=5;

    classA(int x,String name)
    {
        this.x=x;
        this.name=name;
    }
    classA(int x,int y,int z)
    {
        this(x+y,Integer.toString(x+y+z));
    }

    public void f()
    {
        System.out.println("This is in class A "+ x +" "+ name);
    }
}
