import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeUI 
{
	JFrame frame=new JFrame("Color Change");
	JPanel panel=new JPanel();
	JButton bt1=new JButton("Green");
	JButton bt2=new JButton("Red");
	JButton bt3=new JButton("Blue");
	public ColorChangeUI()
	{
		frame.setSize(400,450);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.setBackground(Color.black);
		panel.add(bt1);
		bt1.addActionListener(new ColorGreen());
		panel.add(bt2);
		bt2.addActionListener(new ColorRed());
		panel.add(bt3);
		bt3.addActionListener(new ColorBlue());
		frame.setVisible(true);
	}
	class ColorGreen implements ActionListener
	{
		public void actionPerformed(ActionEvent evt) 
		{
		panel.setBackground(Color.green);
		}
	}
	class ColorRed implements ActionListener
	{
		public void actionPerformed(ActionEvent evt) 
		{
		panel.setBackground(Color.red);
		}
	}
	class ColorBlue implements ActionListener
	{
		public void actionPerformed(ActionEvent evt) 
		{
		panel.setBackground(Color.blue);
		}
	}
	public static void main(String[] args) 
	{
		new ColorChangeUI();
	}

}
