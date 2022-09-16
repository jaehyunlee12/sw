package exceptiondemo;
import java.util.*;
import java.util.Scanner;
public class exceptiondemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        int c = 0;
        
        while(c <= 1) {
          try {
        	System.out.println("Enter integer : ");
        	int num = sc.nextInt();
        	arr[c] = num;
        	c++;
          }
          catch(InputMismatchException ex) {
        	System.out.println("invalid data, Integer type required.");
        	sc.nextLine();
          }
        }
        System.out.println("the sum : " + (arr[0] + arr[1]));
    }
}
