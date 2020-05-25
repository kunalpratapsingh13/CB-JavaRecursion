//Given a floor of size n x m. Find the number of ways to tile the floor with tiles of size 1 x m .
//A tile can either be placed horizontally or vertically.

import java.util.*;
public class Main {

	public static int numOfWays(int n, int m){
		if (n<=0 || m<=0){
			return 0;
		}

		if (n>=1 && n<m){
			return 1;
		}

		if (n==m){
			return 2;
		}

		return numOfWays(n-1,m) + numOfWays(n-m,m);
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [][] arr = new int[t][2];

		for (int i=0;i<t;i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		for (int i=0;i<t;i++){
			System.out.println(numOfWays(arr[i][0], arr[i][1]));
		}
    }
}
