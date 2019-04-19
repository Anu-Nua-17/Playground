#include<stdio.h>
int main()
{
  int r;
    scanf("%d",&r);
  int c;
  scanf("%d",&c);
  int a[10][10];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
    scanf("%d",&a[i][j]);
    }
  }
  int tran[10][10];
  
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        tran[j][i]=a[i][j];
      }
    }
  
    for(int i=0;i<c;i++)
    {
      for( int j=0;j<r;j++)
      {
        printf("%d ",tran[i][j]);
        if(j==r-1)
        printf("\n");
      }
    }
  return 0;
}