import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x =  Integer.parseInt(br.readLine());
        int y =  Integer.parseInt(br.readLine());
        int n = 0;
        if(x >= 1 && y >= 1) {
        	n = 1;
        } else if (x <= -1 && y >= 1) {
        	n = 2;
        } else if (x <= -1 && y <= 1) {
        	n = 3;
        } else if (x >= 1 && y <= 1) {
        	n = 4;
        }
        System.out.println(n);
    }
    
}