import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int caseCount = sc.nextInt();
        int[] sizes = new int[caseCount];
        
        for (int i = 0; i < caseCount; i++) {
            sizes[i] = sc.nextInt();
        }
       
        for (int i = 0; i < caseCount; i++) {
            for (int j = 0; j < sizes[i]; j++) {
                System.out.print("=");
            }
            System.out.println();  
        }  
        sc.close();
    }
}