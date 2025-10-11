#include<stdio.h>
int main()
{   
    char cvalue='i';
    int ivalue=11;
    float fvalue=90.78f;
    double dvalue=98.56768;

    printf("size of character is: %d\n",sizeof(cvalue) );
    //printf("size of character is: %lu\n",sizeof(cvalue) );

    printf("size of integer is: %d\n",sizeof(ivalue) );
    //printf("size of character is: %lu\n",sizeof(cvalue) );

    printf("size of float is: %d\n",sizeof(fvalue) );
    //printf("size of character is: %lu\n",sizeof(cvalue) );
    
    printf("size of double is: %d\n",sizeof(dvalue) );
    //printf("size of character is: %lu\n",sizeof(cvalue) );

    return 0;
}