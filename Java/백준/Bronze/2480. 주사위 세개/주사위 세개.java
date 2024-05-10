import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
       int prize = 0;
      if(A == B && B == C) { 
    	  prize = 10000 + A * 1000;
      } 
      else if (A == B || B == C || A == C) {
    	if(A == B) {
    		prize = 1000 + A * 100;
    	} 
    	else if(B == C) {
    		prize = 1000 + B * 100;
    	} 
    	else {
    		prize = 1000 + A * 100;
    	}
      }
      else {
    	  int max = A > B ? (A > C ? A : C) : (B > C ? B : C);
    	  prize = max * 100;
      }
      
      System.out.println(prize);
    }	
    
}