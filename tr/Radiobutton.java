import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Radiobutton extends JFrame implements ItemListener
{
	JLabel l1,l2,la1;
	JRadioButton cb1,cb2;
	ButtonGroup bg;
	
	Radiobutton()
	{
		setSize(500,500);
		setLayout(null);
		l1=new JLabel();
		l1.setBounds(50,50,100,50);
		add(l1);
		bg=new ButtonGroup();
		cb1=new JRadioButton();
		
		cb1.setBounds(150,50,100,50);			
		add(cb1);
		cb2=new JRadioButton();
		
		cb2.setBounds(150,150,100,50);			
		add(cb2);				
		bg.add(cb1);
		bg.add(cb2);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		
		Radiobutton l=new Radiobutton();
	}
	public void itemStateChanged(ItemEvent ae)
	{
			
				if(cb1.isSelected())
				{
					JOptionPane.showMessageDialog(null,"rb1 selected");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"rb2 selected");
				}
			
		
			
	}
}
