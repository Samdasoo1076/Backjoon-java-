import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정수의 개수 N 입력 받기
        int N = Integer.parseInt(br.readLine());

        // 최솟값과 최댓값을 저장할 변수 초기화
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // N개의 정수를 입력 받고, 최솟값과 최댓값 갱신
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // 결과 출력
        System.out.println(min + " " + max);

        br.close();
    }
}
