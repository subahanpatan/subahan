package collectionsss;
import java.util.*;
public class AryLit {

	public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
			List<String> lk = new LinkedList<String>();
			Vector<Integer> v1 = new Vector<Integer>();
			Stack<String> s = new Stack<String>();
			list.add("mahendra");
			list.add("akhil");
			list.add("avinash");
			lk.add("manohar");
			lk.add("rajiv");
			v1.add(12345);
			s.push("no name");
			s.push("my name");
			s.push("item");
			s.pop();
			Iterator<String> itr=list.iterator();
			Iterator<String> n = lk.iterator();
			Iterator n1 = v1.iterator();
			Iterator nm = s.iterator();
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}
			while(n.hasNext()){  
				System.out.println(n.next());  
				}
			while(n1.hasNext()){  
				System.out.println(n1.next());  
				}
			while(nm.hasNext()){  
				System.out.println(nm.next());  
				}
	}

}
