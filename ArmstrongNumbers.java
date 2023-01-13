/******************************************************************************

                     Armstrong Number Using Functions

*******************************************************************************/

import java.util.*;
public class Main
{
    //Power of every number,
    int power(int x, int y){
        int pow = 1;
        for(int i = 1; i <= y; i++){
            pow = pow * x;
        }
        return pow;
    }
    //Length of Number,
    int length(int a){
        int len = 0;
		while(a>0){
		    int dig = a%10;
		    len++;
		    a/=10;
		}
	    return len;
	}
	
	//Armstrong finder,
	
	boolean armstrong(int d){
	    int temp = d;
	    int lengt = length(d);
	    int sum = 0;
 		while(d>0){
		    int dig = d%10;
		    sum = sum + power(dig, lengt);
		    d/=10;
		}
		if(temp == sum)
		    return true;

		else
		    return false;
	    
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();		
		Main Ar = new Main();
		System.out.println(Ar.armstrong(n));
	}
}
