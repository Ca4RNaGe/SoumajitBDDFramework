package collectionpack;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap<Character,String> hashmap=new HashMap<>();
        hashmap.put('A',"Souma");
        hashmap.put('B',"Bikram");
        hashmap.put('C',"Chaya");
        hashmap.put('S',"Shounak");
        hashmap.put('R',"Rahul");
        //to display
        System.out.println(hashmap);
        //get all the keys
        Object[] keys=hashmap.keySet().toArray();
        for(int i=0; i<keys.length; i++)
        {
        	System.out.println(keys[i]);
        }
        //to get the single valus
        String name=hashmap.get('A');
        System.out.println(name);
        //check whether the key is present
        boolean result=hashmap.containsKey('B');
        System.out.println(result);
        
        hashmap.remove('A');
        hashmap.clear();
        
	}

}
