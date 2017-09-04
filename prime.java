import java.util.*;
public class prime
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int m=scan.nextInt();
int n=scan.nextInt();
int count=0,flag=0,i,j;
for(i=m;i<n;i++)
{
for(j=2;j<n/2;j++)
{
if(i%j==0)
{
flag=0;
}
else
{
count++;
}
}}
System.out.print(count);
}}
