import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class addition implements ActionListener
{
	String v1,v2,st1;
	JLabel jl1=new JLabel("Enter the first number");
	JLabel jl2=new JLabel("Enter the second number");
	JLabel jl3=new JLabel("Result");

	JTextField t1=new JTextField(8);
	JTextField t2=new JTextField(8);
	JTextField t3=new JTextField(20);
	JButton b1=new JButton("add");
	JButton b2=new JButton("sub");
	JButton b3=new JButton("mul");
	JButton b4=new JButton("div");
addition()
{
	JFrame jf=new JFrame();
	jf.setSize(300,300);
	jf.setVisible(true);
	jf.setTitle("Calculator GUI");
	jf.setLayout(new FlowLayout());
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.add(jl1);
	jf.add(t1);
	jf.add(jl2);
	jf.add(t2);
	jf.add(jl3);
	jf.add(t3);
	jf.add(b1);
	jf.add(b2);
	jf.add(b3);
	jf.add(b4);
	t3.setEditable(false);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
    b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	st1=ae.getActionCommand();
	v1=t1.getText();
	v2=t2.getText();
	int i1,i2,c;
	String s;
	if(st1.equals("add"))
	{
		i1=Integer.parseInt(v1);
		i2=Integer.parseInt(v2);
		c=i1+i2;
		s=Integer.toString(c);
		t3.setText(s);
	}	if(st1.equals("sub"))
	{
		i1=Integer.parseInt(v1);
		i2=Integer.parseInt(v2);
		c=i1-i2;
		s=Integer.toString(c);
		t3.setText(s);
	}
		if(st1.equals("mul"))
	{
		i1=Integer.parseInt(v1);
		i2=Integer.parseInt(v2);
		c=i1*i2;
		s=Integer.toString(c);
		t3.setText(s);
	}
		if(st1.equals("div"))
	{
		i1=Integer.parseInt(v1);
		i2=Integer.parseInt(v2);
		c=i1/i2;
		s=Integer.toString(c);
		t3.setText(s);
	}
	

}
public static void main(String args[])
{
	addition a1=new addition();

}
}
