import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class LogInUI 
{
	JFrame frame=new JFrame("LogIn");
	JLabel lable1=new JLabel("Enter User ID :");
	JTextField textbox1=new JTextField();
	JLabel lable2=new JLabel("Enter Password :");
	JPasswordField textbox2=new JPasswordField();
	JButton button1=new JButton("Submit");
	JButton button2=new JButton("Cancel");
	
	public LogInUI()
	{
		
		frame.setSize(600,500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		addFont();
		addLable();
		addButton();
		
	
		frame.setVisible(true);
	}
	private void addLable()
	{
		lable1.setBounds(100,100,200,40);
		frame.add(lable1);
		textbox1.setBounds(270,100,200,40);
		frame.add(textbox1);
		
		lable2.setBounds(100,200,200,40);
		frame.add(lable2);
		textbox2.setBounds(270,200,200,40);
		frame.add(textbox2);
	}
	private void addButton()
	{
		button1.setBounds(150,400,150,30);
		frame.add(button1);
		button2.setBounds(320,400,150,30);
		frame.add(button2);
		button1.setForeground(Color.RED);
		button2.setForeground(Color.RED);
	}
	private void addFont()
	{
		Font fo=new Font("arial",Font.PLAIN,20);
		lable1.setFont(fo);
		lable1.setForeground(Color.RED);
		
		
		lable2.setFont(fo);
		lable2.setForeground(Color.RED);
	}
	public static void main(String[] args) 
	{
		new LogInUI();
	}

}
