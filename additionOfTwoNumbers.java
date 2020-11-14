import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n1,i,j,k;
            n1 = sc.nextInt();
            int[] arr1 = new int[n1];

            for( i=0;i<n1;i++)
            {
                arr1[i] = sc.nextInt();
            }
            int n2;
            n2 = sc.nextInt();
            int[] arr2 = new int[n2];
            for(j=0;j<n2;j++)
            {
                arr2[j] = sc.nextInt();
            }
            int arr3[] = new int[n1>=n2 ? n1 : n2];
            i = arr1.length - 1;
            j = arr2.length - 1;
            k = arr3.length - 1;
            int c = 0,d;
            while(k>=0)
            {
                d=c;
                if(i>=0)
                {
                   d = d + arr1[i];
                }
                if(j>=0)
                {
                    d = d + arr2[j];
                }
             
                c = d/10;
                d = d%10;
                arr3[k] = d;
                i--;
                j--;
                k--;
            }
            if(c!=0)
            {
                System.out.print(c);
            }
            for(int val:arr3)
            {
                System.out.print(val);
            }
            
	}
}
