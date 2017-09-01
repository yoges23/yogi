import java.util.*;
import java.lang.*;
public class index
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=scan.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]==i)
{
System.out.print(a[i]);
}
}
}
}
