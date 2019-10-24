public class CarManager
{
	private Car[] cars;
	private int count;
	
	//constructor
	public CarManager(int length)
	{
		cars = new Car[length]; //new = allocate new memory in address with specific length
	}
	
	int addCar(Car car)
	{
		int status = 0;
		
		if(count < cars.length)
		{	
			// add to array
			//cars[count] = car;
			//count++;
			
			//shorter notation
			cars[count++] = car;
			status = count;
			
		}
		
		return status;
	}
}