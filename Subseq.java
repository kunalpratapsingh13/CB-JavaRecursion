package TestCodes;

import java.util.*;
public class Subseq {

	public static int countSubseq(String str){
		if (str.length()==1){
			return 2;
		}
		return 2 * countSubseq(str.substring(1));
	}

	public static void printSubseq(String str, String runningAns) {
		if (str.length()==0) {
			System.out.print(runningAns + " ");
			return;
		}
		
		printSubseq(str.substring(1),runningAns);
		printSubseq(str.substring(1),runningAns + str.charAt(0));
	}
	
    public static void main(String args[]) {
        // Your Code Here
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	printSubseq(str,"");
    	System.out.println();
    	System.out.println(countSubseq(str));
    	
    }
}
