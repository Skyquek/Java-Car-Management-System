public class Rental
{
	private int rentalID;
	private Car car;
	private Customer customer;
	private long start;
	private int duration; //number of hour
	private double total;

	//getter and setter for rentalID
	public int getRentalID()
	{
		return rentalID;
	}
	public void setRentalID(int rentalID)
	{
		this.rentalID = rentalID;
	}

	//getter and setter for carID
	public Car getCar()
	{
		return car;
	}
	public void setCar(Car car)
	{
		this.car = car;
	}

	//getter and setter for customerID
	public Customer getCustomer()
	{
		return customer;
	}
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	//getter and setter for start
	public long getStart(){
        return start;
    }
	
	public void setStart(long start) {
        this.start = start;
	}
	
	//getter and setter for duration
	public void setDuration(int duration)
	{
		//duration must be positive
		if (duration > 0 )
		{
			this.duration = duration;
			this.total = duration * car.getPrice();
		}	
	}
	
	// We do not need setter of the total
	public double getTotal()
	{
		return total;
	}

	
}