package exceptiondemo;
import java.io.*;
import java.net.*;



public class BMIclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket("127.0.0.1",8010);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
	        BufferedReader networkin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        BufferedReader userin = new BufferedReader(new InputStreamReader(System.in));
	        while(true)
	        {
	        	System.out.println("weight input[kg]  (input 0 to end) : ");
	        	double w = Double.parseDouble(userin.readLine());
	        	if(w==0)
	        	{
	        		break;
	        	}
	        	out.println(w);
	        	out.flush();
	        	System.out.println("height input[m] : ");
	        	double h = Double.parseDouble(userin.readLine());
	        	out.println(h);
	        	out.flush();
	        	System.out.println(networkin.readLine());
	        	
	        }
	        System.out.println("\n end");
	        networkin.close();
	        out.close();
	        socket.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
