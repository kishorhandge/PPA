  class Demo
 {
    public int i;  //instance variable
    static public int j;  //class variable
    
    static {
        
        System.out.println("inside static block");
        j=21;
    }
    public Demo()
    { 
        System.out.println("inside constructor");
        this.i=11;
        
    }
    

     
 }
 
 class StaticblockX {

    public static void main(String Arr[])
    {
        
        System.out.println("inside the main");
        Demo dobj1=new Demo();
        Demo dobj2=new Demo();
        Demo dobj3=new Demo();
         



    }
    
}
