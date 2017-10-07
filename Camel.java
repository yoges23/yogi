import java.util.*;
public class Camel
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
String result="";
char a=s.charAt(0);
result=result+Character.toUpperCase(a);
for(int i=1;i<s.length();i++)
{
char c=s.charAt(i);
char p=s.charAt(i-1);
if(p==' ')
{
result=result+Character.toUpperCase(c);
}
else
{
result=result+c;
}
}
System.out.print(result);
}}
