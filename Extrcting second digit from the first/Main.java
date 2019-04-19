#include<stdio.h>
int main()
{
    int n,sec;
    scanf("%d", &n);
    
    while (n >= 100)
    {
        n=n/10;
    }
    sec=n%10;
    printf("%d", sec);
    return 0;
}