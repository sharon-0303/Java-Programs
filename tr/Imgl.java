import java.awt.*;
import javax.swing.*;
class Imgl extends JFrame
{
	JLabel l1,l2,l3,l4;
	Imgl()
	{
		setSize(500,500);
		setLayout(null);
		ImageIcon i2=new ImageIcon("proxy.duckduckgo.com.jpg");
		l4=new JLabel(i2);
		setContentPane(l4);
		ImageIcon i1=new ImageIcon("image.jpg");
		l3=new JLabel(i1);
		l3.setBounds(200,50,50,50);
		add(l3);		
		l1=new JLabel("Username");
		l1.setBounds(50,100,100,50);
		add(l1);
		l2=new JLabel("Password");
		l2.setBounds(50,150,100,50);			
		add(l2);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		Imgl l=new Imgl();
	}
}