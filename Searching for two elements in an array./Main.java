#include<stdio.h>
int main()
{
  //Type your code here
  int size,a[50],i,ele1,ele2,idx1,idx2,flag = 0,flag1 = 0,flag2 = 0;
  scanf("%d",&size);
  for(i = 0; i < size; i++){
     scanf("%d",&a[i]);
  }
  
  scanf("%d%d",&ele1,&ele2);
  for(i = 0; i < size;i++){
      if(ele1 == a[i]){
        idx1 = i;
        flag1 = 1;
      }
    
      if(ele2 == a[i]){
         idx2 = i;
        flag2 = 1;
      }
  }
  
  if(flag1 == 1 && flag2 == 1){
     printf("%d\n",idx1);
    printf("%d",idx2);
  }else if(flag1 == 1 && flag == 0){
      printf("%d\n",idx1);
      printf("-1");
  }else if(flag1 == 0 && flag2 == 1){
      printf("-1\n");
      printf("%d",idx2);
  }else{
     printf("-1\n-1");
  }
  
  return 0;
}