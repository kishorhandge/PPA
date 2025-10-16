#include <iostream>
using namespace std;

class Base //8
{
public:
        int i, j;

    void fun()
    {
        cout << "inside base fun\n";
    }
};
class Derived : public Base //12
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

    cout << "size of base class object:" << sizeof(bobj) << "\n";

    cout << "size of derived class object:" << sizeof(dobj) << "\n";
    return 0;
}