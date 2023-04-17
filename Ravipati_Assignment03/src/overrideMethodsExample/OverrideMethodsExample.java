package overrideMethodsExample;

class Animal {
    public static void app() {
        System.out.println("Animal app");
    }
    private void see() {
        System.out.println("Animal see");
    }
}
class Dog extends Animal {
    public static void app() {
        System.out.println("Dog app");
    } 
    private void see() {
        System.out.println("Dog see");
    }
}
public class OverrideMethodsExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal p = new Dog();
		p.app();
		//p.see(); 
	}
}