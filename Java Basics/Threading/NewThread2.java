public class NewThread2 implements Runnable{
    Thread t;
    NewThread2()
    {
        t=new Thread(this);
        System.out.println("Child Thread: "+t.getName());
        t.start();
    }

    public void run()
    {
        try {
            for(int i=0;i<5;i++)
            {
                System.out.println(t.getName()+" :"+i);
                t.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
