public class classC extends classB{
    int x=1;

    classC()
    {
        super(10);
    }
    public void ff()
    {
        System.out.println(( (classA)this).x + " "+super.x+" "+ x  ); /// (className)this.variable is used to access the upper ancestors.
    }
}
