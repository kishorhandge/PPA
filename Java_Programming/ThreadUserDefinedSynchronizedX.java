 class Tableprinter
{
    public void printtable(int n)
    {
        int i=0;
        for(i=1;i<=10;i++)
        {
            System.err.println("Name:"+Thread.currentThread().getName()+":"+n*i);
        }
    }
}
     class Demo extends Thread
     
{
    public Tableprinter tobj;
    public int no;
    public  Demo(Tableprinter t,int n,String name)  
    {
        tobj=t;
        no=n;
        setName(name);
        
    }

    public void run()
    {
        tobj.printtable(no);
    }
}
class ThreadUserDefinedSynchronizedX  {
    public static void main(String Arr[])  
    {   
        Tableprinter obj=new Tableprinter();

         Demo dobj1=new Demo(obj,4,"First");
         Demo dobj2=new Demo(obj,5,"Second");

         dobj1.start();
         dobj2.start();
        try
        {
            dobj1.join();
            dobj2.join();
        }
        catch(InterruptedException iobj)
        {

        }
         

    }
}

 

