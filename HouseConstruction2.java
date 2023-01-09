/*
House Construction 2
Given the total cost of a house, print the cost of building the foundation of the house.

The total cost of the house is split into construction, design and interior cost in the ratio of 60:20:20 (60% for construction, 20% for design and 20% for interior).

The foundation cost is equal to the construction cost added to design cost.

After that, classify the house based on its foundation cost in these tiers.

D - x <= 100
C - 100 < x <=1000
B - 1000 < x <= 10000
A - 10000 < x <= 100000
S - 100000 < x
NOTE:

Calculate construction cost and design cost separately and only consider theirs int part.

Give the integer answer only.

x% of y can be calculated as (x * y) / 100

Input Format:
The first line will contain the total cost of the house n.


*/

import java.util.*;

public class HouseConstruction2 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int cons = (60*n)/100;
		int desi = (20*n)/100;
		int x = cons + desi;

		System.out.println(x);

		if(x <= 100){
			System.out.println("D");
		}
		else if(x > 100 && x <= 1000){
			System.out.println("C");
		}
		else if(x > 1000 && x <= 10000){
			System.out.println("B");
		}
		else if(x > 10000 && x <= 100000){
			System.out.println("A");
		}
		else if(x > 100000){
			System.out.println("S");
		}
		
		
    }
}
