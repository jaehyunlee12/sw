package exceptiondemo;
import java.util.*;
import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Scanner;
public class readingpg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String filename = "airline.txt";     
        TreeSet<String> ts = new TreeSet<String>(new stComparator());//set has no duplicate,sorting by stcomparator
        
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while(input.hasNext()) //true if there's a word to be read
        {
        	String line = input.next(); //read the word and put that in string variable
        	ts.add(line);
        }
        System.out.println(ts);
	}
	static class stComparator implements Comparator<String>
	{
		public int compare(String str1, String str2)
		{
				return str1.compareTo(str2);//if str1>str2 : +, str1<str2 : - => String ascending order
			
		}
	}
}
