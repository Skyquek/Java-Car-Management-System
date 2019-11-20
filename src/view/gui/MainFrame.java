package view.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JButton btnManageCars = new JButton("Manage Cars");
	private JButton btnManageCustomers = new JButton("Manage Customers");
	private JButton btnManageRentals = new JButton("Manage Rentals");
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
		super("Car Rental Management System");
		
		// Default: java use border layout
		GridLayout layout = new GridLayout(3,1);
		btnManageCars.addActionListener(this);
		btnManageCustomers.addActionListener(this);
		btnManageRentals.addActionListener(this);
		
		this.add(btnManageCars);
		this.add(btnManageCustomers);
		this.add(btnManageRentals);
		
		this.setSize(300, 200);
		this.setLayout(layout);
		this.setLocationRelativeTo(null);
		
		// If no exit on close, its will keep open
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if(source == btnManageCars)
			new ManageCarsDialog(this);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
