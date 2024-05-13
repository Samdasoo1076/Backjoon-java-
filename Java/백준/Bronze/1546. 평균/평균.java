import java.util.*;

class Main {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = sc.nextInt();        
        	}
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] > max ) {
        		max = arr[i];
        	}
        }
        
        double[] scores = new double[N];
        for(int i = 0; i < N; i++) {
        	scores[i] = (double) arr[i] / max * 100;
        }
        
        double sum = 0;
        for(int i = 0; i < N; i++) {
        	sum += scores[i];
        }
        double total = sum / N;
        System.out.print(total);
    }
}
 