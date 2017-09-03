import java.util.*;
import java.lang.*;
public class subset
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int n[]=new int[a];
int b=scan.nextInt();
int m[]=new int[b];
for(int i=0;i<a;i++)
{
n[i]=scan.nextInt();
}
for(int j=0;j<b;j++)
{
m[j]=scan.nextInt();
}
if(isSubset(n,m,a,b))
{
System.out.print("m[] is subset of n[]");
}
else
System.out.print("m[] is not a subset of n[]");
} 
static boolean isSubset(int n[],int m[],int a,int b)
{
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
if(n[i]==m[j])
{
break;
}
}
if(j==b)
{
return false;}
}
return true;
}
