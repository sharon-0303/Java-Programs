/*<applet code = "Ccalculator" width = 300 height = 300>
</applet>
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class Ccalculator extends JApplet implements ActionListener
{
JTextField jft = new JTextField();
Container ctr = getContentPane();
int operate=0;

JButton AC = new JButton("AC");	
JButton plus = new JButton("+");	
JButton minus = new JButton("-");	
JButton mul = new JButton("*");	
JButton div = new JButton("/");	
JButton mod = new JButton("%");

JButton zero = new JButton("0");
JButton one = new JButton("1");
JButton two = new JButton("2");
JButton three = new JButton("3");
JButton four = new JButton("4");
JButton five = new JButton("5");
JButton six = new JButton("6");
JButton seven = new JButton("7");
JButton eight = new JButton("8");
JButton nine = new JButton("9");	


JButton equ = new JButton("=");	

Integer op1 = new Integer(0);
Integer op2 = new Integer(0);
Integer res = new Integer(0);

Frame fr;
/* JMenuBar jbr = new JMenuBar();
JMenu jmu = new JMenu("File");
JMenuItem jtm = new JMenuItem("Close"); */

public void init()
{
fr = (Frame)this.getParent().getParent();
fr.setTitle("My Calculator");
setLayout(null);

/* jmu.add(jtm);
jbr.add(jmu);
setJMenuBar(jbr);

jtm.addActionListener(this); */


jft.setHorizontalAlignment(SwingConstants.RIGHT);

jft.setText("0");
jft.requestFocus();
 	jft.setCaretPosition((jft.getText()).length());

jft.setBounds(10,10, 280, 25);
ctr.add(jft);	

AC.setBounds(10, 40, 50, 20);
ctr.add(AC);	
AC.addActionListener(this);

plus.setBounds(60, 40, 50, 20);
ctr.add(plus);	
plus.addActionListener(this);

minus.setBounds(110, 40, 50, 20);
ctr.add(minus);	
minus.addActionListener(this);

mul.setBounds(160, 40, 50, 20);
ctr.add(mul);	
mul.addActionListener(this);

div.setBounds(210, 40, 50, 20);
ctr.add(div);	
div.addActionListener(this);

mod.setBounds(260,40,50,20);
ctr.add(mod);
mod.addActionListener(this);


   zero.setBounds(10, 60, 50, 20);
ctr.add(zero);	
zero.addActionListener(this);

one.setBounds(60, 60, 50, 20);
ctr.add(one);	
one.addActionListener(this);

two.setBounds(110, 60, 50, 20);
ctr.add(two);	
two.addActionListener(this);

three.setBounds(160, 60, 50, 20);
ctr.add(three);	
three.addActionListener(this);

four.setBounds(210, 60, 50, 20);
ctr.add(four);	
four.addActionListener(this);


five.setBounds(260, 60, 50, 20);
ctr.add(five);	
five.addActionListener(this);

six.setBounds(10, 80, 50, 20);
ctr.add(six);	
six.addActionListener(this);

seven.setBounds(60, 80, 50, 20);
ctr.add(seven);	
seven.addActionListener(this);

eight.setBounds(110, 80, 50, 20);
ctr.add(eight);	
eight.addActionListener(this);

nine.setBounds(160, 80, 50, 20);
ctr.add(nine);	
nine.addActionListener(this);


equ.setBounds(210, 80, 50, 20);
ctr.add(equ);	
equ.addActionListener(this);


}
public void actionPerformed(ActionEvent ae)
{
      String cmd = ae.getActionCommand();
  
  switch(cmd)
  {
  case "AC": jft.setText("0");jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
 break;
  
  case "0":
if (!jft.getText().equals("0"))
jft.setText(jft.getText()+"0");

jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;

case "1":
if (jft.getText().equals("0"))
jft.setText("1");
else
jft.setText(jft.getText()+"1");

jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;

case "2":
if (jft.getText().equals("0"))
jft.setText("2");
else
jft.setText(jft.getText()+"2");

jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;	
case "3":
if (jft.getText().equals("0"))
jft.setText("3");
else
jft.setText(jft.getText()+"3");

jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;	
case "4":
if (jft.getText().equals("0"))
jft.setText("4");
else
jft.setText(jft.getText()+"4");

jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;	
case "5":
if (jft.getText().equals("0"))
jft.setText("5");
else
jft.setText(jft.getText()+"5");

jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;	
                case "6":
if (jft.getText().equals("0"))
jft.setText("6");
else
jft.setText(jft.getText()+"6");

jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;
                case "7":
if (jft.getText().equals("0"))
jft.setText("7");
else
jft.setText(jft.getText()+"7");

jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;	
case "8":
if (jft.getText().equals("0"))
jft.setText("8");
else
jft.setText(jft.getText()+"8");

jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;
                case "9":
if (jft.getText().equals("0"))
jft.setText("9");
else
jft.setText(jft.getText()+"9");

jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;	




case "+":
operate=1;
op1 = Integer.parseInt(jft.getText());
jft.setText("0");
jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;

case "-":
operate=2;
op1 = Integer.parseInt(jft.getText());
jft.setText("0");
jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;
case "*":	
operate=3;
op1 = Integer.parseInt(jft.getText());
jft.setText("0");
jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;
case "/":	
operate=4;
op1 = Integer.parseInt(jft.getText());
jft.setText("0");
jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;
        case "%":
                       operate=5;
                        op1=Integer.parseInt(jft.getText());
                        jft.setText("0");
                     	jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;	

case "=":
op2 = Integer.parseInt(jft.getText());
if(operate == 1)

res = op1 + op2;
else if(operate == 2)
res=op1-op2;
else if(operate == 3)
res=op1*op2;
else if(operate == 4)
res=op1/op2;
else if(operate == 5)
res=op1%op2;


jft.setText(res.toString()); op1 = 0; op2= 0;
jft.requestFocus();jft.setCaretPosition((jft.getText()).length());
break;
  default:
  
  }
}
}