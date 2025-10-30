final class Base
{
     public void fun()
     {
        System.out.println("inside the base fun");
     }
}

class Derived 
{
    public Base bobj;

    public Derived()
    {
        bobj=new Base();
    }
}

class Finalclass2
{
    public static void main(String A[])
    {
         Derived dobj=new Derived();
         dobj.bobj.fun();
         
    }
}