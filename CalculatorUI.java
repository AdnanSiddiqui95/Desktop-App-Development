import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class CalculatorUI
{
	JFrame frame=new JFrame("Calculator UI");
	JTextField textbox=new JTextField("0");
	JPanel panel=new JPanel();
	JButton[] button=new JButton[20];
	public CalculatorUI()
	{
		frame.setSize(360,440);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		addTextBox();
		frame.setVisible(true);
	}
	private void addTextBox()
	{
		textbox.setBounds(20, 30, 300, 40);
		frame.add(textbox);
		textbox.setFont(new Font("arial",Font.BOLD,30));
		textbox.setHorizontalAlignment(JTextField.RIGHT);
		textbox.setEditable(false);
		textbox.setBackground(Color.white);
		textbox.setBorder(BorderFactory.createLineBorder(Color.black,1));
		addPanel();
	}
	private void addPanel()
	{
		panel.setBounds(20, 100, 300, 260);
		//panel.setBackground(Color.black);
		frame.add(panel);
		addButtons();
	}
	private void addButtons()
	{
		panel.setLayout(new GridLayout(5,4,5,5));
		Font font=new Font("arial",Font.BOLD,20);
		String[] str= {"BACK","CE","C","%","9","8","7","/","6","5","4","*","3","2","1","+","0",".","=","-",};
		for(int i=0;i<20;i++)
		{
			button[i]=new JButton(str[i]);
			button[i].setFont(font);
			if(i==3 || i==7 || i==11 || i==15 || i==19)
				button[i].setForeground(Color.RED);
			else
				button[i].setForeground(Color.blue);
			panel.add(button[i]);
		}
	}
	public static void main(String[] args)
	{
		new CalculatorUI();
	}
}
