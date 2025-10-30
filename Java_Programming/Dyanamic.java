 import java.util.Scanner;
class Dyanamic {
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        int length=0;
        int Arr[];

        System.out.println("enter the number the elements");
        length=sobj.nextInt();

        Arr=new int[length];

        if(Arr == null)
        {
            System.out.println("unable to alloacte memory");
        }
        
        else{
            System.out.println("succesfully allocated");
        }

        Arr=null;
        System.gc();
    }
}
