import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
    int dest = AnyBasetoAnyBase(n,sourceBase,destBase);
    System.out.println(dest);
  } 
  public static int AnyBasetoAnyBase(int n,int source , int dest)
  {
      int i,j;
      i = getValueIndecimal(n, source);
      j = getValueInBase(i, dest);
  
      return j;
  }
    public static int getValueIndecimal(int n, int b)    
   {
    int sum = 0 , i=0;
     while(n>0)
     {
         sum = sum + (n%10)*exponent(b,i);
         i++;
         n=n/10;
     }
     return sum;
   }
    public static int exponent(int n,int i)
    {
        int count = 1;
         while(i>0)
        {
            count = count * n;
            i--;
        }
        return count;
    }
    public static int getValueInBase(int n, int b)
    {
    int i =0,sum=0;
    while(n>0)
    {
        sum = sum + exponent(10,i)*(n%b);
        n = n/b;
        i++;
    }
    return sum;
   }
  }
