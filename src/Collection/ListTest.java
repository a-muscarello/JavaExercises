package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;

public class ListTest {

	
	public static void main(String[] args) {
		List listA = new ArrayList();
//		List<String> listA = new ArrayLis<>t(); => forcing my list to only accept a certain data type - i.e. string. This is known as generic.
		
//		Student student = new Student();
//		int[] test2 = new int[] {1,2,3};
		
//		listA.add(student);
		listA.add("mango");
		listA.add("sun");
		listA.add(12);
		listA.add('c');
		listA.add(true);
		listA.add(listA);
//		listA.add(new int[] {3,4,5}); => does not print

//		listA.contains(student);
//		listA.lastIndexOf(student);
		
	//(1 = indicates where you want to add, "banana" = what we want to add)
		listA.add(1, "banana");
		
		listA.remove("sun");
		
		boolean test = listA.contains(13);
		
		System.out.println(listA);
		System.out.println(test);
		
		
		List listB = new ArrayList<>(listA);
		
		listB.add(5);
		listB.add("car");
		
		System.out.println(listB);
		
		
		List listC = new ArrayList();
		
		listC.add("melon");
		listC.add("apple");
		listC.add("pear");
		
		listC.addAll(listB);
		System.out.println(listC);
		
		//accessing the index location of element
		System.out.println(listC.get(3));
		
		// changing the index element 
		listC.set(1,  "berry");
		System.out.println(listC);
		
		// removing last index
		System.out.println(listC.get(listC.size()-1));
		
		// remove by index or by element itself
		listC.remove(2);
		listC.remove("berry");
		System.out.println(listC);
		
		// removeIf (predicate) only works if same data type.
//		listC.removeIf(new Predicate<String>() {
//			public boolean test (String o) {
//				return o.startsWith("b");
//			}
//		});
//		System.out.println(listC);
		
		
		String b = new String("bafafsflsal");
		
		System.out.println(b);
		System.out.println(b.startsWith("b"));
		
		
		// for (String x : listC) => string x inside listC
		
		// lambda expression -> for the 'for each' method
		listC.forEach(element -> {
			System.out.println(element);
		});
	
		
		// broader scope using 'List'
//		List linkedList = new LinkedList();
		
		// smaller / more limited scope using 'LinkedList"
		LinkedList linkedList1 = new LinkedList();
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.addAll(listC);
		System.out.println(linkedList);
		
		
		linkedList.remove(3);
		linkedList.addFirst("lychee");
//		(LinkedList (linkedList.addFirst("lychee"));
	
		System.out.println(linkedList);
		
		LinkedList employees = new LinkedList();
		employees.add("John");
        employees.add("David");
        employees.add("Lara");
        employees.add("Chris");
        employees.add("Steve");
        employees.add("David");
        employees.remove("David");
		
        System.out.println(employees.indexOf("David"));
        System.out.println(employees.lastIndexOf("David"));
       
        System.out.println(employees);
        
        
        // structure for creating maps
        Map<Integer, String> map = new HashMap<>();
        
//     Map map1 = new HashMap<>(); => no restriction like 'string, integer
        
        Map map2 =  new HashMap<>();
        
        map2.put(1, "max");
        map2.put(2, "lee");
        map2.put(1, "jo");
        map2.put(3, "jack");
        map2.put(4, "tom");
        
        Map<Integer, String> map3 = new HashMap<>();
        map3.put(2, "sam");

        System.out.println(map);
        System.out.println(map2);
        System.out.println(map3);
        
        //copying/duplicating map3 into map4
        Map<Integer, String> map4 = new HashMap<>(map3);
        System.out.println(map4);
        
        System.out.println(map3);
        map2.putAll(map);
        System.out.println(map3);
        
        String name = map.get(2);
     
        System.out.println(name);
        
        
        // key set will return number (1, 2, 3) etc.  'SET' = the word guarantees uniqueness
        Set<Integer> keys = map2.keySet();
       
        System.out.println(keys);
        
    
        
        Collection<String> values = map2.values();
        
        System.out.println(values);
        
        
        for (Map.Entry entry : map3.entrySet()) {
        	  System.out.println( entry.getKey() + " -> " + entry.getValue() );
        
        	  
        	  Map<Integer, String> treeMap = new TreeMap<>();

        	  treeMap.putAll(map2);
        	     
        	  treeMap.forEach((k,v) -> System.out.println("key: " + k + ", value: " + v));
        	  
        	  
        	  
//        	  Collections.sort();
        	  
        	  
        	  
        	  Map<String, Integer> treeMap2 = new TreeMap<>();

        	  treeMap2.put("sara", 1);
        	  treeMap2.put("john", 2);
        	  treeMap2.put("tom", 3);
        	  treeMap2.put("mac", 4);
        	     
        	  for (Map.Entry entry2 : treeMap2.entrySet()) {
        	  System.out.println(entry2.getKey() + " -> " + entry2.getValue());
        	  
        	  } 
        	  
        }
        
	}
}








