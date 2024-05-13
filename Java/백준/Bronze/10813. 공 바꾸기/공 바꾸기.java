import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int i, j, temp = 0;
        
        int arr[] = new int[N];
        for(int a = 0; a < arr.length; a++) {
        	arr[a] = a + 1;
        }
        for(int b = 0; b < M; b++) {
        	i = sc.nextInt() - 1;
        	j = sc.nextInt() - 1;
        	temp = arr[i];
        	arr[i] = arr[j];
        	
        	arr[j] = temp;
        }
        sc.close();
        for(int c = 0; c < arr.length; c++) {
        	System.out.print(arr[c] + " ");
        }
    }
}
