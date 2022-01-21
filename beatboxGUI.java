//beatbox gui
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class beatbox implements ActionListener
{  
 ArrayList<JCheckBox> buttonlist;
String instrument[]={"Bass Drum","Crash Cymbal","Acoustic Snare","Hand Clap","Hi Bongo","Whistle","Maracas"};
JFrame jf=new JFrame();
JPanel mainPanel;
JButton jb1=new JButton("Start");
JButton jb2=new JButton("Stop");
JButton jb3=new JButton("Tempo Up");
JButton jb4=new JButton("Tempo Down");
public beatbox()

{
	
	
	buttonlist =new ArrayList<JCheckBox>() ;
	jf.setTitle("Beatbox GUI");
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	BorderLayout layout=new BorderLayout();
	JPanel background=new JPanel(layout);
	background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
     
	jf.setLayout(new FlowLayout());
	


	Box nameBox = new Box (BoxLayout.Y_AXIS) ;
	background.add (BorderLayout.WEST, nameBox);
	jf.getContentPane().add(background);
	GridLayout grid = new GridLayout(7,7) ;
	grid.setVgap (1) ;
	grid.setHgap (2) ;
    mainPanel = new JPanel(grid) ;
    background. add(BorderLayout. CENTER,mainPanel);

    	for (int i = 0; i < 7; i++) 
	{
		nameBox .add(new Label (instrument[i]));
	}
		jf.add(nameBox);
	for (int i = 0; i < 49; i++) 
	{
        JCheckBox c = new JCheckBox();
       
		c.setSelected(false);
		buttonlist.add(c);
		mainPanel.add(c);
}

Box buttonbox= new Box(BoxLayout.X_AXIS);
buttonbox.add(jb1);
buttonbox.add(jb2);
buttonbox.add(jb3);
buttonbox.add(jb4);
jb1.addActionListener(this);
jb2.addActionListener(this);
background.add(BorderLayout.SOUTH,buttonbox) ;
jf.setBounds(50,50,400,400);
mainPanel.setBackground(Color.BLACK);
jf.add(mainPanel);

jf.setVisible(true);
}
public void actionPerformed(ActionEvent ie)
{   if(ie.getSource()==jb1)
	jf.setTitle("Now Track Playing..");
	else
	jf.setTitle("Track Stopped");	


}
	public static void main(String args[]) throws Exception
	{
	beatbox b1=new beatbox();
	}
}
