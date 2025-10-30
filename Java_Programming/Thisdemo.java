class Demo
{
    public int i;
    public static  int j ;

    static {
        j=21;
    }
    public Demo()
    {   
        System.out.println("inside the default");
        this.i=11; // first use
    }
    public Demo(int a)
    {   
        this(); //second use
        System.out.println("inside the parametrized"); 
    }
    public void Display()
    {
        System.out.println("inside the display: "+this.i); // third use
    }
}
class Thisdemo {

    public static void main(String Arr[])
    {
        Demo dobj=new Demo(51);
        dobj.Display();
    }
}
