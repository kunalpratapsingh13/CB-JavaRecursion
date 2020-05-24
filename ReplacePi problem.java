//Replace all occurrences of pi with 3.14

import java.util.*;
public class Main {

	public static String replacePi(String str){
		if (str.length()<=2){
			return str;
		}

		if (str.charAt(0)=='p' && str.charAt(1)=='i'){
			return "3.14" + replacePi(str.substring(2));
		}

		return str.charAt(0) + replacePi(str.substring(1));
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String [] arr = new String[T];
		for (int i=0;i<T;i++){
			arr[i] = sc.next();
		}

		for(int i=0;i<T;i++){
			System.out.println(replacePi(arr[i]));
		}
    }
}
