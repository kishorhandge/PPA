#include<iostream>
using namespace std;
class arithematic {
    
    public:
        int iNo1;
        int iNo2;

        arithematic(){
            iNo1=0;
            iNo2=0;
        }

        arithematic(int a,int b)
        {
            iNo1 = a;
            iNo2 = b;
        }

        int addition()
        {
            int ians = 0;
            ians = iNo1 + iNo2;
            return ians;
        }

        int substraction()
        {
            int ians = 0;
            ians = iNo1 - iNo2;
            return ians;
        }

};

int main()
{   
    arithematic aobj1(11,10);
    int iRet = 0;

    iRet=aobj1.addition();
    cout<<"addition is :"<<iRet<<"\n";

    iRet=aobj1.substraction();
    cout<<"substraction is :"<<iRet<<"\n";

    return 0;
}