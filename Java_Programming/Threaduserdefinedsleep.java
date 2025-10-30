     //code to demonstrates the thread sheduling
     class Demo extends Thread
{
    public void run()
    {
        int i=0;
        for(i=1;i<=5;i++)
        {
            System.out.println("inside run method  of : "+Thread.currentThread().getName());
        }

        
    }
}
class Threaduserdefinedsleep {
    public static void main(String Arr[])  
    {
        System.out.println("inside main thread ");

        Demo dobj1=new Demo();
        Demo dobj2=new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");
    try
        {
            dobj1.start();
            dobj2.start();

            dobj1.join();
            dobj2.join();

             
        }
        
        catch(InterruptedException iobj)
        {

        }
        

        System.out.println("End of main thread ");
    }
}
 