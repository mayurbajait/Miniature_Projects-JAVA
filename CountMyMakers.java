/*
Count My Makers
Number N wants to know how many of the 4 available makers were used to create it. Given a number N, followed by 4 more numbers a, b, c and d, you need to return the number of numbers among a, b, c and d which make N by taking their product. You can use each number only once for the product. If there exists multiple answers, return the smallest value possible.

Input Format
Five space separated integers N, a, b, c and d

Output Format
Single integer representing answer

Example 1
Input

24 2 3 4 5
Output

3
Explanation

2*3*4=24
3 makers were used to make 24
Example 2
Input

32 2 16 32 48
Output

1
Explanation

2*16=32
There are two possible sets of makers that can be used for answers (2, 16), (32). Since, we need the

*/


import java.io.*;
import java.util.*;
 
public class CountMyMakers {
 
    public static int solve(int n, int[] arr) {
        int total = 1;
        for (int i = 0; i < 4; i++)
            total *= arr[i];
        for (int i = 0; i < 4; i++) {
            if (n == arr[i])
                return 1;
 
        }
 
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (n == arr[i] * arr[j])
                    return 2;
            }
        }
 
        for (int i = 0; i < 4; i++) {
            if (n == (total / arr[i]))
                return 3;
        }
 
        // for (int i = 0; i < 4; i++) {
        // for (int j = i + 1; j < 4; j++) {
        // for (int k = j + 1; k < 4; k++) {
        // if (n == arr[i] * arr[j] * arr[j])
        // return 3;
        // }
        // }
        // }
 
        return 4;
 
    }
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[4];
 
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
 
        int ans = solve(n, arr);
        System.out.println(ans);
    }
}
