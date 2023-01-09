/*
Lucky Unlucky
You are given two integers a and b. You need to perform the following operations.

If both integer are even, print `lucky`.
Else print `unlucky`.
Input Format
The first line of input contains 2 space seperated integer a and b.

Output Format
Output lucky if both the numbers are even, else print unlucky.
*/

import java.util.*;

public class LuckyUnlucky {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String ans=solve(a,b);
        System.out.println(ans);

		sc.close();
    }
	static String solve(int a, int b){

		if(a%2==0 && b%2==0){
			return "lucky";
		}
		else{
			return "unlucky";
		}
    }
}
