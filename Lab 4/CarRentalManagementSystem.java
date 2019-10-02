public class CarRentalManagementSystem
{
	public static void main(String[] args)
	{
		// Capitalized all the Class name 
		CarManager carManager = new CarManager(10);
		
		//Java will auto initialized a constructor if we not declare
		Car car1 = new Car();
		car1.setCarID(1001);
		car1.setPlateNo("ABC T11");
		car1.setModel("Proton");
		car1.setPrice(5);
		car1.setCapacity(4);
		car1.setAuto(false);
		car1.setUsable(true);
		
		Car car2 = new Car();
		car2.setCarID(1002);
		car2.setPlateNo("ABC T12");
		car2.setModel("Honda");
		car2.setPrice(10);
		car2.setCapacity(4);
		car2.setAuto(true);
		car2.setUsable(true);
		
		Car car3 = new Car();
		car3.setCarID(1003);
		car3.setPlateNo("ABC T13");
		car3.setModel("Nissan");
		car3.setPrice(15);
		car3.setCapacity(4);
		car3.setAuto(true);
		car3.setUsable(false);
		
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