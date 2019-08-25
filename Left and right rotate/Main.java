// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int a[50],n,i,j,temp1 = 0,temp2 = 0,k = 0,rotate,odd_ele,eve_ele;
  scanf("%d",&n);
  for(i = 0; i < n ; i++){
     scanf("%d",&a[i]);
  }
  scanf("%d",&rotate);
  
  odd_ele = (n%2 == 0)? n-2 : n-1;
  eve_ele = (n%2 == 0)? n-1 : n-2;
  
  for(i = 0 ; i < rotate; i++){
    temp1 = a[odd_ele];
     for(j = odd_ele ; j > 0; j -= 2){
          a[j] = a[j-2];
     }
    
    a[0] = temp1;
     temp2 = a[1];
     for(k = 1 ; k < n; k += 2){
          a[k] = a[k+2];
     }
    a[eve_ele] = temp2;   
  }
  
  
  for(i = 0; i < n ;i++){
    printf("%d ",a[i]);
  }
   return 0;
}