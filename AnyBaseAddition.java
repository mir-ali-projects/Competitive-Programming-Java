import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
      int c=0,ans,sum=0,i=0,e;
    while(n1>0||n2>0||c>0)
    {
        ans =n1%10 + n2%10 + c;
        c = ans/b;
        ans = ans%b;
       
        sum = sum + exponent(10,i)*ans;
        n1 = n1/10;
        n2 = n2/10;
        i++;
    }
     return sum;
   }
  public static int exponent(int num , int i)
{
   int count = 1;
    while(i>0)
    {
        count = num * count;
        i--;
    }
    return count;
}
  }
