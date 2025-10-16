#include<iostream>
using namespace std;

class demo
{   public:
    void display()
    {
        cout<<"inside the display\n";
    }
};

int main()
{    demo dobj;

    cout<<sizeof(dobj); //1 byte

    return 0;
}