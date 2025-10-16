#include <iostream>
using namespace std;

class Base
{
public:
        int i, j;

    void fun()
    {
        cout << "inside base fun\n";
    }
};
class Derived : public Base
{
    public:
        int x;

    void gun()
    {
        cout<<"inside the Derived gun\n";
    }
};
int main()
{
    Base bobj;
    Derived dobj;

    bobj.fun();
    
    dobj.fun();
    dobj.gun();
    
    return 0;
}