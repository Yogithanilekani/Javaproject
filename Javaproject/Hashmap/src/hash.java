import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hash {
	public static void main(String[] args) {
//		iterate through Hashmap entryset using iterator
		HashMap<Integer,String> courseMap = new HashMap<>();
		courseMap.put(1, "db");
		courseMap.put(2, "dynaic");
		courseMap.put(4, "CS");
		courseMap.put(4, "PYTHON");
		courseMap.put(5, "DJANGO");
		System.out.println("easy way");
//		easy way
		for(Map.Entry<Integer, String> entr: courseMap.entrySet()) {
			System.out.println(entr.getValue());
		}
		
		Iterator<Entry<Integer, String>>iterator= courseMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> ent = iterator.next();
			System.out.println(ent.getKey()+"->"+ent.getValue());
		}
//		iterate using keyset
		System.out.println("iterate using keyset");
		Iterator<Integer> itr=courseMap.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key+"->"+courseMap.get(key));		
		}
//		using for each
		System.out.println("iterate using foreach");

		for(Map.Entry<Integer,String> ent: courseMap.entrySet()) {
			System.out.println(ent.getKey()+"->"+ent.getValue());
		}
//		using lambda expression
		System.out.println("iterate using lambda");
		courseMap.forEach((key,value)->{System.out.println(key+"->"+value);});
		
// iterate using Stream api	
		System.out.println("iterate using Stream api	");
		courseMap.entrySet().forEach((e)->{System.out.println(e.getKey()+"->"+e.getValue());});
	}

}
