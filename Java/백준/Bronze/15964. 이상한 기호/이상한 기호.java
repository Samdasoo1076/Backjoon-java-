import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수 A와 B 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // A＠B 계산하기
        int result = (A + B) * (A - B);
        
        // 결과 출력하기
        System.out.println(result);
        
        scanner.close();
    }
}
