//Program to find amstrong number or not

#include<stdio.h>


int main()
{
    int remainder,number,sum = 0,summa;
    printf("Enter a number:");
    scanf("%d",&number);
    summa = number;
    while(number > 0)
    {
        remainder = number % 10;
        sum = sum + (remainder*remainder*remainder);
        number = number /10;
    }
    if(number = summa)
    {
        printf("amstrong number");
    }
    else
    {
        printf("Not an amstrong number");
    }

}