import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JaiHind 
{
	JFrame frame=new JFrame("Jai-Hind");
	JPanel[] panel=new JPanel[3];
	JButton button =new JButton(".");
	public JaiHind()
	{
		frame.setSize(900,609);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		addPanel();
		
		frame.setVisible(true);
	}
	private void addPanel()
	{
		for(int i=0;i<3;i++)
		{
			panel[i]=new JPanel();
			frame.add(panel[i]);
		}
		panel[0].setBounds(0, 0, 900, 195);
		panel[0].setBackground(Color.orange);
		panel[1].setBounds(0, 196, 900,200 );
		panel[1].setBackground(Color.white);
		frame.add(button);
		button.setBounds(345, 196, 210, 213);
		ImageIcon icon1=new ImageIcon(getClass().getResource("download.jpg"));
		button.setIcon(icon1);
		
		panel[2].setBounds(0, 409, 900, 200);
		panel[2].setBackground(Color.green);
		
	}
	public static void main(String[] args) 
	{
		new JaiHind();
	}

}




