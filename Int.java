import java.util.*;
public class Int
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int c=0;
while(n>0)
{
n=n/10;
c++;
}
System.out.print(c);
}
}
