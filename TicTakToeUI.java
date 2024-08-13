import java.awt.*;
import javax.swing.*;

public class TicTakToeUI 
{
		JFrame frame=new JFrame("TicTakToeUI");
		JPanel[] panel=new JPanel[3];
		JLabel lable=new JLabel("..First Player..");
		JButton[] bt=new JButton[9];
		JButton exit=new JButton("EXIT");
		JButton replay=new JButton("REPLAY");
		
		public TicTakToeUI()
		{
			frame.setSize(460,540);
			frame.setLocationRelativeTo(null);
			frame.setResizable(false);
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
			panel[0].setBounds(40,30,380,40);
			panel[1].setBounds(40,90,380,360);
			panel[2].setBounds(40,450,380,40);
			addLable();
		}
		private void addLable()
		{
			panel[0].add(lable);
			lable.setFont(new Font("arial",Font.BOLD,25));
			lable.setForeground(Color.GREEN);
			panel[0].setBackground(Color.GRAY);
			addButton();
		}
		private void addButton()
		{
			panel[1].setLayout(new GridLayout(3,3));
			for(int i=0;i<9;i++)
			{
					bt[i]=new JButton();
					bt[i].setBackground(Color.CYAN);
					panel[1].add(bt[i]);
				
			}
		addReplayAndExit();
		}
		private void addReplayAndExit()
		{
			Font fo=new Font("elephant",Font.PLAIN,20);
			panel[2].add(replay);
			panel[2].add(exit);
			panel[2].setOpaque(false);
			replay.setFont(fo);
			exit.setFont(fo);
			exit.setForeground(Color.red);
		}
	public static void main(String[] args) 
	{
		new TicTakToeUI();
	}

}
