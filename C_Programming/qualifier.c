#include<stdio.h>
int main()
{
    int iNO1=10;
    const int iNO2=20;
    
    // below line generate error
    iNO1++; //INO1=INO1+1
    iNO2++; //INO2=INO2+1
    iNO2=30;
    return 0;
}