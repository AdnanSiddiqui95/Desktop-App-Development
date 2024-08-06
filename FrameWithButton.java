import java.awt.Color;
import javax.swing.JFrame;

public class FrameWithButton 
{
	public FrameWithButton()
	{
		JFrame frame=new JFrame("Frame");
		frame.setSize(600,400);
		frame.getContentPane().setBackground(Color.blue);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{	
		new FrameWithButton();
	}
}
