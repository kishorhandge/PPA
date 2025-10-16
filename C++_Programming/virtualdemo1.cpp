#include <iostream>
using namespace std;

class base
{
public:
    int i, j;
    void fun()
    {
        cout << "inside the base fun\n";
    }
    void gun()
    {
        cout << "inside the base gun\n";
    }
    void sun()
    {
        cout << "inside the base sun\n";
    }
    void bun()
    {
        cout << "inside the base bun\n";
    }
};

class derived : public base
{
public:
    int x;
    void gun()
    {
        cout << "inside the base fun\n";
    }
    void run()
    {
        cout << "inside the derived run\n";
    }
    void mun()
    {
        cout << "inside the derived mun\n";
    }
};

int main()
{
    base *bp1 = new base();       // Nocasting
    derived *dp1 = new derived(); // Nocasting
    base *bp2 = new derived();    // Upcasting
    //derived *dp2=new base();       // Downcasting(not allowed)   Error

    cout << sizeof(base) << "\n";    // 8
    cout << sizeof(derived) << "\n"; // 12
    return 0;
}