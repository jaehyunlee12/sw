package exceptiondemo;
import java.io.*;
import java.net.*;


public class BMIserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	 ServerSocket s = new ServerSocket(8002);
	         Socket incoming = s.accept( );
	         BufferedReader in = new BufferedReader
	            (new InputStreamReader(incoming.getInputStream()));
	         PrintWriter out = new PrintWriter
	            (incoming.getOutputStream(), true /* autoFlush */);
	         while(true)
	         {
	        	 double w = Double.parseDouble(in.readLine());
	        	 if(w == 0) break;
	        	 double h = Double.parseDouble(in.readLine());
	        	 double bmi = w/(h*h);
	        	 System.out.println(bmi + " in server");
	        	 out.println("your bmi is " + bmi);
	         }
             incoming.close();
        }
        catch(Exception e) { System.out.println(e);}
	}
}
