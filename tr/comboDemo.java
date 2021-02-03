import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ComboDemo extends JFrame implements ItemListener
{
	JLabel l1,l2,la1;
	JComboBox cb1,cb2;
	ButtonGroup bg;
	
	ComboDemo()
	{
		setSize(500,500);
		setLayout(null);
		l1=new JLabel();
		l1.setBounds(50,50,100,50);
		add(l1);
		cb1=new JComboBox();		
		cb1.setBounds(150,50,100,50);			
		add(cb1);	
		cb1.addItem("1");
		cb1.addItem("a");
		cb1.addItem("2");
		cb1.addItem("3");
		cb1.addItem("4");
		cb1.addItem("5");	
		cb1.addItemListener(this);		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		
		ComboDemo l=new ComboDemo();
	}
	public void itemStateChanged(ItemEvent ae)
	{
		Object ob=cb1.getSelectedItem();
		JOptionPane.showMessageDialog(null,ob.toString());	
				
			
		
			
	}
}
