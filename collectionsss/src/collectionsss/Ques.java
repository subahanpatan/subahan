package collectionsss;
import java.util.*; 
public class Ques {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue=new PriorityQueue<>(); 
		Deque<String> deque = new ArrayDeque<String>();  
		HashSet<String> set=new HashSet<String>();  
		LinkedHashSet<String> set1=new LinkedHashSet<String>();  
		TreeSet<String> set2=new TreeSet<String>();  
		deque.add("Amit Sharma"); 
		deque.add("Vijay Raj");
		deque.add("JaiShankar");
		deque.add("Raj");
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi"); 
		set.add("");
		set1.add("Ravi");  
		set1.add("Vijay");  
		set1.add("Ravi"); 
		set1.add("");
		set2.add("Ravi");  
		set2.add("Vijay");  
		set2.add("Ravi");  
		set2.add("Ajay");  
		queue.add(5);
		queue.add(8);
		queue.add(7);
		queue.add(3);
		queue.add(2);
		queue.add(5);
		
		deque.peek();
		Iterator itr=deque.iterator(); 
		
		while(itr.hasNext()){
		System.out.println(itr.next());
		}queue
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println("\n");
		for(String str1 : set1) {
			System.out.println(str1);
		}
		System.out.println(set2);
		System.out.println(queue);
	}

}
