package Gui;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator {

	public static void main(String args[])
	{
		Abx ob=new Abx();
	}
	
}
class Abx extends JFrame implements ActionListener
{
	double Total=0;
	String sfirst="",soperator="",ssecond="";
	JTextField t1;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bequal,bplus,bminus,bdivide,bpercent,bdel,bd;
	public Abx()
	{
		Font font1 = new Font("SansSerif", Font.BOLD, 45);
		t1=new JTextField(6);
		t1.setPreferredSize(new Dimension(22,70));
        bd=new JButton(".");
        bd.setPreferredSize(new Dimension(75,70));
        bd.setBackground(Color.gray);
        bd.setForeground(Color.white);
		b1=new JButton("1");
		b1.setPreferredSize(new Dimension(75,70));
		b1.setFont(font1);
		b1.setBackground(Color.gray);
		b1.setForeground(Color.white);
		b2=new JButton("2");
		b2.setPreferredSize(new Dimension(75,70));
		b2.setBackground(Color.gray);
		b2.setForeground(Color.white);
		b3=new JButton("3");
		b3.setPreferredSize(new Dimension(75,70));
		b3.setBackground(Color.gray);
		b3.setForeground(Color.white);
		b4=new JButton("4");
		b4.setPreferredSize(new Dimension(75,70));
		b4.setBackground(Color.gray);
		b4.setForeground(Color.white);
		b5=new JButton("5");
		b5.setPreferredSize(new Dimension(75,70));
		b5.setBackground(Color.gray);
		b5.setForeground(Color.white);
		b6=new JButton("6");
		b6.setPreferredSize(new Dimension(75,70));
		b6.setBackground(Color.gray);
		b6.setForeground(Color.white);
		b7=new JButton("7");
		b7.setPreferredSize(new Dimension(75,70));
		b7.setBackground(Color.gray);
		b7.setForeground(Color.white);
		b8=new JButton("8");
		b8.setPreferredSize(new Dimension(75,70));
		b8.setBackground(Color.gray);
		b8.setForeground(Color.white);
		b9=new JButton("9");
		b9.setPreferredSize(new Dimension(75,70));
		b9.setBackground(Color.gray);
		b9.setForeground(Color.white);
		b0=new JButton("0");
		b0.setPreferredSize(new Dimension(75,70));
		b0.setBackground(Color.gray);
		b0.setForeground(Color.white);
		bdel=new JButton("C");
		bdel.setPreferredSize(new Dimension(115,70));
		bdel.setBackground(Color.gray);
		bdel.setForeground(Color.white);
		bequal=new JButton("=");
		bequal.setPreferredSize(new Dimension(115,70));
		bequal.setBackground(Color.gray);
		bequal.setForeground(Color.white);
		bplus=new JButton("+");
		bplus.setPreferredSize(new Dimension(75,70));
		bplus.setBackground(Color.gray);
		bplus.setForeground(Color.white);
		bdivide=new JButton("/");
		bdivide.setPreferredSize(new Dimension(75,70));
		bdivide.setBackground(Color.gray);
		bdivide.setForeground(Color.white);
		bpercent=new JButton("%");
		bpercent.setPreferredSize(new Dimension(75,70));
		bpercent.setBackground(Color.gray);
		bpercent.setForeground(Color.white);
		bminus=new JButton("-");
		bminus.setPreferredSize(new Dimension(75,70));
		bminus.setBackground(Color.gray);
		bminus.setForeground(Color.white);
		
		b0.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
		b4.setFont(font1);
		b5.setFont(font1);
		b6.setFont(font1);
		b7.setFont(font1);
		b8.setFont(font1);
		b9.setFont(font1);
		bequal.setFont(font1);
		bdel.setFont(font1);
		bminus.setFont(font1);
		bplus.setFont(font1);
		bdivide.setFont(font1);
		bpercent.setFont(font1);
		bd.setFont(font1);
		
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(bdivide);
		add(b0);
		add(bminus);
		add(bd);
		add(bplus);
		add(bpercent);
		add(bequal);
		add(bdel);
		
		//Font font1 = new Font("SansSerif", Font.BOLD, 45);
		        t1.setFont(font1);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bd.addActionListener(this);
		bminus.addActionListener(this);
		bplus.addActionListener(this);
		bdivide.addActionListener(this);
		bpercent.addActionListener(this);
		bdel.addActionListener(new ActionListener()
				{

					
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()==bdel) {
							t1.setText("");
					    soperator="";
					    sfirst="";
					    ssecond="";
					    Total=0;
					
					}
					}
			
				});
		bequal.addActionListener(this);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(280,570);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	public void actionPerformed(ActionEvent e) 
	{
		String s=e.getActionCommand();
		//t1.setText(t1.getText()+s);
		if(s.charAt(0)!='=') {
			t1.setText(t1.getText()+s);
	     if((s.charAt(0)>='0' && s.charAt(0)<='9')||s.charAt(0)=='.')
	     {
	    	 sfirst=sfirst+s;
	     }else{
	    	 ssecond=sfirst;
	    	 soperator=soperator+s;
	    	 sfirst="";
	     }
		}else{
			if(soperator.charAt(0)=='+') {
			Total=Double.parseDouble(ssecond) + Double.parseDouble(sfirst);
			t1.setText(String.format("%.2f",Total)+" ");
			}
			else if(soperator.charAt(0)=='-') {
	    		Total=Double.parseDouble(ssecond) - Double.parseDouble(sfirst);
	    		t1.setText(String.format("%.2f",Total)+" ");
			}else if(soperator.charAt(0)=='/') {
	    		Total=Double.parseDouble(ssecond) / Double.parseDouble(sfirst);
			t1.setText(String.format("%.2f",Total)+" ");
		}else if(soperator.charAt(0)=='%') {
	    		Total=Double.parseDouble(ssecond) % Double.parseDouble(sfirst);
	    		t1.setText(String.format("%.2f",Total)+" ");
	     }
		sfirst=Total+"";
    	soperator="";
    	Total=0;
	    	}
		
}
}



	
	

