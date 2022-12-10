package exceptiondemo;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] list = {3,4,5,1,-3,-5,-1};
        System.out.println(linearSearch(list,2));
        System.out.println(linearSearch(list,5));
        
	}

	
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
	{
	   for(int i=0;i<list.length;i++)
	   {
		   if(list[i].compareTo(key)==0)//find the index of elements that has value of key
		   {
		      return i;
		   }
	   }
	   return -1;
	}
}
