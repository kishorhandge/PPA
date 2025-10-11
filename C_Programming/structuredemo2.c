#include<stdio.h>

struct demo
{
    int i;
    float f;
    int j;
};

int main()
{    struct demo obj;
    obj.i=11;
    obj.f=87.98;
    obj.j=21;

    printf("size of demo is: %lu\n",obj.i); //11
    printf("size of demo is: %lu\n",obj.f); //87.98
    printf("size of demo is: %lu\n",obj.j); //21
     

    return 0;

}