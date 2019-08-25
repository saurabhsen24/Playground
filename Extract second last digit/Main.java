#include<stdio.h>
int main()
{
  //Type your code here
  int n,second_last;
  scanf("%d",&n);
  second_last = (n/10)%10;
  printf("%d",second_last);
  return 0;
}