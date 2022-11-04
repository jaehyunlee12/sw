package exceptiondemo;
import java.util.*;
import java.text.*;
public class numberfrmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale uk = new Locale("en","UK");
        Locale us = new Locale("en","US");
       
		double d = 12345.678;
		
		System.out.println("format number : " + d);
		NumberFormat nf = NumberFormat.getInstance(uk);
		nf.setMinimumFractionDigits(2);
		System.out.println("format number in the UK locale : " + nf.format(d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(us);
		System.out.println("format number in the US currency : " + nf1.format(d));
		
		NumberFormat nf2 = NumberFormat.getInstance();
		try {
			Number num = nf2.parse("12,345.678");
			System.out.println("parsed number : " + num);
		}
		catch(java.text.ParseException ex) {
			System.out.println("parse failed");
		}
	}
}
