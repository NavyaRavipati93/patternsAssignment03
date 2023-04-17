package stringAndStringBufferExample;

public class StringAndStringBufferExample {

	public static void main(String[] args) {
		// String example
		String str = "Hello";
		str = str.concat(" World");//using concat
		System.out.println(str); // Output: Hello World
		
		// StringBuffer example
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World"); //using append
		System.out.println(sb.toString()); // Output: Hello World
	}

}
