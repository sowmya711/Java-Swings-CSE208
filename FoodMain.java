//prog to store customer food purchases and implement in GUI
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.event.ListSelectionListener;
class Free
{
	int Icecream=0,Milkshake=0;
	void freeIceream()
	{   //increment icecream count
		Icecream++;
	
	}
	void freeMilkshake()
	{   //increment milkshake count
		Milkshake++;
	}
}
class Food extends Free
{
	int type;
}
class Buyer extends Food
{
    int id;
    String name,address;
    int amount;
    Buyer(int id,String name,String address,int amount)
    {
       this.id=id;
       this.name=name;
       this.address=address;
       this.amount=amount;
    }
}
class UserDefinedException extends Exception
{
	UserDefinedException()
	{

	}
	public String toString()
	{
		return "Enter properly";
	}
	
}
//class to create the frame and add components
class foodFrame implements ActionListener,ListSelectionListener
{   
	JFrame jf=new JFrame();
	JLabel cid,cname,caddress,chapathi,juice,idli;
	JTextField cidT,cnameT,caddressT,chapathiT,juiceT,idliT;
    JTextArea current,history;
    JButton purchase_button,report_button;
    JList foodlist,pricelist;
    ArrayList<Buyer> customerArray=new ArrayList<Buyer>();
    int totalamt=0;
    String foods[]={"Chapathi","Juice","Idli"};
  	String price[]={"50","30","40"};
    foodFrame()
    {
    	jf.setTitle("Food GUI");
		jf.setVisible(true);
		jf.setSize(1000,1000);
		jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //adding labels
        cid=new JLabel("Customer ID");
	    cid.setBounds(50, 50, 100, 30);
	    cname=new JLabel(" Name");
	    cname.setBounds(50, 190, 50,30);
	    caddress=new JLabel(" Address");
	    caddress.setBounds(420, 50, 70, 30);
	    chapathi=new JLabel("Chapathi");
	    chapathi.setBounds(700, 50, 100, 30);
	    juice=new JLabel("Juice");
	    juice.setBounds(700,100, 70,30);
	    idli=new JLabel("Idli");
	    idli.setBounds(700, 150, 70, 30);
	  

        //adding textfields 
	    cidT = new JTextField();
  		cidT.setBounds(150, 50, 100, 30);
  		cnameT= new JTextField();
  		cnameT.setBounds(150, 190, 130, 30);
  		caddressT= new JTextField();
  		caddressT.setBounds(530, 50, 130, 30);
  		chapathiT = new JTextField();
  		chapathiT.setBounds(800, 50, 100, 30);
  		juiceT= new JTextField();
  		juiceT.setBounds(800, 100,100, 30);
  		idliT= new JTextField();
  		idliT.setBounds(800, 150,70, 30);
  		


  		//adding buttons
  		purchase_button=new JButton("Purchase");
		purchase_button.setBounds(50, 330, 140, 30);
		report_button=new JButton("Report");
		report_button.setBounds(200, 330, 140, 30);

		//adding text areas
		current=new JTextArea("Current Purchase");
  		current.setBounds(50,450,200,150);
  		history=new JTextArea("Purchase History");
  		history.setBounds(300,450,200,150);

  		//creating listboxes for food and price 
  		
  		foodlist=new JList<String>(foods);
        foodlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        foodlist.setBounds(420,200,100,100);
        pricelist=new JList<String>(price);
        pricelist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        pricelist.setBounds(520,200,100,100);

        //adding all components to the frame
  		jf.add(cid);
	    jf.add(cname);
	    jf.add(caddress);
  		jf.add(cidT);
  		jf.add(cnameT);
  		jf.add(caddressT);
  		jf.add(purchase_button);
  		jf.add(report_button);
  		jf.add(current);
  	    jf.add(history);
  		jf.add(foodlist);
  		jf.add(pricelist);
  		jf.add(chapathi);
  		jf.add(juice);
  		jf.add(idli);
  		jf.add(chapathiT);
  		jf.add(juiceT);
  		jf.add(idliT);
  		

  		//adding actionlisteners for the buttons
  		purchase_button.addActionListener(this);
  	    report_button.addActionListener(this);
  	    pricelist.addListSelectionListener(this);

	     
    }

    //create a function to handle the button click action event 
    public void actionPerformed(ActionEvent e)
    {  
    	
        
    	
        try
        {
        	if(e.getSource()==purchase_button)
        	{   

        		if(chapathiT.getText()==""||juiceT.getText()==""||idliT.getText()=="")
        		throw new UserDefinedException();	
        	
        	//if the purchase button is chosen, inittialise the buyer object and add to the arraylist
            //find the total quantity of purchased items and their price
    	    totalamt=Integer.parseInt(chapathiT.getText())*Integer.parseInt(price[0])+Integer.parseInt(juiceT.getText())*Integer.parseInt(price[1])+Integer.parseInt(idliT.getText())*Integer.parseInt(price[2]);

    		Buyer b=new Buyer(Integer.parseInt(cidT.getText()),cnameT.getText(),caddressT.getText(),totalamt);
    		current.setText(b.id+":"+b.name+":"+b.address+":"+b.amount);
    		customerArray.add(b);

    		//clear the text fields once purchase has been made
    		cidT.setText("");
    		cnameT.setText("");
    		caddressT.setText("");

    		//calcualte no of freebies to be given based on purchase amount
    		if(b.amount>1000&&b.amount<=1500)
    			b.freeIceream();
 			if(b.amount>1500&&b.amount<=2000)
    			b.freeIceream();
    			b.freeIceream();
    		if(b.amount>2000)
    		    b.freeMilkshake();
    		    b.freeIceream();	
           }
       }
           catch(UserDefinedException a)
           {
           	System.out.println("Enter quantity for selected items ");
           	System.out.println(a);
           }
       

    	if(e.getSource()==report_button)
    	{
            for(int i=0;i<=customerArray.size();i++)
         	{
   		  		Buyer bobj=customerArray.get(i);
   				history.append(Integer.toString(bobj.id)+":"+bobj.name+":"+bobj.address);
   			}
    	}
    }

    public void valueChanged(ListSelectionEvent ls)
    {

    }

}
class FoodMain
{
	public static void main(String args[])
	{
        foodFrame ff=new foodFrame();
        

	}
}
