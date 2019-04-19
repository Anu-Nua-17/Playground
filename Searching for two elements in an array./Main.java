#include<stdio.h>
int main()
{
  int arr_size;
  scanf("%d",&arr_size);
  int arr[10];
  for(int idx=0;idx<=arr_size-1;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int ele1;
  scanf("%d",&ele1);
  int ele2;
  scanf("%d",&ele2);
  int ele1_idx= -1;
  int ele2_idx= -1;
  for(int idx=0;idx<=arr_size-1;idx++)
  {
    if (ele1==arr[idx])
    {
      ele1_idx=idx;
    }
    if(ele2==arr[idx])
       {
         ele2_idx=idx;
       }
       }
       printf("%d\n",ele1_idx);
       printf("%d\n",ele2_idx);
       
  return 0;
}