   import java.util.*;
class Exceptiondemo4 {

    public static void main(String Arr[])
    {   
        

        Scanner sobj=new Scanner (System.in);
        
        int iNo1=0,iNo2=0,iAns=0;

        System.out.println("enter the first number");
        iNo1=sobj.nextInt();

        System.out.println("enter the second number");
        iNo2=sobj.nextInt();

        try
        {
            System.out.println("inside try block");
            iAns=iNo1 / iNo2; 
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("inside the catch block");
            System.out.println(aobj);
        }
         

        System.out.println("division is "+iAns);
    }
}
