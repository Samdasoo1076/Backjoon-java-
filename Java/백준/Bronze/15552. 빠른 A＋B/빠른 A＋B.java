import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 개수 입력 받기
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 각 테스트 케이스의 입력 받기
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            // 두 수를 더한 결과 계산
            int sum = A + B;

            // 결과를 BufferedWriter를 이용하여 출력
            bw.write(Integer.toString(sum));
            bw.newLine();
        }

        bw.flush();
    }
}
