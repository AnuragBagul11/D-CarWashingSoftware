import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;


class CarWashWelcome extends JFrame implements ActionListener
{
	JButton btnStart;

	JLabel lbTitle;

	Timer myTime,myTime2;

	int l=0;

	Image imgBack;

	JLabel lbBack;

	ImageIcon iconBack;

	Image scaledBack;


	CarWashWelcome()
	{
		setSize(1450,1000);

		setTitle("Welcome");
		setLayout(null);

		btnStart = new JButton("Start");
		btnStart.setBounds(650,650,100,20);
		add(btnStart);
		btnStart.addActionListener(this);

		lbTitle = new JLabel("|| CAR WASHING AND MANAGEMENT SYSTEM ||");
		lbTitle.setBounds(0,50,800,30);
		lbTitle.setFont(new Font("Times New Roman",Font.BOLD,30));
		lbTitle.setForeground(Color.white);
		add(lbTitle);

		myTime= new Timer(150,this);
		myTime.setRepeats(true);
		myTime.start();

		myTime2= new Timer(150,this);
		myTime2.setRepeats(true);


		imgBack = Toolkit.getDefaultToolkit().getImage("CarWash.jpg");

		scaledBack = imgBack.getScaledInstance(1600,1200,Image.SCALE_DEFAULT);

		iconBack = new ImageIcon(scaledBack);

		lbBack = new JLabel(iconBack);

		lbBack.setBounds(0,0,1600,1000);

		add(lbBack);

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnStart)
			{
				SF obj = new SF();
				obj.show();
			}

		if(e.getSource()==myTime)
			{
				lbTitle.setLocation(l,50);
				l=l+10;

				if(l>=(1450-lbTitle.getWidth()))
				{
					myTime.stop();
					myTime2.start();
				}
			}

		if(e.getSource()==myTime2)
			{
				lbTitle.setLocation(l,50);
				l=l-10;

				if(l<=0)
				{
					myTime2.stop();
					myTime.start();
				}
			}
	}
}
