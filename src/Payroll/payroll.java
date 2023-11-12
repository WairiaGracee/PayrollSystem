package Payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class payroll {

	private JFrame frmPayrollsystem;
	private JTextField EmployeeName;
	private JTextField Rate;
	private JTextField Hours;
	private JTextField Days;
	private JTextField tax;
	private JTextField philhealth;
	private JTextField SSS;
	private JTextField grosssalary;
	private JTextField deduction;
	private JTextField gross;
	private JTextField totaldeduct;
	private JTextField netsalary;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payroll window = new payroll();
					window.frmPayrollsystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPayrollsystem = new JFrame();
		frmPayrollsystem.setTitle("PayrollSystem");
		frmPayrollsystem.setBounds(100, 100, 861, 525);
		frmPayrollsystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPayrollsystem.getContentPane().setLayout(null);
		
		JLabel txtTitle = new JLabel("Simple  Payroll System");
		txtTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtTitle.setBounds(256, 25, 300, 32);
		frmPayrollsystem.getContentPane().add(txtTitle);
		
		JLabel txtName = new JLabel("Employee Name:");
		txtName.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtName.setBounds(56, 98, 139, 32);
		frmPayrollsystem.getContentPane().add(txtName);
		
		EmployeeName = new JTextField();
		EmployeeName.setBounds(161, 106, 104, 19);
		frmPayrollsystem.getContentPane().add(EmployeeName);
		EmployeeName.setColumns(10);
		
		JLabel txtRate = new JLabel("Rate Per Hour:");
		txtRate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtRate.setBounds(66, 140, 87, 33);
		frmPayrollsystem.getContentPane().add(txtRate);
		
		Rate = new JTextField();
		Rate.setBounds(161, 148, 96, 19);
		frmPayrollsystem.getContentPane().add(Rate);
		Rate.setColumns(10);
		
		JLabel txtHours = new JLabel("Hour Per Day:");
		txtHours.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtHours.setBounds(66, 183, 87, 28);
		frmPayrollsystem.getContentPane().add(txtHours);
		
		Hours = new JTextField();
		Hours.setBounds(161, 189, 96, 19);
		frmPayrollsystem.getContentPane().add(Hours);
		Hours.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Number of Days worked:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 221, 147, 32);
		frmPayrollsystem.getContentPane().add(lblNewLabel);
		
		Days = new JTextField();
		Days.setBounds(161, 229, 96, 19);
		frmPayrollsystem.getContentPane().add(Days);
		Days.setColumns(10);
		
		JLabel txtTitle2 = new JLabel("DEDUCTION OF SALARY:");
		txtTitle2.setForeground(Color.RED);
		txtTitle2.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTitle2.setBounds(322, 97, 234, 32);
		frmPayrollsystem.getContentPane().add(txtTitle2);
		
		JLabel txtWage = new JLabel("TAX 15% of Monthly Wage:");
		txtWage.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtWage.setBounds(302, 140, 172, 24);
		frmPayrollsystem.getContentPane().add(txtWage);
		
		tax = new JTextField();
		tax.setEditable(false);
		tax.setText("");
		tax.setBounds(459, 144, 96, 19);
		frmPayrollsystem.getContentPane().add(tax);
		tax.setColumns(10);
		
		JLabel txtHealth = new JLabel("Philhealth 5%:");
		txtHealth.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtHealth.setBounds(362, 183, 104, 28);
		frmPayrollsystem.getContentPane().add(txtHealth);
		
		philhealth = new JTextField();
		philhealth.setEditable(false);
		philhealth.setBounds(459, 189, 96, 19);
		frmPayrollsystem.getContentPane().add(philhealth);
		philhealth.setColumns(10);
		
		JLabel txtsss = new JLabel("SSS 2% :");
		txtsss.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtsss.setBounds(388, 228, 104, 19);
		frmPayrollsystem.getContentPane().add(txtsss);
		
		SSS = new JTextField();
		SSS.setEditable(false);
		SSS.setBounds(460, 229, 96, 19);
		frmPayrollsystem.getContentPane().add(SSS);
		SSS.setColumns(10);
		
		JLabel txtGross = new JLabel("Gross Salary :");
		txtGross.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtGross.setBounds(642, 144, 133, 24);
		frmPayrollsystem.getContentPane().add(txtGross);
		
		grosssalary = new JTextField();
		grosssalary.setEditable(false);
		grosssalary.setText("");
		grosssalary.setBounds(729, 148, 96, 19);
		frmPayrollsystem.getContentPane().add(grosssalary);
		grosssalary.setColumns(10);
		
		JLabel txtdeduct = new JLabel("Deduction :");
		txtdeduct.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtdeduct.setBounds(642, 206, 77, 28);
		frmPayrollsystem.getContentPane().add(txtdeduct);
		
		deduction = new JTextField();
		deduction.setEditable(false);
		deduction.setText("");
		deduction.setBounds(729, 212, 96, 19);
		frmPayrollsystem.getContentPane().add(deduction);
		deduction.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("GROSS SALARY :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 347, 143, 32);
		frmPayrollsystem.getContentPane().add(lblNewLabel_1);
		
		gross = new JTextField();
		gross.setEditable(false);
		gross.setBounds(161, 356, 96, 19);
		frmPayrollsystem.getContentPane().add(gross);
		gross.setColumns(10);
		
		JLabel txttotaldeduct = new JLabel("TOTAL DEDUCTION :");
		txttotaldeduct.setFont(new Font("Tahoma", Font.BOLD, 15));
		txttotaldeduct.setBounds(302, 347, 164, 32);
		frmPayrollsystem.getContentPane().add(txttotaldeduct);
		
		totaldeduct = new JTextField();
		totaldeduct.setEditable(false);
		totaldeduct.setText("");
		totaldeduct.setBounds(460, 356, 96, 19);
		frmPayrollsystem.getContentPane().add(totaldeduct);
		totaldeduct.setColumns(10);
		
		JLabel txtnetsalary = new JLabel("NET SALARY :");
		txtnetsalary.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtnetsalary.setBounds(592, 347, 139, 32);
		frmPayrollsystem.getContentPane().add(txtnetsalary);
		
		netsalary = new JTextField();
		netsalary.setEditable(false);
		netsalary.setText("");
		netsalary.setBounds(729, 356, 96, 19);
		frmPayrollsystem.getContentPane().add(netsalary);
		netsalary.setColumns(10);
		
		final JButton btnNewButton = new JButton("Compute");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        // Get input values
				        String name = EmployeeName.getText();
				        double rate = Double.parseDouble(Rate.getText());
				        double hours = Double.parseDouble(Hours.getText());
				        int days = Integer.parseInt(Days.getText());

				        // Calculate gross salary
				        double grossSalary = rate * hours * days;

				        // Calculate deductions
				        double taxPercentage = 0.15;
				        double philhealthPercentage = 0.05;
				        double sssPercentage = 0.02;

				        double taxAmount = grossSalary * taxPercentage;
				        double philhealthAmount = grossSalary * philhealthPercentage;
				        double sssAmount = grossSalary * sssPercentage;

				        // Calculate total deduction
				        double totalDeduction = taxAmount + philhealthAmount + sssAmount;

				        // Calculate net salary
				        double netSalary = grossSalary - totalDeduction;

				        // Display results
				        grosssalary.setText(String.valueOf(grossSalary));
				        tax.setText(String.valueOf(taxAmount));
				        philhealth.setText(String.valueOf(philhealthAmount));
				        SSS.setText(String.valueOf(sssAmount));
				        deduction.setText(String.valueOf(totalDeduction));
				        gross.setText(String.valueOf(grossSalary));
				        totaldeduct.setText(String.valueOf(totalDeduction));
				        netsalary.setText(String.valueOf(netSalary));
				    }
				});

			}
		});
		btnNewButton.setBackground(new Color(64, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(349, 405, 164, 40);
		frmPayrollsystem.getContentPane().add(btnNewButton);
	}
}
