import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
        int i =0,sum=0;
    while(n>0)
    {
        sum = sum + exponent(10,i)*(n%b);
        n = n/b;
        i++;
    }
    return sum;
   }
  public static int numberofdigits(int n)
{
    int count = 0;
    
    while(n>0)
    {
        n = n/10;
    
        count++;
    }
    return count;
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
  }
