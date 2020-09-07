import java.util.*;

   public class Main {
   
       public static void main(String[] args) {
         int number,rotateby,newnumber;
         Scanner scn = new Scanner(System.in);
         number = scn.nextInt();
         rotateby = scn.nextInt();
         rotateby = rotateby%numberofdigits(number);
         if(rotateby<0)
         {
             rotateby = rotateby + numberofdigits(number);
         }
         newnumber = exponent(10,numberofdigits(number)-rotateby)*(number%exponent(10,rotateby)) + number/exponent(10,rotateby);
        System.out.println(newnumber);
       }
       public static int numberofdigits(int number)
       {
           int count=0;
           while(number>0)
           {
               number = number/10;
               count++;
           }
           return count;
       }
       public static int exponent(int num,int exp)
       {
           int result=1;
           while(exp>0)
           {
               result = result*num;
               exp--;
           }
           return result;
       }
   }
