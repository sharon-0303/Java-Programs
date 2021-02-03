import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeSelectionModel;
class MyExplore implements TreeSelectionListener, ActionListener
{
    String pathToFileOnDisk = "logo.png";
	JFrame jfr = new JFrame("My Explorer");
	JTree jt = new JTree();
	Container ctr = new Container();
	JTextField jtf = new JTextField("");
	JMenuBar jmr = new JMenuBar();
	JMenu jmu = new JMenu("File");
	JMenuItem jmi1 = new JMenuItem("Close");
	DefaultListModel listModel = new DefaultListModel();
	JList lst = new JList(listModel);
	JTree tree;
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
	DefaultMutableTreeNode top1 = new DefaultMutableTreeNode("C:");
DefaultMutableTreeNode top1 = new DefaultMutableTreeNode("My Folder");
	DefaultMutableTreeNode top2 = new DefaultMutableTreeNode("D:");

	DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("File1");
	DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("File2");
	MyExplore()
	{	ImageIcon img = new ImageIcon(pathToFileOnDisk);
		jfr.setIconImage(img.getImage());
		jfr.setLayout(null);
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		jfr.setSize(600, 500);
		ctr = jfr.getContentPane();
		/* 		Add menu bar 	*/
		jmu.add(jmi1);
		jmr.add(jmu);
		jmr.setBounds(10, 10, 450, 20);
		ctr.add(jmr);
		jtf.setBounds(10, 35, 450, 20);
		ctr.add(jtf);		
		/* 		Tree  
		*/
		root.add(top1); root.add(top2);
		top1.add(child1); top2.add(child2);
		tree = new JTree(root);
		tree.setBounds(10, 60, 100, 300);
		ctr.add(tree);
		tree.addTreeSelectionListener(this);
		/* List*/
		lst.setBounds(150, 60, 300, 300);
		ctr.add(lst);
		jmi1.addActionListener(this);
		jfr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{		jfr.dispose(); 	}
	public void valueChanged(TreeSelectionEvent e)
	{
		try{  	Object obj = e.getNewLeadSelectionPath().getLastPathComponent();
		//JOptionPane.showMessageDialog(ctr, "" + obj.toString().length()); 
		jtf.setText(e.getNewLeadSelectionPath().toString()); listModel.addElement(obj.toString());
		} 
		catch(Exception e1)
		{ 	}
	}
	public static void main(String []argv)
	{
		MyExplore myExp = new MyExplore();
	}
}
