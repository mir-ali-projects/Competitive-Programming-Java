import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

     int n;
     n = scn.nextInt();
    int i,j;
    for(i=n;i>=1;i--)
    {
        for(j=1;j<=i;j++)
     {
        System.out.print("*\t");
     }
      System.out.print("\n");
    }

    }
}
