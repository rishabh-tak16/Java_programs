import java.util.*;

public class DequeExample{
	public static void main(String arg[]){
		Deque<String> deque=new ArrayDeque<String>();
		//deque.removeLast();
		System.out.println(deque.pollLast());
		deque.offer("arvind");
		deque.offer("vimal");
		deque.add("mukul");
		deque.offerFirst("jai");
		deque.offerLast("Hello");		

		System.out.println("After offerFirst Traversal..... ");
		for(String s:deque){
			System.out.println(s);
		}
		deque.pollLast();
		System.out.println("After pollLast() Traversal.....");
		for(String s:deque){
			System.out.println(s);
		}

	}
}