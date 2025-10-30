class Demo
{
    public int division(int No1,int No2)  throws ArithmeticException //Like Warning board
    {
        int Ans=0;

        Ans=No1/No2;
        return Ans;
    }
}
class Throwsdemo {
    public static void main(String Arr[])
    {
        Demo obj=new Demo();
        int Ret=0;
        try{

            Ret=obj.division(11,0);
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("inside catch block"+aobj);
        }
        
        System.out.println("division is "+Ret);
    }
}
