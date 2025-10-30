 import java.util.*;
class Exceptiondemo2 {

    public static void main(String Arr[])
    {   
        

        Scanner sobj=new Scanner (System.in);
        
        float iNo1=0,iNo2=0,fAns=0.0f;

        System.out.println("enter the first number");
        iNo1=sobj.nextInt();

        System.out.println("enter the second number");
        iNo2=sobj.nextInt();

        fAns=(float)iNo1 / (float)iNo2; //explicite type casting

        System.out.println("division is "+fAns);
    }
}
