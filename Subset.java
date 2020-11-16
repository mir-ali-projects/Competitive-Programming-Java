import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n1,i;
	    Scanner sc = new Scanner(System.in);
	    n1 =  sc.nextInt();
	    int []arr = new int[n1];
	    for(i=0;i<arr.length;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    int  k = (int)Math.pow(2,arr.length);
	    for(int j=0;j<k;j++)
	    { 
	       String str="";
	       int temp = j;
	     	for(int l=arr.length-1;l>=0;l--)
	        {
	              int m = temp%2;
	              temp = temp/2; 

	           if(m==0)
	           {
	               str =  "-	"+ str ;
	           }
	           else
	           {
	               str = arr[l] + "	" + str;
	           }
	        }
	        System.out.println(str);
	    }
	}
}
