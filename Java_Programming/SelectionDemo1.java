import java.util.Scanner;
class SelectionDemo1 {  
    public static void main(String Arr[])
    {
         
        Scanner sobj=new Scanner(System.in);
        int iNo=0;

        System.out.println("Enter your age");
        iNo=sobj.nextInt();

        if(iNo>=18)
        {
            System.out.println("You  Can Vote");
        }
        else
        {
            System.out.println("You  Cant Vote");
        }
        
    }
}

