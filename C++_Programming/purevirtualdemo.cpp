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

class derived : public base // EEROR
{
public:
    int x;

 };

int main()
{

    // base *bp = new derived();    // Upcasting
    
      
    return 0;
}