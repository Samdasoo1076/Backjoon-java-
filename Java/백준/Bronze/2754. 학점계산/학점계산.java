import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	 
    	 // 등급 입력 받기
        String grade = sc.nextLine();
        
        // 점수를 저장할 변수
        double score = 0.0;
        
        // if-else 문을 사용하여 점수 결정
        if (grade.equals("A+")) {
            score = 4.3;
        } else if (grade.equals("A0")) {
            score = 4.0;
        } else if (grade.equals("A-")) {
            score = 3.7;
        } else if (grade.equals("B+")) {
            score = 3.3;
        } else if (grade.equals("B0")) {
            score = 3.0;
        } else if (grade.equals("B-")) {
            score = 2.7;
        } else if (grade.equals("C+")) {
            score = 2.3;
        } else if (grade.equals("C0")) {
            score = 2.0;
        } else if (grade.equals("C-")) {
            score = 1.7;
        } else if (grade.equals("D+")) {
            score = 1.3;
        } else if (grade.equals("D0")) {
            score = 1.0;
        } else if (grade.equals("D-")) {
            score = 0.7;
        } else if (grade.equals("F")) {
            score = 0.0;
        }

        System.out.println(score);
    }
}