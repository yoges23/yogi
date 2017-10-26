#include<stdio.h>
int main()
{
int x,y,x1,a=1;
printf("{enter a number");
scanf("%d",&x);
x1=x;
for(;x>1;)
{
a=a*x%10;
x=x/10;
}
a=a*x1;
printf("seed is %d",a);
return 0;
}
