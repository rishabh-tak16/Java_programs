import java.util.*;

public class TestTreeSet{
	public static void main(String args[]){
		Set<String> treeSet=new LinkedHashSet<String>(); //TreeSet //
		treeSet.add("Ravi"); //Adding object in arraylist
		treeSet.add("Vijay");
		treeSet.add("Ravi");
		treeSet.add("Ajay");
		treeSet.add("Ravi");
		//traversing element
		Iterator<String> itr=treeSet.iterator(); //iterator method
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
} 