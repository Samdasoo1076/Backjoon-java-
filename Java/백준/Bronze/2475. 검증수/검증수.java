import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] ARR = new int[5];
        
     
        for(int i = 0; i < 5; i++) {
            ARR[i] = sc.nextInt();
        }
        int sqeeuze = 0;
        for(int i = 0; i < 5; i++) {
        	sqeeuze += ARR[i] * ARR[i];
        }
        int result = sqeeuze % 10;
        System.out.println(result);
    }
}
