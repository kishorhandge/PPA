#include<stdio.h>
int main()
{   
    int arr[4]={10,20,30,40};

    int brr[]={10,20,30,40,50};

    int crr[6]={10,20,30};

    printf("size of arr %lu\n",sizeof(arr)); //16
    printf("size of brr %lu\n",sizeof(brr)); //20
    printf("size of crr %lu\n",sizeof(crr)); // 24

    return 0;

}