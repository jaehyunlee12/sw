package exceptiondemo;
import java.util.*;

public class assertdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
		  try {
			  System.out.println("Enter a number between 0 and 10 : ");
			  int num = sc.nextInt();
			  assert num>=0&&num<=10 :"The entered number is out of range";
			  System.out.println(num);	  
		  }
		  catch(InputMismatchException ex) {
			  System.out.println("invalid data, Integer type required.");
	        	sc.nextLine();
		  }
		}
	}
}
