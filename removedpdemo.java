package exceptiondemo;
import java.util.ArrayList;

public class removedpdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(40);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);
        list.add(14);
        System.out.println(list + "\n");
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println(newList);
	}
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
	{
		ArrayList<E> list1 = list;
		for(int i=0;i < list.size();i++)//comparing two elements for every possible combination.
		{
			for(int j=i+1;j < list.size();j++)
			{
				if((list1.get(j)).equals(list1.get(i)))
					list1.remove(i);
			}
		}
		return list1;
	}
}
