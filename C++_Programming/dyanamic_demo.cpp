#include<iostream>
using namespace std;

int main()
{   

    int length = 0;
    int *Arr=NULL;


    cout<<"enter the number elements\n";
    cin>>length;

    //step 1: alloacte the memory

    Arr=new int[length];

    if(Arr == NULL)
    {
        cout<<"unabale to alloacte the memory";
    }
    else{
        cout<<"memory gets sucsefully alloacated";
    }

    // step 2: use of memory


    //step 3: dealloacte the memory

    delete [] Arr;
    return 0;
}