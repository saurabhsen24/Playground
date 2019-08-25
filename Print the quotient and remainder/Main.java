#include<stdio.h>
int main()
{
  //Type your code here
  int num,d,q,rem;
  num = 365;
  d = 4;
  q = num/d;
  rem = num%d; 
  printf("Quotient: %d\n",q);
  printf("Remainder: %d",rem);
  return 0;
}