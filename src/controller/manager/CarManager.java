package controller.manager;

import model.Car;
import java.util.Vector;

public class CarManager
{
	// List, Set, and Map
	// ArrayList and Vector
	
	private static Vector<Car> cars = new Vector<>();

	public static boolean addCar(Car car)
	{
		// Add is util library function
		return cars.add(car);
	}
	
	/*public static void displayCars()
	{
		// In Vector, we use get method to access index inside it
		for(int i=0;i<cars.size();i++)
		{
			Car car=cars.get(i);
			
			if (car!=null)
				displayCar(car);
		}
	}*/
	
	public static int updateCar(Car car)
	{
		/*int index=-1;
		for(int i=0;i<cars.length;i++)
		{
			Car temp=cars[i];
			
			if (temp!=null && temp.getUniqueID()==car.getUniqueID())
			{
				cars[i]=car;
				index=i;
				
				break;
			}
		}
		return index;*/
		return -1;
	}
	
	public static boolean deleteCar(int carID)
	{
		Car car = null;
		for (Car c:cars)
		{
			if(c.getUniqueID() == carID)
			{
				car = c;
				break;
			}
		}
		
		return cars.remove(car);
	}
	
	private static void displayCar(Car car)
	{
		System.out.println();
		System.out.println("Car ID: " + car.getUniqueID());
		System.out.println("Plate No: " + car.getPlateNo());
		System.out.println("Model: " + car.getModel());
		System.out.println("Price: RM" + car.getPrice());
		System.out.println("Capacity: " + car.getCapacity());
		System.out.println("Is auto: " + car.isAuto());
		System.out.println("Is usable: " + car.isUsable());
	}
	
	public static Vector<Car> getCars()
	{
		return cars;
	}
	
	public static Vector<Car> getCars(double maxPrice)
	{
		Vector<Car> temp = new Vector<>();
		
		for (Car car : cars)
			if(car.getPrice() <= maxPrice)
				temp.add(car);
		
		return temp;
	}
	
	public static Vector<Car> getCars(int minCapacity)
	{
		Vector<Car> temp = new Vector<>();
		
		for (Car car : cars)
			if(car.getCapacity() >= minCapacity)
				temp.add(car);
		
		return temp;
	}
	
	public static Vector<Car> getCars(boolean auto)
	{
		Vector<Car> temp = new Vector<>();
		
		for (Car car : cars)
			if(car.isAuto() == auto)
				temp.add(car);
		
		return temp;
	}
	
	public static Vector<Car> getCars(String model)
	{
		Vector<Car> temp = new Vector<>();
		
		for (Car car : cars)
			if(car.getModel().toLowerCase().contains(model.toLowerCase()))
				temp.add(car);
		
		return temp;
	}
	
}