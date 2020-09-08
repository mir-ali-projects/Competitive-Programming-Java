import java.util.*;
import java.lang.Math; 
  public class PrintDigitsLtoR{
  
        public static void main(String[] args) {
        int n,n1,i=0;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        n1 = n;
        while(n1>0)
        {
            i++;
            n1 = n1/10;
        }
        
        while(i>0)
        {
         
            System.out.println(n/exponent(10,i-1));
            n = n%exponent(10,i-1);
            i--;
        }
   }
   public static int exponent(int num,int i)
   {
       int count=1;
       while(i>0)
       {
            count = count * num;
            i--;
           
       }
       return count;
   }
  }
