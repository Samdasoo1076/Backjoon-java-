import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
    	
    	int product = sc.nextInt();
    	int kind = sc.nextInt();
    	int a, b, sum = 0;
    	
    	for(int i = 0; i < kind; i++) {
    		 a = sc.nextInt();
    		 b = sc.nextInt();
    		 sum += a * b;
    	}
    	if(product == sum) {
			 System.out.println("Yes");
		 } else {
			 System.out.println("No");
		 }
    }	
    
}