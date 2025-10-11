#include <stdio.h>
#include <stdlib.h>

int main()
{
    int length = 0;
    int *Arr = NULL;

    printf("enter the number of element \n");
    scanf("%d", &length);
    // step 1:allocate the memory

    Arr = (int *)malloc(length * sizeof(int));

    if (Arr == NULL)
    {
        printf("unable to allocate memory\n");
    }
    else
    {
        printf("memory gets succesfully alloacvted\n");
    }
    // step2:use the memory
    /*........

    */
    // step3:free the memory

    free(Arr);
    return 0;
}