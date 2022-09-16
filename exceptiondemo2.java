package exceptiondemo;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class exceptiondemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();
        int[] arr = new int[100];
        for(int i=0;i<100;i++)
        {
        	int x = generator.nextInt();
        	arr[i] = x;
        }
        while(true)
        {
        	int c = 0;
        	try {
            	System.out.println("Enter the index of the array : ");
            	int a = sc.nextInt();
            	System.out.println("Corresponding value => " + arr[a]);
            	c++;
            }
            catch(ArrayIndexOutOfBoundsException ex) {
            	System.out.println("Out of Bounds Exception");
            	sc.nextLine();
            }    
        	if(c!=0)
        		break;
        }
	}
}