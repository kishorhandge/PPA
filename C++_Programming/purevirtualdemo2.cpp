#include<iostream>
using namespace std;

class base
{
public:
    int i, j;
    int addition(int a ,int b) //concrete
    {
        return a+b; 
    }
    virtual int substraction(int a ,int b)=0; // abstract 

     
};

class derived : public base 
{
public:
    int x;
    int substraction(int a ,int b) //concrete
    {
        return a-b;
    }
    int multiplication(int a ,int b) //concrete
    {
        return a*b;
    }

 };

int main()
{

    base *bp = new derived();
    int iRet=0; // Upcasting
       
    iRet=bp->addition(11,10);   //21
    cout<<iRet<<"\n";

    iRet=bp->substraction(11,10);
    cout<<iRet<<"\n"; //1
    
    // iRet=bp-> multiplication(11,10); //ERROR
      
    return 0;
}