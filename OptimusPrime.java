/******************************************************************************
                     
                           Optimus Prime

Given an integer n, print all prime numbers between 1 and n (both inclusive).

Example:
If n = 8, your program should output all prime numbers between 1 and 8.
Thus, it should output:
2
3
5
7
                     
*******************************************************************************/

import java.util.*;

public class OptimusPrime {
	public static boolean isPrime(int n){
		int count = 0;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
			if(isPrime(i) == true){
				System.out.println(i);
			}
        }
      }
    
}
