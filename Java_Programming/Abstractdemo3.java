 
abstract class Base
{
    public int i,j;
    public int addition(int a ,int b)
    {
        return a+b;
    }
    abstract public int substraction(int a ,int b);

    
    


}
 class Derived extends Base 
{
     public int substraction(int a ,int b)
     {
        return a-b;
     }
     public int multiplication(int a ,int b)
     {
        return a*b;
     }
}
class Abstractdemo3
{
    public static void main(String A[])
    {
         
        Base bp=new Derived();  
        int iRet=0;

        iRet=bp.addition(11,10);
        System.out.println(iRet);

        iRet=bp.substraction(11,10);
        System.out.println(iRet);
        
        // iRet=bp.multiplication(11,10); ERROR

         
         
    }
}

