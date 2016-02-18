import javax.swing.*;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
class Source implements ActionListener
{
	JFrame jf;JTextField tf1,tf2;JButton b;
	JLabel jl1,jl2;

	public Source()
	{
		jf=new JFrame("Source code reader");
		jl1=new JLabel();
		jl1.setOpaque(true);
		jl1.setBounds(30,50,100,20);
		jl1.setText("enter file path");

		jl2=new JLabel();
		jl2.setOpaque(true);
		jl2.setBounds(30,100,100,20);
		jl2.setText("enter URL");

		tf1=new JTextField();
		tf1.setBounds(140,50,180,25);

		tf2=new JTextField();
		tf2.setBounds(140,100,180,25);

		b=new JButton("OK");
		b.setBounds(200,180,70,40);
		b.addActionListener(this);

		jf.add(jl1);
		jf.add(jl2);

		jf.add(tf1);
		jf.add(tf2);

		jf.add(b);
		jf.setSize(400,400);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
         
	}
	public static void main(String s[])
	{
		new Source();
	}
	public void actionPerformed(ActionEvent e)
	{
		try{
		URL url=new URL(tf2.getText());
		FileWriter fw=new FileWriter(tf1.getText(),false);
		PrintWriter pw=new PrintWriter(fw);
		BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
       String str="";
		while((str=br.readLine())!=null)
		{
			pw.println(str);
		}
	}catch(Exception ae){}
	}
}
