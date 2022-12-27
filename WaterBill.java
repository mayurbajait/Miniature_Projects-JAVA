import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
	    int w=sc.nextInt();
		int bill = 0;
		if(w<=100){
			bill = w*15;
			System.out.println(bill);
		}
		else if(w>100 && w<=200){
			int w1 = w-100;
			bill = 100*15 + w1*14;
			System.out.println(bill);
		}
		else if(w>200){ 
			int w2 = w-200;
			bill = 100*15 + 100*14 + w2*12;
			System.out.println(bill);
		}
	}
}
