import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class Human
{
	String name;
	int count,id;
	Human(String name, int count, int id)
	{
		this.name = name;
		this.count = count;
		this.id = id;
	}

	Human()
	{
	
	}
}
class Goalkeeper extends Human
{
	int stopping_shots,stoprate;

Goalkeeper(String name, int count, int id, int Total_stopping_shots)
	{
		super(name, count, id);
		this.stopping_shots = Total_stopping_shots;
		this.stoprate = Total_stopping_shots/count;
	}

	Goalkeeper()
	{
	
	}


}
class FieldPlayer extends Human
{
	int goalcount;
	FieldPlayer(String name, int count, int id, int goalcount)
	{
		super(name, count, id);
		this.goalcount = goalcount;
	}

	FieldPlayer()
	{

	}
}

class Ude extends Exception
{
	Ude()
	{
		
	}
}
class Football implements ActionListener
{   JFrame jf=new JFrame();
    JTextField t1,t2,t3,t4;
    JTextArea a1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JRadioButton rb1,rb2;
         ArrayList <FieldPlayer> Arraylist1 =new ArrayList <FieldPlayer>();  
    ArrayList <Goalkeeper> Arraylist2=new ArrayList <Goalkeeper>();
    Football()
    {
    jf.setTitle("Student Details");
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(1000,1000);
	  jf.setLayout(null);
    jf.setVisible(true);
	JLabel l1=new JLabel(" Name");
	l1.setBounds(50, 50, 100, 30);
	JLabel l2=new JLabel("ID");
	l2.setBounds(50, 190, 50, 30);
	JLabel l3=new JLabel("Matching Count");
	l3.setBounds(420, 50, 70, 30);
	JLabel l4=new JLabel("Stopping Shots/Goals Count");
	l4.setBounds(420, 190, 140, 30);

	rb1=new JRadioButton("Field player");
	rb1.setBounds(50, 330, 140, 30);
	rb2=new JRadioButton("Goalie");
	rb2.setBounds(200, 330, 140, 30);
  
	t1 = new JTextField();
  t1.setBounds(150, 50, 100, 30);
  t2 = new JTextField();
  t2.setBounds(150, 190, 130, 30);
  t3 = new JTextField();
  t3.setBounds(530, 50, 130, 30);
  t4 = new JTextField();
  t4.setBounds(530, 190, 130, 30);
  a1=new JTextArea();
  a1.setBounds(50,450,300,200);

  b1=new JButton("Insert");
  b1.setBounds(50, 290, 100, 30);
  b2=new JButton("Search");
  b2.setBounds(150, 290,100, 30);
  b3=new JButton("Best Player");
  b3.setBounds(250, 290,100, 30);
  b4=new JButton("<<");
  b4.setBounds(350, 290,100, 30);
  b5=new JButton(">");
  b5.setBounds(450, 290,100, 30);
  b6=new JButton(">");
  b6.setBounds(550, 290,100, 30);
  b7=new JButton(">>");
  b7.setBounds(650, 290,100, 30);

  b1.addActionListener(this);
  rb1.addActionListener(this);
  rb2.addActionListener(this);
  

  jf.add(l1);
	jf.add(l2);
	jf.add(l3);
  jf.add(l4);
  jf.add(t1);
  jf.add(t2);
  jf.add(t3);
  jf.add(t4);
  jf.add(rb1);
  jf.add(rb2);
  jf.add(a1);
  jf.add(b1);
	jf.add(b2);
	jf.add(b3);
  jf.add(b4);
  jf.add(b5);
	jf.add(b6);
	jf.add(b7);
  

    }

  public void actionPerformed(ActionEvent e)
  {
    String string1 = t1.getText();
    String string2 = t2.getText();
    String string3 = t3.getText();
    String string4 = t4.getText(); 
    if(e.getSource()==b1)
    {
    if(rb1.isSelected())
    { 
    FieldPlayer p=new FieldPlayer(string1,Integer.parseInt(string2),Integer.parseInt(string3),Integer.parseInt(string4));
   

    Arraylist1.add(p);


    }

    else if(rb2.isSelected())
    { 
   
    Goalkeeper g=new Goalkeeper(string1,Integer.parseInt(string2),Integer.parseInt(string3),Integer.parseInt(string4));

    Arraylist2.add(g);
    }

    t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
   
   }

   if(e.getSource()==b2)
   {
   	a1.setText("");
   	for(int i=0;i<Arraylist1.size();i++)
   	{
   		FieldPlayer fobj=Arraylist1.get(i);
   		if(fobj.id==Integer.parseInt(t2.getText()))
   		 a1.setText(fobj.name+":"+fobj.id+":"+fobj.count);
   	}

   	for(int i=0;i<Arraylist2.size();i++)
   	{
   		Goalkeeper fobj2=Arraylist2.get(i);
   		if(fobj2.id==Integer.parseInt(t2.getText()))
   			a1.setText(fobj2.name+":"+fobj2.id+":"+fobj2.count);
   	}

   }

}
	public static void main(String args[])
	{
		Football f=new Football();

	}
}
