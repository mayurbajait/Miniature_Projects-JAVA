import java.util.*;

public class ArrayBuildings {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      max = Math.max(max, arr[i]);
    }
    sc.close();
    barGraph(arr, n);
  }

  public static void barGraph(int[] arr, int n) {
	    int max = Integer.MIN_VALUE;
	    for (int i = 0; i < n; i++) {
	      max = Math.max(max, arr[i]);
	    }

	   for(int i = max; i > 0; i--){
			for(int j = 0; j < n; j++){
				if(arr[j] >= i){
					System.out.print("*\t");		
				}
				else{
					System.out.print("\t");
				}
			}
		   System.out.println();
		   
	   }
  }
}
