import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AlphabetLearningFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public  AlphabetLearningFrame()
	{
		 pack();
		setMinimumSize(new Dimension(670,550));
		 setTitle("Alphabet Learning Game");
		// setSize(270,150); 
	     setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	     MainPanel panel = new MainPanel();
	     add(panel);
	     centerWindow(this);
	}
	private void centerWindow(JFrame frame) {		//Programmer-definded method to centering a window open
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;	//Compute center width
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;	//Compute ceenter height
		setLocation(centeredWidth, centeredHeight);						//call method in JFrame
	}
}
