#include<stdio.h>
int main()
{
	//write your code here
    int queue[100];
    char s[100];
    int n,front = 0, rear = -1,data;
    scanf("%d",&n);
    for(int i = 0 ; i < 10 ; i++){
       scanf("%s",s);
       if(s[0] == 'e'){
          scanf("%d",&data);
          queue[++rear] = data;
       }else if(s[0] == 'd'){
          printf("%d\n",queue[front++]);
       }else if(s[0] == 'p'){
          for(int j = front ; j <= rear ; j++){
             printf("%d ",queue[j]);
          }
          printf("\n");
       }
    }
    return 0;
}
            