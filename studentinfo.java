import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class studentinfo implements ActionListener
{  JFrame jf=new JFrame();
   
   JButton b1,b2;   

 JTextField t1,t2,t3,t4;
studentinfo()
  {
    jf.setTitle("Student Details");
    
   
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(1000,1000);
	
	jf.setLayout(null);
	JLabel l1=new JLabel("Student Name");
	l1.setBounds(50, 50, 100, 30);
	JLabel l2=new JLabel("Reg no");
	l2.setBounds(50, 190, 50, 30);
	JLabel l3=new JLabel("Mobile No");
	l3.setBounds(420, 50, 70, 30);
	JLabel l4=new JLabel("Year of Graduation");
	l4.setBounds(420, 190, 140, 30);
	
	 t1 = new JTextField();
        t1.setBounds(150, 50, 100, 30);
        t2 = new JTextField();
        t2.setBounds(150, 190, 130, 30);
        t3 = new JTextField();
        t3.setBounds(530, 50, 130, 30);
         t4 = new JTextField();
        t4.setBounds(530, 190, 130, 30);
         b1=new JButton("Submit");
        b1.setBounds(50, 290, 100, 30);
       b2=new JButton("Clear");
        b2.setBounds(50, 290, 100, 30);
 b1.addActionListener(this);
	jf.add(l1);
	jf.add(l2);
	jf.add(l3);
    jf.add(l4);
    jf.add(t1);
  jf.add(t2);
    jf.add(t3);
    jf.add(t4);
   
    jf.add(b1);
    jf.add(b2);


	
	 jf.setVisible(true);

	
  }
 

 public void actionPerformed(ActionEvent e)
  {
    String string1 = t1.getText();
    String string2 = t2.getText();
    String string3 = t3.getText();
    String string4 = t4.getText();
    if(e.getSource()==b1)
    {
        try{
        	FileWriter f1 = new FileWriter("filename.txt");
            f1.write(string1);
            f1.write(string2);
            f1.write(string3);
            f1.write(string4);
            f1.close();

    	}
    	catch (IOException ex) {
      System.out.println("An error occurred.");
      
    }
    }
  }
  public static void main(String args[])
  {
     studentinfo s=new studentinfo();
  }
	
}
