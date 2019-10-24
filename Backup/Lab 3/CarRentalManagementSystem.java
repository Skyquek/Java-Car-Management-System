public class CarRentalManagementSystem
{
	public static void main(String[] args)
	{
		// Capitalized all the Class name 
		CarManager carManager = new CarManager(10);
		
		//Java will auto initialized a constructor if we not declare
		Car car1 = new Car();
		car1.carID = 1001;
		car1.plateNo = "ABC T11";
		car1.model = "Proton";
		car1.price = 5;
		car1.capacity = 4;
		car1.isAuto = false;
		car1.isUsable = true;
		
		Car car2 = new Car();
		car2.carID = 1002;
		car2.plateNo = "ABC T12";
		car2.model = "Honda";
		car2.price = 10;
		car2.capacity = 4;
		car2.isAuto = true;
		car2.isUsable = true;
		
		Car car3 = new Car();
		car3.carID = 1003;
		car3.plateNo = "ABC T13";
		car3.model = "Nissan";
		car3.price = 15;
		car3.capacity = 4;
		car3.isAuto = true;
		car3.isUsable = false;
		
		if(carManager.addCar(car1) != 0)
			System.out.println("Car added");
		else
			System.out.println("Cannot add car");
		
		if(carManager.addCar(car2) != 0)
			System.out.println("Car added");
		else
			System.out.println("Cannot add car");
		
		if(carManager.addCar(car3) != 0)
			System.out.println("Car added");
		else
			System.out.println("Cannot add car");
		
	}
}