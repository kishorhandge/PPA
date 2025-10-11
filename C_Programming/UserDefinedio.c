#include<stdio.h>

int Addition(int ino1,int ino2) // dossa shop and shoperkeeper write my order
{
    int isum=0;  // empty plate for take  dossa but this plate only used by shopkeeper
    isum=ino1+ino2; // he making a dossa 
    return isum;  // dossa is a ready and he gave me in my bag      BACK TO THE LINE NUMBER 26
}                           

int main()
{
    int ivalue1=0; // name of 1 product
    int ivalue2=0; // name of 2 product
    int ians=0; // it is like a empty bag which is use to carry the dossa

    printf("enter the first value:\n"); // i asked mom for dossa
    scanf("%d",&ivalue1);                // mom said she wants a  masala dossa

    printf("enter the second value:\n"); // i asked dad for dossa
    scanf("%d",&ivalue2);                 // dad said he wants a plane dossa


    ians=Addition(ivalue1,ivalue2); // i am going to market for dossa 
                                                                        
    printf(" The Addition is : %d",ians); // now  i am going to dossa shop  BACK IN LINE NUMBER 3
    return 0;       // BACK FROM LINE NUMBER 3 
} 

// it is like a mom and dad wants a dossa 