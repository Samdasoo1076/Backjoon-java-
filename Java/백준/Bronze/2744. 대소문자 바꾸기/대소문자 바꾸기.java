import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	 
        String input = sc.nextLine();
        StringBuilder convertedString = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            int asc = (int) c;  
            
            if (asc >= 65 && asc < 90) {
                asc += 32;
            } else if (asc >= 97 && asc < 122) {
                asc -= 32;
            }
            
            char newChar = (char) asc;
            
            convertedString.append(newChar);
        }
        
        // 변환된 문자열 출력
        System.out.println(convertedString.toString());
        
        sc.close();
    }
}
