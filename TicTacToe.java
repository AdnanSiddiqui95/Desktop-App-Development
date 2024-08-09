import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe
{
	JFrame frame=new JFrame("Tic-Tac-Toe-UI");
	JButton[][] button=new JButton[3][3];
	public TicTacToe()
	{
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		
		addButton();
		
		frame.setVisible(true);
	}
	public void addButton()
	{
		GridLayout layout=new GridLayout(3,3);
		frame.setLayout(layout);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				button[i][j]=new JButton();
				frame.add(button[i][j]);
			}
		}
	}
	public static void main(String[] args) 
	{
		new TicTacToe();
	}

}
