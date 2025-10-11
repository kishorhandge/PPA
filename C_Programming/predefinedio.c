#include<stdio.h>

int main()
{
    int value1=0;
    int value2=0;
    int ans=0;

    printf("enter the first value\n");
    scanf("%d",&value1);

    printf("enter the second value\n");
    scanf("%d",&value2);

    ans=value1+value2;

    printf(" The Addition is %d",ans);
    return 0;
}