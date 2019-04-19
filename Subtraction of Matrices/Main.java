#include<stdio.h>
int main()
{
  int r;
    scanf("%d",&r);
  int c;
  scanf("%d",&c);
  int a[5][5];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
    scanf("%d",&a[i][j]);
    }
  }
  int b[5][5];
  
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        scanf("%d",&b[i][j]);
      }
    }
  
    for(int i=0;i<r;i++)
    {
      for( int j=0;j<c;j++)
      {
        printf("%d ",a[i][j]-b[i][j]);
      }
       
        printf("\n");
      }
    
  return 0;
}