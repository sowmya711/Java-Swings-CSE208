import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class swingdemo1 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{

	}
public static void main(String a[])
{
JFrame jf=new JFrame();
jf.setTitle("Swing Demo");
jf.setSize(1100,1100);
jf.setVisible(true);
jf.setLayout(new FlowLayout());
JTextArea l1=new JTextArea(12,12); 
ImageIcon i1=new ImageIcon("star.jpg");
JButton b1=new JButton("Click here");
JButton b2=new JButton("STAR",i1);
jf.add(l1);
jf.add(b1);
jf.add(b2);
b2.setDisabledIcon(i1);
b2.setRolloverIcon(new ImageIcon("logo.png"));

b1.setEnabled(true);
b1.addActionListener();

jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

int s=l1.getLineCount();
System.out.println(s);

}
}