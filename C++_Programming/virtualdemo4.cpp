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
    virtual void sun()
    {
        cout << "inside the base sun\n";
    }
    virtual void bun()
    {
        cout << "inside the base bun\n";
    }
};

class derived : public base
{
public:
    int x;
    void fun()
    {
        cout << "inside the base fun\n";
    }
    void gun()
    {
        cout << "inside the base fun\n";
    }
     
    void sun()
    {
        cout << "inside the derived sun\n";
    }
    void mun()
    {
        cout << "inside the derived mun\n";
    }
};

int main()
{

    base *bp = new derived();    // Upcasting
    
     bp->fun(); // base fun
     bp->gun(); // base gun
     bp->sun(); // derived sun
    //  bp->run(); //Error
    //  bp->mun(); //Error
     bp->bun(); // base bun
    return 0;
}