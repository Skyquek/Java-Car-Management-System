package model;

abstract class Model
{
	protected int uniqueID;
	
	public Model(int uniqueID)
	{
		this.uniqueID=uniqueID;
	}
	
	public int getUniqueID()
	{
		return uniqueID;
	}
}