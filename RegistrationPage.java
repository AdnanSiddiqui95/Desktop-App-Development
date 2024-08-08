import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class RegistrationPage 
{
	JFrame frame=new JFrame("Registration");
	JLabel lable=new JLabel("First Name :");
	JTextField text=new JTextField();
	JLabel lable1=new JLabel("Last Name :");
	JTextField text1=new JTextField();
	JLabel lable2=new JLabel("Email :");
	JTextField text2=new JTextField();
	JLabel lable3=new JLabel("Password :");
	JPasswordField text3=new JPasswordField();
	JButton button=new JButton("Registr");
	JButton button1=new JButton("Login");
	
	public RegistrationPage()
	{
		frame.setSize(600,500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		
		addLable();
		addTextField();
		addfont();
		addButton();
		frame.setVisible(true);
	}
	private void addLable()
	{
		lable.setBounds(100,90,200,30);
		frame.add(lable);
		
		lable1.setBounds(100,140,200,30);
		frame.add(lable1);
		
		lable2.setBounds(100,190,200,30);
		frame.add(lable2);
		
		lable3.setBounds(100,240,200,30);
		frame.add(lable3);
	}
	private void addTextField()
	{	
		text.setBounds(270,90,200,30);
		frame.add(text);
		
		text1.setBounds(270,140,200,30);
		frame.add(text1);
		
		text2.setBounds(270,190,200,30);
		frame.add(text2);
		
		text3.setBounds(270,240,200,30);
		frame.add(text3);
	}
	private void addButton()
	{
		button.setBounds(120,350,150,30);
		frame.add(button);
		button1.setBounds(300,350,150,30);
		frame.add(button1);
		
	}
	private void addfont()
	{
		Font f=new Font("arial",Font.ITALIC,22);
		lable.setFont(f);
		lable.setForeground(Color.BLACK);
		
		lable1.setFont(f);
		lable1.setForeground(Color.BLACK);
		
		lable2.setFont(f);
		lable2.setForeground(Color.BLACK);
		
		lable3.setFont(f);
		lable3.setForeground(Color.BLACK);
		
		text.setFont(f);
		text.setForeground(Color.DARK_GRAY);
		
		text1.setFont(f);
		text1.setForeground(Color.DARK_GRAY);
		
		text2.setFont(f);
		text2.setForeground(Color.DARK_GRAY);
		
		text3.setFont(f);
		text3.setForeground(Color.DARK_GRAY);
	}
	public static void main(String[] args) 
	{
		new RegistrationPage();
	}

}
