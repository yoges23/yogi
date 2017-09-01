import java.util.*;
public class sum
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int c=0,i;
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=scan.nextInt();
c=c+a[i];
}
System.out.print(c);
}}
