#include<stdio.h>
int main()
{
  //Type your code here
  int n,first,third;
  scanf("%d",&n);
  first = n%10;
  third = n/100;
  printf("%d",first+third);
  return 0;
}