import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       

        // 첫 번째 부분 (N * 5 개의 '@')
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5 * N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        
        // 두 번째 부분 (N 개의 '@')
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        
        // 세 번째 부분 (N * 5 개의 '@')
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5 * N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        
        // 네 번째 부분 (N 개의 '@')
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        
        // 다섯 번째 부분 (N 개의 '@')
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}