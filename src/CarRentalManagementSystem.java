package view;

import java.util.Scanner;
public class CarRentalManagementSystem
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Car Rental Management System");
		System.out.println("=======================================");
		System.out.println("1. Manage Car");
		System.out.println("2. Manage Customers");
		System.out.println("3. Manage rentals");
		System.out.println("4. Exit");

		Scanner scanner = new Scanner(System.in);
		int choice;
		
		// Do something until user choose to exit
		do{
			choice = 0;
			while (choice < 1 || choice > 4)
			{
				System.out.print("Please enter an option: ");
				choice = scanner.nextInt();

				if(choice < 1 || choice > 4)
				{
					System.out.println("Invalid input, please try again.");
				}
			}	
		
			if(choice == 1)
			{
				System.out.println("You have selected manage cars.");	
			}
			if(choice == 2)
			{
				System.out.println("You have selected manage customers.");	
			}
			if(choice == 3)
			{
				System.out.println("You have selected manage rentals.");	
			}
	
		}while(choice != 4);
		
		
	}
}