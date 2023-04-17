package generics;


class MyGenericClass<T> {
	private T data;

	public MyGenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
	public class GenericClass {
		public static void main(String[] args) {
			MyGenericClass<Integer> obj = new MyGenericClass<Integer>(10);
			System.out.println("Data stored in Obj: " + obj.getData());

			MyGenericClass<String> obj1 = new MyGenericClass<>("Example for GenericClass");
			System.out.println("Data stored in Obj1: " + obj1.getData());
		}
	}