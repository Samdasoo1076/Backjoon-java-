import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        int asc = (int) character;
        System.out.println(asc);
    }
}