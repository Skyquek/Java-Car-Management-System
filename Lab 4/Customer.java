public class Customer
{
	private int customerID;
	private String name;
	private String licenseNo;
	private String phoneNo;

	//getter and setter CustomerID
	public int getCustomerID()
	{
		return customerID;
	}
	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}

	//getter and setter name
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	//getter and setter license No
	public String getLicenseNo()
	{
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo)
	{
		this.licenseNo = licenseNo;
	}

	//getter and setter phoneNo
	public String getPhoneNo()
	{
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
}