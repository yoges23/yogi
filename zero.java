import java.util.*;
import java.lang.*;
class Main
{
    static void minAbsSumPair(int m[], int n)
    {
      int inv_count = 0;
      int l, r, min_sum, sum, min_l, min_r;
      if(n < 2)
      {
        System.out.println("Invalid Input");
        return;
      }
      min_l = 0;
      min_r = 1;
      min_sum = m[0] + m[1];
      
      for(l = 0; l < n - 1; l++)
      {
        for(r = l+1; r < n; r++)
        {
          sum = m[l] + m[r];
          if(Math.abs(min_sum) > Math.abs(sum))
          {
            min_sum = sum;
            min_l = l;
            min_r = r;
          }
        }
      }
      
      System.out.println(" The two elements whose "+
                              "sum is minimum are "+
                        m[min_l]+ " and "+m[min_r]);
    }
    public static void main (String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m[]=new int[n];
        for(int i=0;i<n;i++)
        {
        m[i]=scan.nextInt();
        }
        minAbsSumPair(m, n);
    }
     
}
