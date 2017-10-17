import java.util.*;
public class student
{
public static void main(String args[])
{
int n1,x,p,i,j=1;
Scanner scan=new Scanner(System.in);
n1=scan.nextInt();
p=scan.nextInt();
for(i=0;i<2*n1;i++)
{
x=2*n1-i;
if(p!=x)
{
System.out.print(p,j++,p);
}
}
}}
