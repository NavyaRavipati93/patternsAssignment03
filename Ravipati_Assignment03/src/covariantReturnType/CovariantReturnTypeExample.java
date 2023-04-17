package covariantReturnType;


class Vehicle {
	   public Vehicle getVehicle() {
		   System.out.println("SuperClass");
	      return new Vehicle();
	   }
	}

	class bike extends Vehicle {
	   @Override
	   public bike getVehicle() {
		   System.out.println("SubClass of vehicle");
	      return new bike();
	   }
	}
	
public class CovariantReturnTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike dog = new bike();
		Vehicle a = dog.getVehicle(); 
		

	}
}