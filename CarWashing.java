import javax.swing.*;
import java.awt.*;

import javax.swing.event.*;
import java.awt.event.*;

class SF extends JFrame implements ActionListener
{
	JPanel CarinfoPanel,WashDetailPanel,DataPanel,TotalPanel;

	JLabel lbHeadLine,lbCarno,lbCustomerNo,lbTotal,lbPayment,lbBalance;

	JTextField txCarno,txCustomerNo,wdtx1,wdtx2,wdtx3,wdtx4,wdtx5,wdtx6,wdtx7,Ttx1,Ttx2,Ttx3;

	JCheckBox chk1,chk2,chk3,chk4,chk5,chk6,chk7;

	JButton btnAdd,btnCalculate,btnSave;

	JTextArea tx1;

	GlobalClass g= new GlobalClass();


	SF()
	{
		setSize(1400,1200);
		setLayout(null);
		setTitle("CAR WASHING AND MANAGEMENT SYSYTEM DEVELOPED BY ANURAG BAGUL & AANAND PATIL");

		/*lbHeadLine = new JLabel("|| CAR WASHING AND MANAGEMENT SYSTEM  ||");
		lbHeadLine.setBounds(400,30,800,30);
		lbHeadLine.setFont(new Font("Times New Roman",Font.BOLD,30));
		add(lbHeadLine);
		lbHeadLine.setLayout(null);*/

		CarinfoPanel = new JPanel();
		CarinfoPanel.setBounds(50,20,400,150);
		add(CarinfoPanel);
		CarinfoPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		CarinfoPanel.setLayout(null);
		CarinfoPanel.setBackground(Color.yellow);

		WashDetailPanel= new JPanel();
		WashDetailPanel.setBounds(50,200,400,450);
		add(WashDetailPanel);
		WashDetailPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		WashDetailPanel.setLayout(null);
		WashDetailPanel.setBackground(Color.yellow);

		DataPanel= new JPanel();
		DataPanel.setBounds(800,20,400,350);
		add(DataPanel);
		DataPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		DataPanel.setLayout(null);

		tx1= new JTextArea();
		tx1.setBounds(0,0,400,350);
		tx1.setFont(new Font("Times New Roman",Font.BOLD,17));
		DataPanel.add(tx1);
		tx1.setLayout(null);

		TotalPanel= new JPanel();
		TotalPanel.setBounds(800,390,400,250);
		add(TotalPanel);
		TotalPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		TotalPanel.setLayout(null);
		TotalPanel.setBackground(Color.green);

		btnAdd = new JButton("Add");
		btnAdd.setBounds(50,660,400,20);
		add(btnAdd);
		btnAdd.setFont(new Font("Times New Roman",Font.BOLD,20));
		btnAdd.addActionListener(this);
		btnAdd.setLayout(null);

		btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(800,660,200,20);
		add(btnCalculate);
		btnCalculate.setFont(new Font("Times New Roman",Font.BOLD,20));
		btnCalculate.addActionListener(this);
		btnCalculate.setLayout(null);

		btnSave = new JButton("Save");
		btnSave.setBounds(1050,660,150,20);
		add(btnSave);
		btnSave.setFont(new Font("Times New Roman",Font.BOLD,20));
		btnSave.addActionListener(this);
		btnSave.setLayout(null);

		lbCarno = new JLabel("Car No");
		lbCarno.setBounds(30,30,200,20);
		lbCarno.setFont(new Font("Times New Roman",Font.BOLD,17));
		CarinfoPanel.add(lbCarno);
		lbCarno.setLayout(null);

		txCarno= new JTextField("");
		txCarno.setBounds(150,30,200,20);
		txCarno.setFont(new Font("Times New Roman",Font.BOLD,17));
		CarinfoPanel.add(txCarno);

		lbCustomerNo = new JLabel("Customer No");
		lbCustomerNo.setBounds(30,100,300,20);
		lbCustomerNo.setFont(new Font("Times New Roman",Font.BOLD,17));
		CarinfoPanel.add(lbCustomerNo);
		lbCustomerNo.setLayout(null);

		txCustomerNo = new JTextField("");
		txCustomerNo.setBounds(150,100,200,20);
		txCustomerNo.setFont(new Font("Times New Roman",Font.BOLD,17));
		CarinfoPanel.add(txCustomerNo);

		chk1 = new JCheckBox("Dash Board Cleaning");
		chk1.setBounds(20,20,200,20);
		chk1.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(chk1);
		chk1.setLayout(null);
		wdtx1= new JTextField("0");
		wdtx1.setBounds(250,20,100,20);
		wdtx1.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(wdtx1);
		wdtx1.setLayout(null);

		chk2 = new JCheckBox("Uphostery Cleaning");
		chk2.setBounds(20,80,200,20);
		chk2.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(chk2);
		chk2.setLayout(null);
		wdtx2= new JTextField("0");
		wdtx2.setBounds(250,80,100,20);
		wdtx2.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(wdtx2);
		wdtx2.setLayout(null);

		chk3 = new JCheckBox("Roof Steam Cleaning");
		chk3.setBounds(20,140,200,20);
		chk3.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(chk3);
		chk3.setLayout(null);
		wdtx3= new JTextField("0");
		wdtx3.setBounds(250,140,100,20);
		wdtx3.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(wdtx3);
		wdtx3.setLayout(null);

		chk4 = new JCheckBox("Floor Board Cleaning");
		chk4.setBounds(20,200,200,20);
		chk4.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(chk4);
		chk4.setLayout(null);
		wdtx4= new JTextField("0");
		wdtx4.setBounds(250,200,100,20);
		wdtx4.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(wdtx4);
		wdtx4.setLayout(null);

		chk5 = new JCheckBox("Seat Removal");
		chk5.setBounds(20,260,200,20);
		chk5.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(chk5);
		chk5.setLayout(null);
		wdtx5= new JTextField("0");
		wdtx5.setBounds(250,260,100,20);
		wdtx5.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(wdtx5);
		wdtx5.setLayout(null);

		chk6 = new JCheckBox("Full Body Washing");
		chk6.setBounds(20,320,200,20);
		chk6.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(chk6);
		chk6.setLayout(null);
		wdtx6= new JTextField("0");
		wdtx6.setBounds(250,320,100,20);
		wdtx6.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(wdtx6);
		wdtx6.setLayout(null);

		chk7 = new JCheckBox("Wind Clean Treatment");
		chk7.setBounds(20,380,200,20);
		chk7.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(chk7);
		chk7.setLayout(null);

		wdtx7= new JTextField("0");
		wdtx7.setBounds(250,380,100,20);
		wdtx7.setFont(new Font("Times New Roman",Font.BOLD,15));
		WashDetailPanel.add(wdtx7);
		wdtx7.setLayout(null);

		lbTotal = new JLabel("Total");
		lbTotal.setBounds(30,30,200,20);
		lbTotal.setFont(new Font("Times New Roman",Font.BOLD,17));
		TotalPanel.add(lbTotal );
		lbTotal.setLayout(null);
		Ttx1 = new JTextField("");
		Ttx1.setBounds(220,30,100,20);
		Ttx1.setFont(new Font("Times New Roman",Font.BOLD,17));
		TotalPanel.add(Ttx1);

		lbPayment= new JLabel("Payment");
		lbPayment.setBounds(30,110,200,20);
		lbPayment.setFont(new Font("Times New Roman",Font.BOLD,17));
		TotalPanel.add(lbPayment);
		lbPayment.setLayout(null);
		Ttx2 = new JTextField("");
		Ttx2.setBounds(220,110,100,20);
		Ttx2.setFont(new Font("Times New Roman",Font.BOLD,17));
		TotalPanel.add(Ttx2);

		lbBalance = new JLabel("Balance");
		lbBalance.setBounds(30,190,200,20);
		lbBalance.setFont(new Font("Times New Roman",Font.BOLD,17));
		TotalPanel.add(lbBalance);
		lbTotal .setLayout(null);
		Ttx3 = new JTextField("");
		Ttx3.setBounds(220,190,100,20);
		Ttx3.setFont(new Font("Times New Roman",Font.BOLD,17));
		TotalPanel.add(Ttx3);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnAdd)
		{
			tx1.setText("");

			Ttx1.setText(Integer.toString(Integer.parseInt(wdtx1.getText())+Integer.parseInt(wdtx2.getText()) +Integer.parseInt(wdtx3.getText()) +Integer.parseInt(wdtx4.getText())+Integer.parseInt(wdtx5.getText())+Integer.parseInt(wdtx6.getText())+Integer.parseInt(wdtx7.getText())));

											if(chk1.isSelected())
											{
												tx1.setText(lbCarno.getText()+ txCarno.getText()+ "\t"+ lbCustomerNo.getText() +txCustomerNo.getText());

												tx1.setText(tx1.getText()+"\n"+"\n"+chk1.getText());

												tx1.setText(tx1.getText()+"\t"+"\t"+wdtx1.getText());
											}

											if(chk2.isSelected())
											{

												tx1.setText(tx1.getText()+"\n"+"\n"+chk2.getText());
												tx1.setText(tx1.getText()+"\t"+"\t"+wdtx2.getText());
											}

											if(chk3.isSelected())
											{

												tx1.setText(tx1.getText()+"\n"+"\n"+chk3.getText());
												tx1.setText(tx1.getText()+"\t"+"\t"+wdtx3.getText());
											}
											if(chk4.isSelected())
											{

												tx1.setText(tx1.getText()+"\n"+"\n"+chk4.getText());
												tx1.setText(tx1.getText()+"\t"+"\t"+wdtx4.getText());
											}

											if(chk5.isSelected())
											{

												tx1.setText(tx1.getText()+"\n"+"\n"+chk5.getText());
												tx1.setText(tx1.getText()+"\t"+"\t"+"\t"+wdtx5.getText());
											}

											if(chk6.isSelected())
											{

												tx1.setText(tx1.getText()+"\n"+"\n"+chk6.getText());
												tx1.setText(tx1.getText()+"\t"+"\t"+wdtx6.getText());
											}

											if(chk7.isSelected())
											{

												tx1.setText(tx1.getText()+"\n"+"\n"+chk7.getText());
												tx1.setText(tx1.getText()+"\t"+"\t"+wdtx7.getText());
											}
			}

			if(e.getSource()==btnCalculate)
					{
						Ttx2.setText(Integer.toString(Integer.parseInt(Ttx2.getText())));

						Ttx3.setText(Integer.toString(Integer.parseInt(Ttx2.getText()) - Integer.parseInt(Ttx1.getText())));
					}

			if(e.getSource()==btnSave)
					{
						g.recordManip("Insert into Car (Carno,Customerno,Dashboardcleaning,Uphosterycleaning,Roofsteamcleaning,Floorboardcleaning,Seatremoval,Fullbodywashing,Windcleantreatment,Total,payment,Balance) Values('"+txCarno.getText()+"', "+txCustomerNo.getText()+" ,"+wdtx1.getText()+" ,"+wdtx2.getText()+" ,"+wdtx3.getText()+" ,"+wdtx4.getText()+" ,"+wdtx5.getText()+" ,"+wdtx6.getText()+" ,"+wdtx7.getText()+" ,"+Ttx1.getText()+" ,"+Ttx2.getText()+" ,"+Ttx3.getText()+")");

						JOptionPane.showMessageDialog(null,"Record Save");
					}
	}
}



