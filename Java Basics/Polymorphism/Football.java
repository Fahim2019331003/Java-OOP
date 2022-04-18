public class Football extends Game {
    int goal;

    Football()
    {
        goal=2;
        score=11;
    }

    @Override
    public void print()
    {
        System.out.println("Football score : "+ score +" "+goal);
    }
}
