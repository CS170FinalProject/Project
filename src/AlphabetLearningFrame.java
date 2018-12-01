import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;



public class AlphabetLearningFrame extends JFrame implements ActionListener{
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	 JButton close = new JButton("close");
	public  AlphabetLearningFrame()
	{
		 pack();
		setMinimumSize(new Dimension(730,590));
		
		 setTitle("Alphabet Learning Game");
		// setSize(270,150); 
	     setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	     MainPanel panel = new MainPanel();
	     close.setOpaque(true);
	     close.setBorderPainted(false);
	     close.setBackground(new Color(255,12,50));
	     close.setForeground(Color.white);
	     close.setAlignmentX(CENTER_ALIGNMENT);
	     close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	     panel.add(close);
	     close.addActionListener(this);
	     add(panel);
	     centerWindow(this);
	}
	private void centerWindow(JFrame frame) {		//Programmer-definded method to centering a window open
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;	//Compute center width
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;	//Compute ceenter height
		setLocation(centeredWidth, centeredHeight);						//call method in JFrame
	}
	public void closeThis()
	{
		this.dispose();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	Object src = e.getSource();
	if(src == close)
	{
		this.dispose();
	}
		
	}
}
