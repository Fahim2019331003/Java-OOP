public class NewThread extends Thread{
    
    NewThread()
    {
        System.out.println("Child Thread: "+this);
        start();
    }

    public void run()
    {
        try {
            for(int i=0;i<5;i++)
            {
                System.out.println(this.getName()+" :"+i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
