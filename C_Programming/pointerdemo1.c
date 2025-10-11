#include<stdio.h>
int main()
{   
    int ivalue=11;
    char cvalue='i';

    int*iptr=&ivalue;
    char*cptr=&cvalue;

    printf("size of iptr : %lu \n",sizeof(iptr));
    printf("size of cptr:  %lu \n",sizeof(cptr));
    // pointer is bydefault unsigned long
    return 0;

}

