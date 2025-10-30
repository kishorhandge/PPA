class Base
{
    public:
    int i,j;



}
class Derived extends Base
{
    public:
    int x;

}

class RMDDEMO1
{
    public static void main(String A[])
    {
        base bp1=new base();  //No Casting
        derived dp1=new derived(); //No Casting
        base bp2=new derived(); //UpCasting
        derived dp2=new base(); //Downcasting //error
    }
}