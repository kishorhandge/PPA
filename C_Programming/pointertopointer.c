#include<stdio.h>
int main()
{   
    int no=11;

    int *p = &no;
    int **q = &p;
    int ***a = &q;
    int ****b = &a;
    int *****c = &b;

    printf("%d\n",no); //11
    printf("%d\n",*p);
    printf("%d\n",**q);
    printf("%d\n",***a);
    printf("%d\n",****b);
    printf("%d\n",*****c);
     
    return 0;
}