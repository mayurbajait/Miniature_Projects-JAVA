/*
Grading System

You are given marks of a student as input. Display a correct message based on the following rules:

for marks above 90, print "Excellent".
for marks above 80 and less than equal to 90, print "Good"
for marks above 70 and less than equal to 80, print "Fair".
for marks above 60 and less than equal to 70, print "Meets Expectations".
for marks below 60, print "Below Expectations".


You have to complete grade function which contains integer N as input and return string answer as output
*/


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        grade(n);
		sc.close();
    }
	static void grade(int n){
        if(n>90){
			System.out.println("Excellent");
		}
		else if(n>80 && n<=90){
			System.out.println("Good");			
		}
		else if(n>70 && n<=80){
			System.out.println("Fair");			
		}
		else if(n>60 && n<=70){
			System.out.println("Meets Expectations");			
		}
		else if(n<=60){
        	System.out.println("Below Expectations");			
		}
    }
}
