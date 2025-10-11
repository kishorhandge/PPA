 #include<stdio.h>

struct demo
{
    int i;
    char ch;
    char ch2;
    float f;
    int j;
    
};

int main()
{     
     printf("size of structure : %lu\n",sizeof(struct demo));
     

    return 0;

}