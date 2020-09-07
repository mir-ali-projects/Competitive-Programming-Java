import java.util.*;
    
    public class GcdLcm{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num1, num2, copyn1 ,copyn2,rem=1;
      num1 = scn.nextInt();
      num2 = scn.nextInt();
      copyn1 = num1;
      copyn2 = num2;
      while(copyn1%copyn2!=0)
      {
          rem = copyn1%copyn2;
          copyn1 = copyn2;
          copyn2 = rem;
      }
        System.out.println(rem);
        System.out.println((num1*num2)/rem);
      
     }
    }
