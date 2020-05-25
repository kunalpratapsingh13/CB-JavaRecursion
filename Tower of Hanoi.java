//Tower of Hanoi problem

import java.util.*;
public class Main {

	public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
    { 
        if (n == 1) 
        { 
            System.out.println("Moving ring 1 from " +  from_rod + " to " + to_rod); 
            return; 
        } 
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
        System.out.println("Moving ring " + n + " from " +  from_rod + " to " + to_rod); 
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
    } 

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		towerOfHanoi(n, 'A', 'B', 'C');

    }
}
