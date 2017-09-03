import java.util.*;
public class nonrepeat
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
nonrepeat x=new nonrepeat();
System.out.print(x.findnum(n));
}
public static int findnum(int[] array)
{
Set<Integer> set=new HashSet<Integer>();
for(int item:array)
{
if(!set.remove(item)){
set.add(item);}
}
assert set.size()==1;
return set.iterator().next();
}
}
