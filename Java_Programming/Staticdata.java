 class Demo
 {
    public int i;
    static public int j=21;

    public Demo()
    {
        this.i=11;
        
    }
 }
 
 class Staticdata {

    public static void main(String Arr[])
    {
        System.out.println(Demo.j);
        Demo dobj=new Demo();
         System.out.println(dobj.i);


    }
    
}
