package staticBufferAndStaticBuilder;

public class StaticBufferAndStaticBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder Builder = new StringBuilder();
		StringBuffer Buffer = new StringBuffer();

		// Append strings to StringBuilder and StringBuffer
		Builder.append("Hi");
		Buffer.append("Hi");

		// Print the content of both StringBuilder and StringBuffer
		System.out.println("StringBuilder Example: " + Builder.toString());
		System.out.println("StringBuffer Example: " + Buffer.toString());

	}

}
