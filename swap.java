import java.util.*;
public class swap
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.next();
StringBuilder output = new StringBuilder();
 
char[] characters = s.ToCharArray();
 
for (int i = 0; i &lt; characters.Length; i++)
{
  if (i % 2 == 0)
  {
    if((i+1) &lt; characters.Length )
    {
      output.Append(characters[i + 1]);
    }
               output.Append(characters[i]);
  }
}
