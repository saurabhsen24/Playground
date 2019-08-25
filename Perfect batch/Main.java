/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,j,a[50],b[50],temp = -1, c = 0,sum = 0,flag;
  scanf("%d",&n);
  for(i = 0; i < n; i++)
    scanf("%d",&a[i]);
  for(i = 0; i < n; ){
     if( c != 3){
        sum += a[i];
       c++;
       i++;
     }
    if(c == 3){
         b[j++] = sum;
        sum = 0;
        c = 0;
     }
  }
  
  temp = b[0];
  flag = 1;
  for(i = 1; i < j; i++){
     if(temp != b[i]){
       flag = 0;
       break;
     }
  }
  
  if(flag){
    printf("Perfect Batch");
  }else{
    printf("Not a Perfect Batch");
  }
  return 0;
}