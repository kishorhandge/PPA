 
 import java.util.*;

 class AgeInvalidException extends Exception
{ 
    public AgeInvalidException(String str)
    {
        super(str);
    }
}
class Throwdemo {
    public static void main(String Arr[])  
    {
         Scanner sobj=new Scanner (System.in);
         System.out.println("enter the age");
         int Age=sobj.nextInt();

         try{
            if(Age<18)
         {
            throw new AgeInvalidException("your age is below 18 ");
         }
         }
         catch(AgeInvalidException aobj)
        
         {
            System.out.println(aobj);
         }
        



    }
}
