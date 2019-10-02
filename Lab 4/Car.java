public class Car
{
	private int carID; //done
	private String plateNo; //done
	private String model; //done
	private double price; //done
	private int capacity; //done
	private boolean auto; //done
	private boolean usable; //done

	public int getCarID()
	{
		return carID;
	}

	public void setCarID(int carID)
	{
		this.carID = carID;
	}

	public String getPlateNo()
	{
		return plateNo;
	}

	public void setPlateNo(String plateNo)
	{
		this.plateNo = plateNo;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

	// Getter & Setter for auto
    public boolean isAuto(){
        return auto;
	}
	
    public void setAuto(boolean auto){
        this.auto = auto;
    }

    // Getter & Setter for usable
    public boolean isUsable(){
        return usable;
	}
	
    public void setUsable(boolean usable){
        this.usable = usable;
    }


}

