   interface A
{   
    int No=11;
    void fun();
}
interface B
{   
    int No=21;
    void fun();
}
class Demo implements A,B // multiple inhertance
{
    public void fun()
    {
        System.out.println("inside the fun"+A.No);  
    }

     
}

 class Interfacedemo7 {

    public static void main(String Arr[])
    {   
        Demo dobj=new Demo();
        dobj.fun();
        
    }
}
//sequentially compilation technique