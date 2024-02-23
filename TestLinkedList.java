import java.util.*;

public class TestLinkedList{
	public static void main(String args[]){
		Deque<String> a1=new LinkedList<String>(); 
		a1.add("Ravi"); //Adding object in arraylist
		a1.add("Vijay");
		a1.add("Ravi");
		a1.add("Ajay");
		a1.add("Ravi");
		//traversing element
		Iterator<String> itr=a1.iterator(); //iterator method
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
} 