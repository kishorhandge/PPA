import java.util.Scanner;

public class SwitchDemo {
    public static void main(String Arr[])
    {
         
        Scanner sobj=new Scanner(System.in);
        int istd=0;

        System.out.println("Enter your Standard");
       istd=sobj.nextInt();
        switch(istd)
        {
            
       case 1:
       System.out.println("Exam At 9 AM");
       break;

       case 2:
       System.out.println("Exam At 10 AM");
       break;

       case 3:
       System.out.println("Exam At 11 AM");
       break;

       case 4:
       System.out.println("Exam At 12 NOON");
       break;

       default:

         System.out.println("Invalid standard");
        }

    }
}
