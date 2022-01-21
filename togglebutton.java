import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class togglebutton implements ItemListener
{
	JLabel j1=new JLabel("Student form");
	JToggleButton jtb1=new JToggleButton("Are you a student?if no why are u here");
	public togglebutton()
{
	JFrame jf=new JFrame();
	jf.setTitle("Student form maari edho");
	jf.setSize(500,500);
	jf.setVisible(true);
	jf.setLayout(new FlowLayout());
	jf.add(j1);
	jf.add(jtb1);
	jtb1.addItemListener(this);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

}
public void itemStateChanged(ItemEvent ie)
{
	if(jtb1.isSelected())
		j1.setForeground(Color.red);
}
public static void main(String args[])
{
togglebutton tb=new togglebutton();	
}
}