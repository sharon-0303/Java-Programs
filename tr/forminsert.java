import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class forminsert extends JFrame implements ActionListener
{
	Connection con;
	JLabel l1,l2,la1;
	JTextField t1,t2;
	JPasswordField p1;
	JButton b1,b2;
	String us,ps;
	Statement stmt;
	forminsert()
	{
		setSize(500,500);
		setLayout(null);
		l1=new JLabel("Username");
		l1.setBounds(50,50,100,50);
		add(l1);
		l2=new JLabel("Password");
		l2.setBounds(50,150,100,50);			
		add(l2);
		t1=new JTextField();
		t1.setBounds(150,50,100,50);
		add(t1);
		p1=new JPasswordField();
		p1.setBounds(150,150,100,50);
		p1.setEchoChar('*');
		add(p1);
		b1=new JButton("Insert");
		b1.setBounds(150,220,100,20);		
		add(b1);
		b2=new JButton("Dont Click");
		b2.setBounds(260,220,100,20);		
		add(b2);
		la1=new JLabel();
		la1.setBounds(50,270,100,50);
		add(la1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");   
            
            
       }
       catch(Exception e)
       {
             System.out.println(e);
       }  
	}
	public static void main(String[] args)
	{
		
		forminsert l=new forminsert();
	}
	public void actionPerformed(ActionEvent ae)
		{
			us=t1.getText();
			ps=p1.getText();
			if(ae.getSource()==b1)
			{
				try
				{
					stmt=con.createStatement();
					int i=stmt.executeUpdate("insert into Login values('"+us+"','"+ps+"')"); 					
            	if(i>0) 
            	{
                	JOptionPane.showMessageDialog(null, "Inserted one record !!!");
            	}

				}
				catch(Exception sqle)
				{
					System.out.println("statement Error");
				}
			   
            				
			}
				
			
			if(ae.getSource()==b2)
			{
				JOptionPane.showMessageDialog(null, "Liar!!!");
			}
			
		}

}

// class JFrame2 extends JFrame implements ActionListener
// {
// 	JButton b1;
	
// 	JFrame2()
// 	{
// 		setSize(500,500);
// 		setLayout(null);
		
// 		b1=new JButton("Back");
// 		b1.setBounds(200,200,100,20);
// 		add(b1);
// 		b1.addActionListener(this);
// 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		setVisible(true);
// 	}
// 	public void actionPerformed(ActionEvent ae)
// 	{
// 		setVisible(false);
// 		forminsert l=new forminsert();
	
// 	}
	
	
// }