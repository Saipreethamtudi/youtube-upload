import java.util.*;
import java.util.Scanner;

public class allvowelscount {

	public static void main(String[] args) {
		System.out.println("enter the string");
         Scanner S = new Scanner(System.in);
      
         String value = S.nextLine();
         
         counting(value);
         //Inser neew values       
	}
         
         
         
         
         public static void counting(String value) {
        	 
           value = value.toLowerCase();
           int count = 0;
           int i = 0;
           for (i = 0 ; i < value.length(); i++) {
        	   char ch = value.charAt(i);
        	   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        		   count++;
        	   }
           }
          System.out.println(count);
	}
	
	

}
