/*
Given a number N and a digit D. Write a program to find how many times the digit D appears in the number N.

Input Format
A single line containing the integers N and D.

Output Format
Return a single integer representing the number of times the digit D appears in the number N.

Example 1
Input

1111221 1
Output

5

*/

import java.util.*;

public class CountFrequencyNumber {

	static int countFreqDigit(int n,int d)
    {
        int c = 0;
		while(n>0){
			int dig = n%10;
			if(dig == d){
				c++;
			}
			n/=10;
		}
			return c;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int d= sc.nextInt();
        System.out.println(countFreqDigit(n,d));
    }
}
