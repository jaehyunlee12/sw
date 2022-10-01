package exceptiondemo;
import java.util.*;
import java.util.Arrays;

public class genericstack<T extends Object> //last-in first-out stack
{
   private final static int DEFAULT_SIZE = 5;
   private T[] array;
   private int size = 0;//current index
   public genericstack()
   {
	   array = (T[]) new Object[DEFAULT_SIZE];
   }
   public genericstack(int n)//constructor for array with size n.
   {
	   array = (T[]) new Object[n];
   }
   
   public boolean push(T o) {
	   if(size >= array.length)//if size equals to length that is the array is full, that is, no place for new object.
		   grow();
	   array[size] = o;
	   size++; 
	   return true;
   }//after push() is done, size indicates the index where the next object will be inserted.
   private void grow() {//size doubled by copying the array to the new array with double length.
	   int newsize = (size<<1);
	   array = Arrays.copyOf(array, newsize);
   }
   public T peak()//return the last-in element
   {
	   if(size < 0) return null;
	   T t = array[size-1];
	   return t;
   }
   public T pop()//pick up the last-in element and assign null(removing)
   {
	   if(size < 0) return null;
	   T t = array[size-1];
	   array[size-1] = null;
	   size--;
	   return t;
   }
   public boolean isEmpty()
   {
	   int count = 0;
	   for(int i=0;i<array.length;i++)
	   {
		   if(array[i]!=null)
			   count++;
	   }	   
	   if(count == 0) return true;
	   else return false;
   }
   public String toString()
   {
	   return "stack : " + java.util.Arrays.toString(array);
   }
   public boolean remove(T t)
   {
	   for(int i=0;i<size;i++)//once find the corresponding object with its index in array, then shift the part(i+1 ~last one) to one left.
	   {
		   T o = array[i];
		   if(o.equals(t))
		   {
			   System.arraycopy(array,i+1,array,i,size-i-1);//arraycopy(source_arr,sourcepos,dest_arr,destpos,leng)
			   return true;
		   }
	   }
	   return false;
   }
   public int getsize()
   {
	   return array.length;
   }
   public String getcurrent()
   {
	   String st = "  (0 to " + (array.length-1) + ")"; 
	   return size-1 + st ;   
   }
}

