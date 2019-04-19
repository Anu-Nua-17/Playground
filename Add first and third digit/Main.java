#include<stdio.h>
int main()
{
  int n,add,f,t;
  scanf("%d",&n);
  f=n/100;
  t=n%10;
  add=f+t;
  printf("%d",add);
  
  return 0;
}