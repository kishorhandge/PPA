    class Demo extends Thread
{
    public void run()
    {
        System.out.println("inside run method  of : "+Thread.currentThread().getName());
    }
}
class ThreaduserdefinedJoinserial {
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
            dobj1.join();

            System.out.println("End of First thread");

            dobj2.start();
            dobj2.join();

            System.err.println("End of Second thread");
        }
        
        catch(InterruptedException iobj)
        {

        }
        

        System.out.println("End of main thread ");
    }
}

 