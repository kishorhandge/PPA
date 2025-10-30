class Base
{
    public int i,j;

    
    public void fun()
    {
        System.out.println("inside the base fun");
    }
    public void gun()
    {
        System.out.println("inside the base gun");
    }
    public void sun()
    {
        System.out.println("inside the base sun");
    }
    public void bun()
    {
        System.out.println("inside the base bun");
    }



}
class Derived extends Base
{
    public int x;

    
    public void gun()
    {
        System.out.println("inside the derived gun");
    }
    public void sun()
    {
        System.out.println("inside the derived sun");
    }
    public void run()
    {
        System.out.println("inside the derived run");
    }
    public void mun()
    {
        System.out.println("inside the derived mun");
    }
    

}

class RMDDEMO2
{
    public static void main(String A[])
    {
         
        Base bp=new Derived(); //UpCasting

        bp.fun();  //base fun
        bp.gun();   // derived gun
        bp.sun();   // deriveed sun
        // bp.run();   // ERROR
        // bp.mun();   //  ERROR
        bp.bun();   // base bun
         
    }
}