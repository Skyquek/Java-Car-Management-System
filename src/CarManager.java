package controller.manager;

import model.Car;

public class CarManager
{
	private Car[] cars; // Save all the cars inside the array named Car[]
	//private int count; 
	
	//constructor
	public CarManager(int length)
	{
		cars = new Car[length]; //new = allocate new memory in address with specific length
	}
	
	int addCar(Car car)
	{
		int index = -1;

		for (int i = 0; i < cars.length; i++)
		{
			Car temp = cars[i];
			
			if (temp == null)
			{
				cars[i] = car;
				index = i;
				
				break;
			}	
		}
	
		return index;
	}

	int updateCar(Car car)
	{
		int index = -1;

		for (int i = 0; i < cars.length; i++)
		{
			Car temp = cars[i];
			
			if (temp != null && temp.getCarID() == car.getCarID())
			{
				cars[i] = car;
				index = i;
				
				break;
			}	
		}
	
		return index;
	}

	int deleteCar(int carID)
	{
		int index = -1;

		for (int i = 0; i < cars.length; i++)
		{
			Car temp = cars[i];
			
			if (temp != null && temp.getCarID() == carID)
			{
				cars[i] = null;
				index = i;
				
				break;
			}	
		}
	
		return index;
	}

	void displayCars()
	{
		for (int i = 0; i < cars.length; i++)
		{
			Car car = cars[i];
			
			if (car != null) {
				System.out.println();
				System.out.println("Car ID: " + car.getCarID());
				System.out.println("Plate No: " + car.getPlateNo());
				System.out.println("Model: "+ car.getModel());
				System.out.println("Price: "+ car.getPrice());
				System.out.println("Capacity: "+ car.getCapacity());
				System.out.println("Auto: "+ car.isAuto());
				System.out.println("Usable: "+ car.isUsable());
			}
			
		}
	}

	void displayCars(double maxPrice)
	{
		for (Car car: cars) // for every car in the cars[] @ cars's array, use this when you no need to use the i variable in the looping
		{	
			if (car != null && car.getPrice() <= maxPrice) {
				displayCar(car);
			}
			
		}
	}

	void displayCars(int maxCapacity)
	{
		for (Car car: cars) // for every car in the cars[] @ cars's array, use this when you no need to use the i variable in the looping
		{	
			if (car != null && car.getCapacity() >= maxCapacity) {
				displayCar(car);
			}
			
		}
	}

	void displayCars(boolean auto)
	{
		for (Car car: cars) // for every car in the cars[] @ cars's array, use this when you no need to use the i variable in the looping
		{	
			if (car != null && car.isAuto() == auto) {
				displayCar(car);
			}
			
		}
	}

	void displayCars(String model)
	{
		for (Car car: cars) // for every car in the cars[] @ cars's array, use this when you no need to use the i variable in the looping
		{	
			// Need to make sure user input model is the same, we can use "contains" method
			if (car != null && car.getModel().toLowerCase().contains(model.toLowerCase())) {
				displayCar(car);
			}
			
		}
	}

	// Put private to ensure only this class can access
	private void displayCar(Car car)
	{
		System.out.println();
		System.out.println("Car ID: " + car.getCarID());
		System.out.println("Plate No: " + car.getPlateNo());
		System.out.println("Model: "+ car.getModel());
		System.out.println("Price: "+ car.getPrice());
		System.out.println("Capacity: "+ car.getCapacity());
		System.out.println("Auto: "+ car.isAuto());
		System.out.println("Usable: "+ car.isUsable());
	}
}