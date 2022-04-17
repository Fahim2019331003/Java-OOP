public class classA {
    int x=5;

    classA()
    {
        int x=-100;
    }
    classA(int x)
    {
        this.x=x+9;
    }

    public void f()
    {
        System.out.println("This is in class A "+ x);
    }
}
