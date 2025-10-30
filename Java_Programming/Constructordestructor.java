 class Demo 
{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        System.out.println("Inside dedault constructor");
    }

    public Demo(int i,int j)
    {
        System.out.println("Inside parametrized constructor");
    }
    protected void finalize() //~Demo
    {
        System.out.println("Inside finalize");
    }
} 
 class Constructordestructor

 {
    public static void main(String Arg[])
    {
         Demo dobj1 = new Demo();

         Demo dobj2 = new Demo(11,31);

         dobj1=null;
         dobj2=null;

         System.gc();

         System.out.println("End of main");
    }
 }