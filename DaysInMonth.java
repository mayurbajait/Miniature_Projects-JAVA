import java.util.*;

public class DaysInMonth {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
			System.out.println(31);
		}
		else if(m==4 || m==6 || m==9 || m==11){
			System.out.println(30);
		}
		else if(m==2){
			System.out.println(28);			
		}
		else{
			System.out.println("Invalid Month!");
		}
		
    }
}
