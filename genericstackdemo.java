package exceptiondemo;
import java.util.*;

public class genericstackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        genericstack<String> stack1 = new genericstack<>();
        stack1.push("newyork");
        stack1.push("london");
        stack1.push("paris");
        stack1.push("seattle");
        stack1.push("miami");
        System.out.println("\n"+(stack1)+"\n");
        
        stack1.push("hongkong");
        System.out.println("\n"+(stack1)+"\n");
       
        stack1.push("singapore");
        System.out.println("\n"+(stack1)+"\n");
        
        System.out.println("available stack size : " + stack1.getsize());
        System.out.println("current index : " + stack1.getcurrent());
        
        System.out.println("last-in object peaked : " + stack1.peak());
        System.out.println("\n"+stack1+"\n");
        
        System.out.println("last-in object popped : " + stack1.pop());
        System.out.println("\n"+stack1+"\n");
       
        System.out.println("is stack empty ? " + stack1.isEmpty()+ "\n");
       
        stack1.remove("paris");
        
        System.out.println("paris removed");
        System.out.println("\n"+stack1+"\n");     
	}
}


