import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    int n1,k;
	    Scanner sc = new Scanner(System.in);
	    n1 = sc.nextInt();
	    int []arr = new int[n1];
	    for(k=0;k<n1;k++)
	    {
	        arr[k] = sc.nextInt();
	    }
	    int ceil = 0 , floor =0;
	    int  i = 0 ;
	    int j = arr.length - 1;
	   int high=-1;
	    int low=-1;
	    int query;
	    query = sc.nextInt();
	    while(i<=j)
	    {
	       int mid = i + (j-i)/2;
	        if(query<arr[mid])
	        {
	            j = mid - 1;
	        }
	        else if(query>arr[mid])
	        {
	            i = mid + 1;
	        }
	        else
	        {
	            high = mid;
	            j = mid - 1;
	        }
	    }
	    System.out.println(high);
 i = 0 ;
 j = arr.length - 1;
 low=-1;
	       while(i<=j)
	    {
	       int mid = i + (j-i)/2;
	        if(query<arr[mid])
	        {
	            j = mid - 1;
	        }
	        else if(query>arr[mid])
	        {
	            i = mid + 1;
	        }
	        else
	        {
	            low = mid;
	            i = mid + 1;
	        }
	    }
	    
	    
	    System.out.println(low);
	    
	}
}
