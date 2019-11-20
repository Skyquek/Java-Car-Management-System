package view.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddCarDialog extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JTextField txtPlateNo = new JTextField();
	private JTextField txtModel = new JTextField(15);
	private JTextField txtPrice = new JTextField();
	private JTextField txtCapacity = new JTextField();
	private JCheckBox chkAuto = new JCheckBox("Auto");
	private JCheckBox chkUsable = new JCheckBox("Yes", true);
	private JButton btnSubmit = new JButton("Submit");
	private JButton btnReset = new JButton("Reset");
	
	public AddCarDialog(ManageCarsDialog dialog) {
		// TODO Auto-generated constructor stub
		super(dialog, "Add Car", true);
		
		JPanel pnlCenter = new JPanel(new GridLayout(6,2, 10, 10));
		JPanel pnlSouth = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
		
		pnlCenter.add(new JLabel("Plate Number: "));
		pnlCenter.add(txtPlateNo);
		pnlCenter.add(new JLabel("Model: "));
		pnlCenter.add(txtModel);
		pnlCenter.add(new JLabel("Price (RM): "));
		pnlCenter.add(txtPrice);
		pnlCenter.add(new JLabel("Capacity: "));
		pnlCenter.add(txtCapacity);
		pnlCenter.add(new JLabel("Transmission: "));
		pnlCenter.add(chkAuto);
		pnlCenter.add(new JLabel("Usable: "));
		pnlCenter.add(chkUsable);
		
		
		pnlSouth.add(btnSubmit);
		pnlSouth.add(btnReset);
		
		this.add(pnlCenter);
		this.add(pnlSouth, BorderLayout.SOUTH);
		
		this.setResizable(false);
		
		//Automatically Calculate Size
		this.pack();
		
		this.setLocationRelativeTo(dialog);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
