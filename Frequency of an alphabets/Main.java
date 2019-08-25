// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<string.h>
// Main function
int main()
{
  // Enter your code here 
  char str[50];
  int i,count[26] = {0};
  gets(str);
 
  for(i = 0; i < strlen(str) ; i++){
     count[str[i]-'a']++;
  }
  
  for(i = 0; i < 26 ; i++){
    if(count[i] != 0){
     printf("%c%d ",i+'a',count[i]);
    }
  }
  
   return 0;
}