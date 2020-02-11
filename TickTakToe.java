package tickTakToe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class TickTakToe {

	public static void main(String args[])
	{
	Ui ob=new Ui();
	
}
}
class Ui extends JFrame implements ActionListener
{
	int damn=0;
	int point1=0;
	int point2=0;
	char a[][]=new char[3][3];
	int k=1;
	String set="";
JButton b00,b01,b02,b10,b11,b12,b20,b21,b22,breset,bexit;
JLabel lplayer1,lplayer2;
JTextField lplayer1score,lplayer2score;
public Ui()
{
	bexit=new JButton("Exit");
	bexit.setPreferredSize(new Dimension(120,90));
	breset=new JButton("Reset");
	breset.setPreferredSize(new Dimension(120,90));
	b00=new JButton("");
	b00.setPreferredSize(new Dimension(120,120));
	b01=new JButton("");
	b01.setPreferredSize(new Dimension(120,120));
	b02=new JButton("");
	b02.setPreferredSize(new Dimension(120,120));
	b10=new JButton("");
	b10.setPreferredSize(new Dimension(120,120));
	b11=new JButton("");
	b11.setPreferredSize(new Dimension(120,120));
	b12=new JButton("");
	b12.setPreferredSize(new Dimension(120,120));
	b20=new JButton("");
	b20.setPreferredSize(new Dimension(120,120));
	b21=new JButton("");
	b21.setPreferredSize(new Dimension(120,120));
	b22=new JButton("");
	b22.setPreferredSize(new Dimension(120,120));
	Font font1=new Font("",Font.BOLD,22);
	Font font2=new Font("",Font.BOLD,25);
	lplayer1=new JLabel("Player1:");
	lplayer2=new JLabel("Player2:");
	lplayer1.setFont(font1);
	lplayer2.setFont(font1);
	lplayer1score=new JTextField(2);
	lplayer1score.setFont(font2);
	lplayer2score=new JTextField(2);
	lplayer2score.setFont(font2);
	lplayer1score.setEditable(false);
	lplayer2score.setEditable(false);
	
	JPanel ob1=new JPanel();
	JPanel ob2=new JPanel();
	JPanel ob3=new JPanel();
	ob1.setPreferredSize(new Dimension(370,360));
	ob1.setBackground(Color.LIGHT_GRAY);
	ob2.setPreferredSize(new Dimension());
	ob2.setPreferredSize(new Dimension(370,100));
	ob2.setBackground(Color.LIGHT_GRAY);
	ob1.setLayout(new GridLayout(3,3));
	ob3.setPreferredSize(new Dimension(370,35));
	add(ob3);
	add(ob1);
	add(ob2);
	ob3.setLayout(new FlowLayout());
	ob3.add(lplayer1);
	ob3.add(lplayer1score);
	ob3.add(lplayer2);
	ob3.add(lplayer2score);
	
	
	ob1.add(b00);
	ob1.add(b01);
	ob1.add(b02);
	ob1.add(b10);
	ob1.add(b11);
	ob1.add(b12);
	ob1.add(b20);
	ob1.add(b21);
	ob1.add(b22);
	ob2.add(breset);
	ob2.add(bexit);
	
	setTitle("Jai Mata Di Lets Play");
	setLayout(new FlowLayout());
	setSize(400,550);
	setVisible(true);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocation(600, 200);
	
	
	b00.addActionListener(this);
	b01.addActionListener(this);
	b02.addActionListener(this);
	b10.addActionListener(this);
	b11.addActionListener(this);
	b12.addActionListener(this);
	b20.addActionListener(this);
	b21.addActionListener(this);
	b22.addActionListener(this);
	breset.addActionListener(this);
	bexit.addActionListener(this);
	
}
public void actionPerformed(ActionEvent e)
{
	
	boolean playing=true;
	String cros="X";
	String zero="O";
	Font font1=new Font("",Font.BOLD,70);
	
	if(k%2==0) {
		set=zero;
		k++;
	}else {
		set=cros;
		k++;
	}
		if(e.getSource()==b00)
		{
			if(set.charAt(0)=='X')
				b00.setForeground(Color.RED);
			else
				b00.setForeground(Color.BLUE);
			b00.setText(set);
			b00.setFont(font1);
			a[0][0]=set.charAt(0);
			WinStatus(0,0,set);
		}
			if(e.getSource()==b01)
			{
				if(set.charAt(0)=='X')
					b01.setForeground(Color.RED);
				else
					b01.setForeground(Color.BLUE);
				b01.setText(set);
				b01.setFont(font1);
				a[0][1]=set.charAt(0);
				WinStatus(0,1,set);
			}
				if(e.getSource()==b02)
				{
					if(set.charAt(0)=='X')
						b02.setForeground(Color.RED);
					else
						b02.setForeground(Color.BLUE);
					b02.setText(set);
					b02.setFont(font1);
					a[0][2]=set.charAt(0);
					WinStatus(0,2,set);
				}
					if(e.getSource()==b10)
					{
						if(set.charAt(0)=='X')
							b10.setForeground(Color.RED);
						else
							b10.setForeground(Color.BLUE);
						b10.setText(set);
						b10.setFont(font1);
						a[1][0]=set.charAt(0);
						WinStatus(1,0,set);
					}
						if(e.getSource()==b11)
						{
							if(set.charAt(0)=='X')
								b11.setForeground(Color.RED);
							else
								b11.setForeground(Color.BLUE);
							b11.setText(set);
							b11.setFont(font1);
							a[1][1]=set.charAt(0);
							WinStatus(1,1,set);
						}
							if(e.getSource()==b12)
							{
								if(set.charAt(0)=='X')
									b12.setForeground(Color.RED);
								else
									b12.setForeground(Color.BLUE);
								b12.setText(set);
								b12.setFont(font1);
								a[1][2]=set.charAt(0);
								WinStatus(1,2,set);
							}
								if(e.getSource()==b20)
								{
									if(set.charAt(0)=='X')
										b20.setForeground(Color.RED);
									else
										b20.setForeground(Color.BLUE);
									b20.setText(set);
									b20.setFont(font1);
									a[2][0]=set.charAt(0);
									WinStatus(2,0,set);
								}
									if(e.getSource()==b21)
									{
										if(set.charAt(0)=='X')
											b21.setForeground(Color.RED);
										else
											b21.setForeground(Color.BLUE);
										b21.setText(set);
										b21.setFont(font1);
										a[2][1]=set.charAt(0);
										WinStatus(2,1,set);
									}
									if(e.getSource()==b22)
				                   {
										if(set.charAt(0)=='X')
											b22.setForeground(Color.RED);
										else
											b22.setForeground(Color.BLUE);
										b22.setText(set);
										b22.setFont(font1);
										a[2][2]=set.charAt(0);
										WinStatus(2,2,set);
										
                                   	}
									if(e.getSource()==breset)
									{
										int i,j;
										b00.setText("");
										b01.setText("");
										b02.setText("");
										b10.setText("");
										b11.setText("");
										b12.setText("");
										b20.setText("");
										b21.setText("");
										b22.setText("");
										for(i=0;i<=2;i++)
										{
											for(j=0;j<=2;j++) {
										   a[i][j]=0;
										
											}
									}
									}
									if(e.getSource()==bexit)
									{
										this.dispose();
									}
}
public void WinStatus(int x,int y,String set)
{
//	System.out.println(x+" "+y);
	damn++;
	int h=0;
	int v=0;
	int d=0;
	for(int i=0;i<=2;i++) 
	{
	if(a[i][y]==set.charAt(0)) 
	{
	h++;
	}
	if(a[x][i]==set.charAt(0)) 
	{
	v++;
	}
	if((x-y==2||y-x==2)&&(a[2-i][i]==set.charAt(0)))
	{
		d++;
	}
	if(x==y&&a[i][i]==set.charAt(0))
	{
		d++;
	}
}
	System.out.println(v+" "+h+" "+d);
	if(h==3||v==3||d==3&&damn>4)
{
	if(set.charAt(0)=='X') {
		point1++;
		lplayer1score.setText(point1+"");
		new winScreen1();
	}else {
		point2++;
		lplayer2score.setText(point2+"");
		new winScreen2();
}
}
}
}
class winScreen1 extends JFrame
{
	JLabel l1;
	public winScreen1()
	{
		Font font1=new Font("",Font.BOLD,19);
		l1=new JLabel("Player 1 won");
		l1.setFont(font1);
		add(l1);
		setLayout(new FlowLayout());
		setSize(100,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(600, 200);
	}
	
}
class winScreen2 extends JFrame
{
	JLabel l1;
	JButton breset;
	public winScreen2()
	{
		Font font1=new Font("",Font.BOLD,19);
		l1=new JLabel("Player 2 won");
		l1.setFont(font1);
		add(l1);
		setLayout(new FlowLayout());
		setSize(100,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(600, 200);
	}
	
}

