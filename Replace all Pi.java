//Replace all occurrences of pi with 3.14
package LinkedList;
import java.util.*;

public class TestCode {
		
	    public static String replacePi(String str) {
	    	if (str.length()<=1) {
	    		return str;
	    	}
	    	
	    	if (str.charAt(0)=='p' && str.charAt(1)=='i') {
	    		return "3.14" + replacePi(str.substring(2));
	    	}
	    	
	    	return str.charAt(0) + replacePi(str.substring(1));
	    }
	    
	
		public static void main(String[]args){
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter the number of Strings to be input: ");
	    int N = sc.nextInt();
	    
	    String[] arr = new String[N+1];
	    for (int i=0;i<=N;i++) {
	    	arr[i] = sc.nextLine();
	    }
	    
	    String[] res = new String[N+1];
	    for (int i=0;i<=N;i++) {
	    	res[i] = replacePi(arr[i]);
	    }
	    
	    for(int i=0;i<=N;i++) {
	    	System.out.println(res[i]);
	    }
	      
	   }
}
