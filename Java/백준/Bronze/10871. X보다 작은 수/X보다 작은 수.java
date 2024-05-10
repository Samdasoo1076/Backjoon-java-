import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int X = sc.nextInt();

       int arr[] = new int[N]; // N 값 받아서 와서 배열 길이 N으로 설정
       
       for(int i = 0; i < N; i++) {
    	   arr[i] = sc.nextInt(); //반복문 돌며 값 집어넣기
       }
     
       sc.close(); //배열 다 채워줬으면 인풋 종료
       
       for(int i = 0; i < N; i++) { 
    	   if(arr[i] < X) { // 배열 N까지 돌며 X값 보다 낮은 값 걸러내기 
    		   System.out.print(arr[i] + " "); // 한 줄에 띄어쓰고 값 띄우기
    	   }
       }
      
    }
}
