class Demo
 {
    public int i;
    static public int j=21;

    public Demo()
    {
        this.i=11;
        
    }

    public void fun()  //instance method
    {
        System.out.println("fun i"+this.i);
        System.out.println("fun j"+Demo.j);
    }
    public static void gun()  //class method
    {
       // System.out.println("gun i"+this.i); // not allowed
        System.out.println("gun j"+Demo.j);
    }
 }
 
 class Staticmethod {

    public static void main(String Arr[])
    {
        Demo.gun();
        System.out.println(Demo.j);
        Demo dobj=new Demo();
         System.out.println(dobj.i);
         dobj.fun();



    }
    
}
