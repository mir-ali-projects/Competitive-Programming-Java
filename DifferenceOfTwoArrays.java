import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int i,j,k,n1,n2;
		Scanner scn = new Scanner(System.in);
		n1 = scn.nextInt();
		int a1[] = new int[n1];
			for(i=0;i<a1.length;i++)
	    {
	        a1[i] = scn.nextInt();
	    }
		n2 = scn.nextInt();
		int a2[] = new int[n2];
	
	    for(i=0;i<a2.length;i++)
	    {
	        a2[i] = scn.nextInt();
	    }
	    int diff[] = new int[n2];
	    i = a1.length - 1;
	    j = a2.length - 1;
	    k = diff.length - 1;
	    int c = 0;
	    while(k>=0)
	    {
	        int d = 0;
	        int a1v = i>=0 ? a1[i] : 0;
	        if((a2[j]+c) >= a1v)
	        {
	           
	            d = (a2[j] + c) - a1v;
	            c = 0;
	        }
	        else{
	            d = (a2[j] + c + 10) - a1v;
	            c = -1;
	        }
	        diff[k] = d;
	        i--;
	        j--;
	        k--;
	    }
	    int idx = 0;
	    while(idx<diff.length)
	    {
	        if(diff[idx]==0)
	        {
                idx++;	            
	        }
	        else
	        {
	            break;
	        }
	    }
	    while(idx<diff.length)
	    {
	        System.out.println(diff[idx]);
	        idx++;
	    }
	}
}
