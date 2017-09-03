import java.util.*;
public class repeat
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int m=scan.nextInt();
int n[]=new int[m];
for(int i=0;i<m;i++)
{
n[i]=scan.nextInt();
}
for(int i=0;i<m;i++)
{
for(int j=i+1;j<m;j++)
{
if(n[i]==n[j])
{
System.out.print(n[i]);
System.exit(0);
}}}
}
}
