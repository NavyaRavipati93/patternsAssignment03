package synchronizedArrayListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Collections.synchronizedList(new ArrayList<String>());

		list.add("Hyderabad");
		list.add("Guntur");
		list.add("Vijayawada");

		synchronized(list)
		{
			Iterator<String> itr = list.iterator();

			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

		}
	}
}


