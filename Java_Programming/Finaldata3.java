  class Demo
{
    public int i;
    final public int j;

    public Demo()
    {
        this.i=12;
        this.j=22;
    }
}
class Finaldata3
{
    public static void main(String A[])
    {
        Demo dobj=new Demo();
        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        //dobj.j++; //ERROR
    }
}