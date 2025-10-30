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
    public void run()  
    {

    }
}
class ThreadUserDefinedSynchronized  {
    public static void main(String Arr[])  
    {
        Tableprinter tobj=new Tableprinter();
        tobj.printtable(5);
        tobj.printtable(4);
    }
}

 

