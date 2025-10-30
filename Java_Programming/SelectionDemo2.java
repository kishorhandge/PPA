import java.util.Scanner;
 class SelectionDemo2 {
    
  
    public static void main(String Arr[])
    {
         
        Scanner sobj=new Scanner(System.in);
        int istd=0;

        System.out.println("Enter your Standard");
        istd=sobj.nextInt();

        if(istd == 1)
        {
            System.out.println("Exam At 9 Am");
        }
        else if(istd==2)
        {
            System.out.println("Exam At 10 Am");
        }
        else if(istd == 3)
        {
            System.out.println("Exam At 11 Am");
        }
        else if(istd == 4)
        {
             System.out.println("Exam At 12 Noon");
        }
        else
        {
             System.out.println("Invalid Standard");
        }
    }
}



