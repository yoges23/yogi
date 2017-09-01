import java.util.*;
import java.lang.*;
public class unique
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int m=scan.nextInt();
int a[]=new int[m];
int f=0;
for(int i=0;i<m;i++)
{
a[i]=scan.nextInt();
}
for(int i=0;i<m;i++)
{
for(int j=0;j<m;j++)
{
if(i!=j)
{
if(a[i]!=a[j])
{
f=1;
}
else
{
f=0;
break;
}
}}
if(f==1)
{
System.out.print(a[i]);
}
}}



