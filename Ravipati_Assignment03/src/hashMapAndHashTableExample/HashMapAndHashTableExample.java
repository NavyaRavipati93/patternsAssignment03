package hashMapAndHashTableExample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAndHashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //-hashtable-
        Hashtable<Integer,String> h=new Hashtable<Integer,String>();
        h.put(101,"Harika");
        h.put(101,"Navya");
        h.put(102,"Nehru");
        h.put(103,"Mohan");
        System.out.println("Hash table");
        for (Map.Entry m:h.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
 
        //-hashmap-
        HashMap<Integer,String> h1=new HashMap<Integer,String>();
        h1.put(100,"Akhil");
        h1.put(104,"akhil"); 
        h1.put(101,"Poorna");
        h1.put(102,"Pranay");
        System.out.println("Hash map");
        for (Map.Entry m:h1.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }


	}


