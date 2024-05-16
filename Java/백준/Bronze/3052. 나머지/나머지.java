import java.util.*;
class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		
    	for(int i = 0; i < 10; i++) {
    		int num = sc.nextInt();
    		numbers[i] = num % 42;
    	}
    	
    	Arrays.sort(numbers);
    	
    	int unique = 1;
    	for(int i = 1; i < 10; i++) {
    		if(numbers[i] != numbers[i - 1]) {
    			unique++;
    		}
    	}
    	System.out.println(unique);
    }
}
 
