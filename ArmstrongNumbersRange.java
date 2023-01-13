/******************************************************************************

                            Armstrong Numbers in Range
                            
*******************************************************************************/

import java.util.*;
public class ArmstrongNumbersRange
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
	
	//Armstrong finding,
	
	void armstrong(int c, int d){
 		
 		for(int i = c; i<=d ; i++){
 		    int temp = i;
 		    int lengt = length(temp);
	        int sum = 0;
 		  
 		    while(temp>0){
        	    int dig = temp%10;
        	    sum = sum + power(dig, lengt);
        	    temp/=10;
 		    }
    		if(i == sum){
    		    System.out.print(sum+" ");
    		}
 		}
  	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 1;
		int m = 160;
		
		ArmstrongNumbersRange Ar = new ArmstrongNumbersRange();

		Ar.armstrong(n,m);
	}
}
