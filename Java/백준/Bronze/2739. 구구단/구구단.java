import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int two = Integer.parseInt(br.readLine());
    	for(int i = 1; i <= 9; i++) {
    		System.out.println(two + " * " + i + " = " + two * i);
    	}
    
    }	
    
}