
class Customer{
    String name;
    int x;
    int n;
    int min;
        
    Customer(String name, int n, int x){
        this.name = name;
        this.x = x;
        this.n = n;
        this.min = n;
    }
        long minCount(){
        
            int smallest = 9;
         
            while(min != 0){
                int r = min % 10;
                smallest = Math.min(r, smallest);
                min = min / 10;
            }
            return smallest;
        }
        int firstDigit(){
            while (n >= 10){
                n /= 10;
            }
            return n;
        }
        String call(){
            int t = firstDigit();
            String s = "";
            for(int i = 1; i <= t; i++){
                s = s + x;
            }
            return s;
        }
        
        String encrypt(){
            return name + call();
        }
        
}
public class Main
{
	public static void main(String[] args) {
		Customer customer = new Customer("Doselect", 98979593, 5);
		System.out.println(customer.encrypt());
		System.out.println(customer.minCount());
	}
}
