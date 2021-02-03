import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Checkdemo extends JFrame implements ItemListener
{
	JLabel l1,l2,la1;
	JCheckBox cb1,cb2;
	JButton b1,b2;
	String us,ps;
	Checkdemo()
	{
		setSize(500,500);
		setLayout(null);
		l1=new JLabel();
		l1.setBounds(50,50,100,50);
		add(l1);
		cb1=new JCheckBox();
		
		cb1.setBounds(150,50,100,50);			
		add(cb1);
		cb2=new JCheckBox();
		
		cb2.setBounds(150,150,100,50);			
		add(cb2);				
		b1=new JButton("Login");
		b1.setBounds(150,220,100,20);		
		add(b1);
		b2=new JButton("Dont Click");
		b2.setBounds(260,220,100,20);		
		add(b2);
		la1=new JLabel();
		la1.setBounds(50,270,100,50);
		add(la1);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		
		Checkdemo l=new Checkdemo();
	}
	public void itemStateChanged(ItemEvent ae)
		{
			if(ae.getSource()==cb1)
			{
				if(cb1.isSelected())
				{
					JOptionPane.showMessageDialog(null, "box1 seleted");
				}
			}
			if(ae.getSource()==cb2)
			{
				if(cb2.isSelected())
				{
					JOptionPane.showMessageDialog(null, "box2 seleted");
				}
			}
		
			
		}
}
