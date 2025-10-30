  interface Demo
{
    int No=11;
    void Display();

}
class Hello implements Demo{
    public void Display()
    {
        System.out.println("inside display");
    }
}

 class Interfacedemo3 {

    public static void main(String Arr[])
    {   
        System.out.println(Demo.No); // No is public and static
       // Demo.No=12; No is final

        Hello hobj=new Hello(); 
        hobj.Display();
    }
}
