/*

Hate Three
Saurav doesn't like integers that are divisible by 3 or end with the digit 3 in their decimal representation.

Saurav starts to write out positive integers which he likes:

1, 2, 4, 5, 7, 8, 10 .... Output the k-th element of this sequence.

Input Format
The first line of input integer k.

Output Format
Output the k-th element of the sequence liked by Saurav.

Example 1
Input
	
3
Output

4

*/

/******************************************************************************
      
                            Hate Three                      

*******************************************************************************/
import java.util.*;
public class HateThree
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int k = sc.nextInt();
	    int count = 0;
	    int n = 0;
	    
	    while(count<k){
	        n++;
	        System.out.println(count);
	        while(n%3==0 || n%10==3){
	            n++;
	            
	        }
	        count++;
	    }
	    System.out.println(n);
	}
}
