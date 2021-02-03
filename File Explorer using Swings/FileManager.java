/*
Author: SHARON P JOSEPH
Added JFileChooser for open menu item
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.filechooser.*;
import java.io.File;
class FileManager implements TreeSelectionListener, ActionListener
{
    String pathToFileOnDisk = "logo.png";
	JFrame jfr = new JFrame("File Explorer");
	JTree jt = new JTree();
	Container ctr = new Container();
	JTextField jtf = new JTextField("");
	JMenuBar jmr = new JMenuBar();
	JMenu jmu = new JMenu("File");
	JMenuItem jmi1 = new JMenuItem("Close");
	JMenuItem jmi2 = new JMenuItem("Open");
	DefaultListModel <String> listModel = new DefaultListModel<>();
	JList <String> lst = new JList<>(listModel);
	JTree tree;
	
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("Types of Cuisines");	
	DefaultMutableTreeNode root4 = new DefaultMutableTreeNode("Mexican");
		DefaultMutableTreeNode top14 = new DefaultMutableTreeNode("Horchata");
		DefaultMutableTreeNode top15 = new DefaultMutableTreeNode("Chicken Tamales");
		
	
	DefaultMutableTreeNode root5 = new DefaultMutableTreeNode("Italian");
		DefaultMutableTreeNode top51 = new DefaultMutableTreeNode("Spaghetti all'Amatriciana");
		DefaultMutableTreeNode top52 = new DefaultMutableTreeNode("Lasagne Alla Bolognese Saporite");
	
	DefaultMutableTreeNode root1 = new DefaultMutableTreeNode("Indian");
		DefaultMutableTreeNode top11 = new DefaultMutableTreeNode("Andra");
			DefaultMutableTreeNode tchild11 = new DefaultMutableTreeNode("Atukulu");
			DefaultMutableTreeNode tchild12 = new DefaultMutableTreeNode("Sakinalu ");	
		DefaultMutableTreeNode top12 = new DefaultMutableTreeNode("Kerala");
			DefaultMutableTreeNode tchild121 = new DefaultMutableTreeNode("Kozhikodan Halwa");
			DefaultMutableTreeNode tchild122 = new DefaultMutableTreeNode("Thalassery Biriyani");	
	
	DefaultMutableTreeNode root2 = new DefaultMutableTreeNode("Thai Food");
	DefaultMutableTreeNode root3 = new DefaultMutableTreeNode("Chinese");	
		DefaultMutableTreeNode top31 = new DefaultMutableTreeNode("Chow mein");
		DefaultMutableTreeNode top32 = new DefaultMutableTreeNode("Zhajiangmian");
	
	DefaultMutableTreeNode top1 = new DefaultMutableTreeNode("Japanese");
		DefaultMutableTreeNode tpchild11 = new DefaultMutableTreeNode("Rice dishes ");
			DefaultMutableTreeNode tpchild112 = new DefaultMutableTreeNode("Rice");
				DefaultMutableTreeNode tpchild113 = new DefaultMutableTreeNode("Hayashi rice");
				DefaultMutableTreeNode tpchild114 = new DefaultMutableTreeNode("Kamameshi");
		DefaultMutableTreeNode tpchild12 = new DefaultMutableTreeNode("Drivers");			
		DefaultMutableTreeNode tchild13 = new DefaultMutableTreeNode("Other Staples ");
			DefaultMutableTreeNode tchild131 = new DefaultMutableTreeNode("Noodles");
				DefaultMutableTreeNode tchild1311 = new DefaultMutableTreeNode("Ramen");
				DefaultMutableTreeNode tchild1312 = new DefaultMutableTreeNode("Hiyashi chūka ");
			DefaultMutableTreeNode tchild132 = new DefaultMutableTreeNode("Bread");
			DefaultMutableTreeNode tchild133 = new DefaultMutableTreeNode("Deep-fried dishes");
				DefaultMutableTreeNode tchild1331 = new DefaultMutableTreeNode("Agemono");			
		DefaultMutableTreeNode tchild14 = new DefaultMutableTreeNode("Kushikatsu ");
		DefaultMutableTreeNode tchild15 = new DefaultMutableTreeNode("Satsuma-age");
		DefaultMutableTreeNode tchild16 = new DefaultMutableTreeNode("Tempura");
		DefaultMutableTreeNode tchild17 = new DefaultMutableTreeNode("Kakiage");
	
	DefaultMutableTreeNode top2 = new DefaultMutableTreeNode("Moroccan");
		DefaultMutableTreeNode tchild21 = new DefaultMutableTreeNode("Salads");
		DefaultMutableTreeNode tchild22 = new DefaultMutableTreeNode("Main Dishes");
			DefaultMutableTreeNode tchild221 = new DefaultMutableTreeNode("Baghrir");
			DefaultMutableTreeNode tchild222 = new DefaultMutableTreeNode("Briouat");
				DefaultMutableTreeNode tchild2221 = new DefaultMutableTreeNode("Brochette Boulfaf");
				DefaultMutableTreeNode tchild2222 = new DefaultMutableTreeNode("Couscous");
			
	DefaultMutableTreeNode top3 = new DefaultMutableTreeNode("Mediterranean Cuisine");
	
	
	FileManager()
		{
		try
			{
			ImageIcon img = new ImageIcon(pathToFileOnDisk);
			jfr.setIconImage(img.getImage());
			jfr.setLayout(null);
			jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			jfr.setSize(700,600);
			ctr = jfr.getContentPane();
/* Add menu bar */
			jmu.add(jmi1);
			jmu.add(jmi2);
			jmr.add(jmu);
			jmr.setBounds(10, 10, 600, 30);
			ctr.add(jmr);
			jtf.setBounds(50, 40, 600, 20);
			ctr.add(jtf);

			root.add(root4);root.add(root5);root.add(root1); root.add(root2); root.add(root3);			
			root.add(top1); root.add(top2);root.add(top3);
			
			root5.add(top51);root5.add(top52);
			root4.add(top14);root4.add(top15);
			root3.add(top31);root3.add(top32);
			
			root1.add(top11); root1.add(top12);

			top11.add(tchild11);top11.add(tchild12);
			top12.add(tchild121);top12.add(tchild122);
			
			
			top1.add(tpchild11);
				tpchild11.add(tpchild112);
					tpchild112.add(tpchild113);tpchild112.add(tpchild114);					
			top1.add(tchild13);
				tchild13.add(tchild131);
				tchild131.add(tchild1311);tchild131.add(tchild1312);
				tchild13.add(tchild132);
				tchild13.add(tchild133);
					tchild133.add(tchild1331);
			top1.add(tchild14);top1.add(tchild15);	
			top1.add(tchild16);top1.add(tchild17);
			
			
			top2.add(tchild21);
				top2.add(tchild22);
					tchild22.add(tchild221);tchild22.add(tchild222);
						tchild222.add(tchild2221);tchild222.add(tchild2222);
						
			tree = new JTree(root);
			tree.setBounds(10, 150, 200, 300);
			ctr.add(tree);
			tree.addTreeSelectionListener(this);

			lst.setBounds(350, 150, 300, 300);
			ctr.add(lst);
			jmi1.addActionListener(this);
			jmi2.addActionListener(this);
			jfr.setVisible(true);
			}
		catch(Exception ae)
		{
		System.out.println(ae.getMessage());
		}
		}
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();
		if(cmd=="Close")
		{
			jfr.dispose();
		}
		if(cmd=="Open")
		{
			final JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION)
			{
                File file = fc.getSelectedFile();				
				JOptionPane.showMessageDialog(jfr, "Command: " +  file.getPath());
				
			 }
			
		}
    }
	public void valueChanged(TreeSelectionEvent e)
	{
		try{  
			DefaultMutableTreeNode sel = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
			String str=e.getNewLeadSelectionPath().toString();
			String str1=str.replace(',','\\');
			str1=str1.replace('[',' ');
			str1=str1.replace(']',' ');
			jtf.setText(str1);
			listModel.clear();
//System.out.println(sel.getChildCount());
//Enumeration <DefaultMutableTreeNode> children =  sel.children();
			Enumeration children =  sel.children();
			DefaultMutableTreeNode child = null;
//listModel.addElement(sel.toString());
			while (children.hasMoreElements() )
			{
				child = (DefaultMutableTreeNode) children.nextElement();
				listModel.addElement(child.toString());
			}
//listModel.addElement(obj.toString());
			}
		catch(Exception ae)
			{
			System.out.println(ae.getMessage());
			}
		}
	public static void main(String []argv)
	{
		try{
			FileManager myExp = new FileManager();
			}
		catch(Exception ae)
			{
			System.out.println(ae.getMessage());
			}
	}
}
	
