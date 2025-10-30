     interface A
{   
    int No=11;
    void fun();
    
    private void Display()
    {
        System.out.println("inside private display");
    }
    default void gun()
    {
        System.out.println("inside gun");
        Display();
    }
    
}
 
class Demo implements A  
{
    public void fun()
    {
        System.out.println("inside the fun");  
    }

     
}

 class Interfacedemo9 {

    public static void main(String Arr[])
    {   
        Demo dobj=new Demo();
        dobj.fun();
        dobj.gun();
        //dobj.Display(); ERROR
        
    }
}
