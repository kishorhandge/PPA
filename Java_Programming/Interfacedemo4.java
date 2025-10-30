interface A
{
    void fun();
}
interface B
{
    void gun();
}
class Demo implements A,B // multiple inhertance
{
    public void fun()
    {
        System.out.println("inside the fun");
    }

    public void gun()
    {
        System.out.println("inside the gun");
    }
}

 class Interfacedemo4 {

    public static void main(String Arr[])
    {   
        Demo dobj=new Demo();
        dobj.fun();
        dobj.gun();
    }
}
//sequentially compilation technique