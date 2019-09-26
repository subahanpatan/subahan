package collectionsss;
import java.util.NavigableMap;
import java.util.TreeMap;
public class Exp3 {

	public static void main(String[] args) {
		NavigableMap<String, Integer> ob = new TreeMap<String, Integer>();
		NavigableMap<String, Integer> treemap = new TreeMap<String, Integer>();  
		ob.put("one", 1);
		ob.put("two", 2);
		ob.put("three", 3);
		ob.put("four", 4);
		ob.put("five", 5);
		ob.put("three", 3);
		treemap.put("one", 1);
		treemap.put("two", 2);
		treemap.put("three", 3);
		treemap.put("four", 4);
		System.out.println("the ceiling entry for 4 is given as :" +ob.ceilingEntry("four"));
		System.out.println("the ceiling entry for 3 is given as :" +ob.ceilingKey("three"));
		System.out.println("the ceiling key entry for 3 is given as :" +treemap.ceilingKey("three"));
		System.out.println("The navigable values after using descendingKeySet() method is given as :" +ob.descendingKeySet());
		System.out.println("The navigable values after using descendingMap() method is given as :" +treemap.descendingMap());
	}

}
