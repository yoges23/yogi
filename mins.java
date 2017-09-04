import java.util.*;
public class mins
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String m=scan.next();
String n=scan.next();
String a[]=m.split(":");
String b[]=n.split(":");
  int c[]=new int[a.length];
  int d[]=new int[b.length];
  for(int i=0;i<a.length;i++)
  {
    c[i]=Integer.parseInt(a[i]);
  }
  for(int j=0;j<b.length;j++)
  {
    d[i]=Integer.parseInt(b[j]);
  }
  

