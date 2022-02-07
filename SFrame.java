import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class Product
{
	int id,quantity;
	String name;
	void getDetails(String s,int i,int ii)
	{
         name=s;
         id=i;
         quantity=ii;

	}
}
class SFrame implements ActionListener
{
   JFrame jf=new JFrame();
   JTextField t1,t2,t3,t4;
   JButton b1,b2;
   JTextArea a1;
   SFrame()
   {
   	jf.setTitle("XYZ Store");
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(700,700);
	jf.setVisible(true);
	jf.setLayout(null);
	JLabel l1=new JLabel("Product Name");
	l1.setBounds(50, 50, 100, 30);
	JLabel l2=new JLabel("Product ID");
	l2.setBounds(50, 190, 100, 30);
	JLabel l3=new JLabel("Quantity");
	l3.setBounds(420, 50, 70, 30);

    t1 = new JTextField();
    t1.setBounds(200, 50, 100, 30);
    t2 = new JTextField();
    t2.setBounds(200, 190, 130, 30);
    t3 = new JTextField();
    t3.setBounds(530, 50, 130, 30);
    b1=new JButton("Submit");
    b1.setBounds(50, 290, 100, 30);
    b2=new JButton("Details");
   b2.setBounds(420, 290, 100, 30);
   a1=new JTextArea("Product Details :");
   a1.setBounds(60,320,400,200);
    b1.addActionListener(this);
    b2.addActionListener(this);
    jf.add(l1);
    jf.add(l2);
    jf.add(l3);
    jf.add(t1);
    jf.add(t2);
    jf.add(t3);
    jf.add(b1);
    jf.add(b2);
    jf.add(a1);
    
   }
 public void actionPerformed(ActionEvent e)
  {  String string1 = t1.getText();
    String string2 = t2.getText();
    String string3 = t3.getText();
    if(e.getSource()==b1)
  {
   
    int i1=Integer.parseInt(string2);
    int i2=Integer.parseInt(string3);
    Product p=new Product();
    p.getDetails(string1,i1,i2);
    ArrayList <Product> fd =new ArrayList <Product>();
    fd.add(p);
}
if(e.getSource()==b2)
{
   a1.append(string1+" ");
   a1.append(string2+" ");
   a1.append(string3);

}

 }
   public static void main(String args[])
   {
   	SFrame s=new SFrame();
   
   }
}
