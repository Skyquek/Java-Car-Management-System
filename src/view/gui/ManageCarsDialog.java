package view.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class ManageCarsDialog extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnAddCar = new JButton("Add Cars");
	private JButton btnUpdateCar = new JButton("Update Customers");
	private JButton btnDeleteCar = new JButton("Delete Cars");
	private JButton btnViewAllCars = new JButton("View All Cars");
	private JButton btnViewCarsByMaxPrice = new JButton("View Cars by Max Price");
	private JButton btnViewCarsByMinCapacity = new JButton("View Cars by Min capacity");
	private JButton btnViewCarsByTransmission = new JButton("View Cars by Transmission");
	private JButton btnViewCarsByModel = new JButton("View Cars By Model");

	public ManageCarsDialog(MainFrame frame) {
		// TODO Auto-generated constructor stub
		super(frame, "Manage Cars", true);
		
		GridLayout layout = new GridLayout(4,2);
		
		btnAddCar.addActionListener(this);
		btnUpdateCar.addActionListener(this);
		btnDeleteCar.addActionListener(this);
		btnViewAllCars.addActionListener(this);
		btnViewCarsByMaxPrice.addActionListener(this);
		btnViewCarsByMinCapacity.addActionListener(this);
		btnViewCarsByTransmission.addActionListener(this);
		btnViewCarsByModel.addActionListener(this);
		
		this.add(btnAddCar);
		this.add(btnUpdateCar);
		this.add(btnDeleteCar);
		this.add(btnViewAllCars);
		this.add(btnViewCarsByMaxPrice);
		this.add(btnViewCarsByMinCapacity);
		this.add(btnViewCarsByTransmission);
		this.add(btnViewCarsByModel);
		
		this.setLayout(layout);
		//this.setSize(500, 200);
		this.pack();
		this.setLocationRelativeTo(frame);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
