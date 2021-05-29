import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        printPermutations(str, "");
    }
    public static void printPermutations(String query , String final_string)
    {
        if(query.length()==0)
        {
            System.out.println(final_string);
            return;
        }
        for(int i=0;i<query.length();i++)
        {
            char ch = query.charAt(i);
            String rest_of_query = query.substring(0,i) + query.substring(i + 1);
            printPermutations(rest_of_query , final_string + ch);
        }
    }

}


                        
                        
