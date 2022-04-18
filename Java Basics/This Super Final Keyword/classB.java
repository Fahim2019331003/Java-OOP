public class classB extends classA{
    int x;

    classB(int x)
    {
        super(x,"");
        this.x=x;
    }
    @Override
    public void f()
    {
        System.out.println("This is in class B " + this.x +" "+ super.x); //this for class B,super is for A
    }
}
