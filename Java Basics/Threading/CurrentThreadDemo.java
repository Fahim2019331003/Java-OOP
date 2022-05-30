import javax.sound.midi.SysexMessage;

public class CurrentThreadDemo {

    public static void main(String[] args) {
        
        // new NewThread();
        // new NewThread();
        new NewThread2();

        Thread t=Thread.currentThread();
        System.out.println("Thread Info: "+t.getName()+" Priority: "+t.getPriority());
        t.setName("GaySexWith Nazif");
        t.setPriority(3);
        System.out.println("Thread Info: "+t.getName()+" Priority: "+t.getPriority());

        try{
            for(int i=0;i<5;i++){
                System.out.println(i);
                t.sleep(1000);
                
            }
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
        

        //Thread name:Thread priority:Thread group.
        //maximum:10,min:1. main priority 5.
    }
}