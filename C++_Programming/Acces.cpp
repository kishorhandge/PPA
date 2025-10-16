#include<iostream>
using namespace std;

class Base //12
{
public:
    int i;

private:
    int j;

protected:
    int k;

public:
    Base()
    {
        i = 10;
        j = 20;
        k = 30;
    }
    void fun()
    {
        cout << i << "\n"; //Allowed
        cout << j << "\n"; //Allowed
        cout << k << "\n"; //Allowed
    }
};
class Derived : public Base //16
{
public:
    void Display()
    {
        cout << i << "\n"; //Allowed
        //cout << j << "\n"; // Not Allowed ...ERROR
        cout << k << "\n"; // Allowed
    }
};
int main()
{
    Base bobj;
    Derived dobj;

    cout << bobj.i << "\n"; //Allowed
    //cout << bobj.j << "\n"; //ERROR
    //cout << bobj.k << "\n"; //ERROR

    cout << dobj.i << "\n"; //Allowed
    //cout << dobj.j << "\n"; // ERROR
    //cout << dobj.k << "\n"; //ERROR

    dobj.fun(); //Allowed
    dobj.Display(); //Allowed

    return 0;
}