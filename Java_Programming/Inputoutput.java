import java.util.Scanner; 

class Inputoutput {
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1=0; 
        int iNo2=0; 
        
        int Ans=0;

        System.out.println("enter the first number");
        iNo1=sobj.nextInt();

        System.out.println("enter the second number");
        iNo2=sobj.nextInt();

        Ans=iNo1+iNo2;

        System.out.println("addition is : "+Ans);
    }
}
