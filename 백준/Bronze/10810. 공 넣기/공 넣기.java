import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 바구니의 개수 N과 공을 넣는 횟수 M 입력받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // 바구니 배열 생성 및 초기화
        int[] baskets = new int[N];
        
        // M번 공을 넣기
        for (int i = 0; i < M; i++) {
            // 넣는 방법 입력받기
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int ballNumber = scanner.nextInt();
            
            // 공을 넣는 과정 구현
            for (int j = start - 1; j <= end - 1; j++) {
                baskets[j] = ballNumber;
            }
        }
        
        // 바구니 상태 출력
        for (int num : baskets) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
