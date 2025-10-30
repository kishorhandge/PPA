 class Hello
 {
    public int i;

    public Hello(int No)
    {
        System.out.println("inside the Hello constructor");
        this.i=No+1;
    }
    public void Display()
    {
        System.out.println("inside the Hello display");
    }
 }
 class Demo extends Hello
{
    public int i;
     
     
    public Demo(int a)
    {   super(a);                         //first use
        System.out.println("inside the demo constructor");
        this.i=a; 
    }
     
    public void Display()
    {   
        int i=0;
        System.out.println("inside the display: "+i);      //0
        System.out.println("inside the display: "+this.i); //51
        System.out.println("inside the display: "+super.i); //52 Second use
        super.Display();                                    //third use
    }
}
class Superdemo {

    public static void main(String Arr[])
    {
        Demo dobj=new Demo(51);
        dobj.Display();
        
    }
}
