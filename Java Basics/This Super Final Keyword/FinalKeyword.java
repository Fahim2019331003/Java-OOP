public class FinalKeyword {

    final int x=10;
    final int y; //Final black variable;
    static final int ZACK;

    FinalKeyword()
    {
        y=-100;
        System.out.println("Constructor");

    }
    static{
        ZACK=900;
        System.out.println("static block");
    }

    void print()
    {
        System.out.println(x+" "+y+" "+" "+ZACK);
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        FinalKeyword ob= new FinalKeyword();

        ob.print();

    }
}
