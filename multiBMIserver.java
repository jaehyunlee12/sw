package exceptiondemo;
import java.io.*;
import java.net.*;



public class multiBMIserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 1;
        try {
        	ServerSocket s = new ServerSocket(8010);
        	while(true)
        	{
        		Socket incoming = s.accept();
        		System.out.println(i + " client");
        		new multihandler(incoming,i).start();
        		i++;
        	}

        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}
}


class multihandler extends Thread
{
	private Socket incoming;
	private int counter;
	public multihandler(Socket i, int c)
	{
	   incoming = i;
	   counter = c;
	}
	public void run()
	{
    	
        try {
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
        catch(Exception e) {System.out.println(e);}
	}
}