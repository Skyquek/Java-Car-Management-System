package view;

import java.util.Scanner;

public class CarRentalManagementSystem extends View
{
	@Override
	public void displayOptions()
	{
		System.out.println("Welcome to Car Rental Management System");
		System.out.println("=======================================");
		System.out.println("1. Manage cars");
		System.out.println("2. Manage customers");
		System.out.println("3. Manage rentals");
		System.out.println("4. Exit");
	}
	
	@Override
	public void processOption(Scanner scanner, int choice)
	{
		if(choice==1)
			{
				CarView cv=new CarView();
				
				cv.displayOptions();
				cv.selectOption(scanner,10);
				displayOptions();//display main menu again
			}
			else if(choice==2)
			{
				CustomerView cusv=new CustomerView();
				cusv.displayOptions();
				//cusv.selectOption(scanner,5);
				displayOptions();
			}
			else if(choice==3)
			{
				RentalView rv=new RentalView();
				rv.displayOptions();
				//rv.selectOption(scanner,5);
				displayOptions();
			}
	}
	
	public static void main(String[] args)
	{	
		Scanner scanner= new Scanner(System.in);
		CarRentalManagementSystem crms=new CarRentalManagementSystem();
		
		crms.displayOptions();
		crms.selectOption(scanner,4);
	}
}