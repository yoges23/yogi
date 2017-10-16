import java.util.*;
public class prefix
{
public static void main(String args[])throws Exception
{
Scanner scan=new Scanner(System.in);
int n,k;
String a[]=new String[100];
for(int i=0;i<n;i++)
{
a[i]=scan.next();
}
String l,c;
if(a.length>0)
{
l=a[0];
}
for(int i=1;i<a.length;i++)
{
c=a[i];
for(k=0;k<Math.min(l.length(),a[i].length());k++)
{
if(l.charAt(k)!=c.charAt(k))
break;
}
l=a[i].substring(0,j);
}
System.out.print("Longest prefix is:"+l);
}
}
