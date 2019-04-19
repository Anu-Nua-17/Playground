#include<stdio.h>
int main()
{
  int n,f,l,sum;
  scanf("%d",&n);
  f=n/10;
  l=n%10;
  sum=f+l;
  printf("%d", sum);
  return 0;
}