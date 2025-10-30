 interface A
{
    void fun();
}
interface B
{
    void fun();
}
class Demo implements A,B // multiple inhertance
{
    public void fun()
    {
        System.out.println("inside the fun");
    }

     
}

 class Interfacedemo5 {

    public static void main(String Arr[])
    {   
        Demo dobj=new Demo();
        dobj.fun();
        
    }
}
//sequentially compilation technique