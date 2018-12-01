import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuFrame extends JFrame implements ActionListener
{
	Thread LearningThread = new LearningThread(false);
	Thread PractisingThread = new PractisingThread(false);
	JPanel panel = new MenuPanel();
	JLabel label = new JLabel(" Alphabet Learning");
	Color btnColor = Color.decode("#F27798"),
			bgColor = Color.decode("#413E8A"),
			fontColor = Color.decode("#ECF5FA");
	
	//String[] options = {"Learning","Practising","Playing the Game"};
	//JList list = new JList();
	 Container verticalbox = Box.createVerticalBox();
	 Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		JButton learn,practise,game;
		Component gap = Box.createRigidArea(new Dimension(20,24));
	public MenuFrame()
	{
		 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 setSize(new Dimension(350,450));
		MenuConpoment();
		centerWindow(this);
		LearningThread.start();
		PractisingThread.start();
		pack();
	}
	public void MenuConpoment()
	{
	    panel.setBackground(bgColor); 
	    Font titlefont = new Font("san-serif",Font.BOLD,41);
	   Font btnFont = new Font("san-serif",Font.PLAIN,26);
		
	  label.setFont(titlefont);
	  label.setForeground(fontColor);
	  label.setAlignmentX(CENTER_ALIGNMENT);
	  verticalbox.add(label);
	  verticalbox.add(Box.createRigidArea(new Dimension(0,30)));
		learn = new JButton("Start Learning");
		practise = new JButton("Practising");
		game = new JButton("Start the Game");
		learn.setFont(btnFont);
		practise.setFont(btnFont);
		game.setFont(btnFont);
		learn.setOpaque(true);
		learn.setBorderPainted(false);
		learn.setAlignmentX(Component.CENTER_ALIGNMENT);
		learn.setBackground(btnColor);
		learn.setForeground(Color.WHITE);
			verticalbox.add(learn);
			verticalbox.add(Box.createRigidArea(new Dimension(0,24)));
			practise.setOpaque(true);
			practise.setBorderPainted(false);
			practise.setAlignmentX(Component.CENTER_ALIGNMENT);
			practise.setBackground(btnColor);
			practise.setForeground(Color.WHITE);
			game.setOpaque(true);
			game.setBorderPainted(false);
			game.setAlignmentX(Component.CENTER_ALIGNMENT);
			game.setBackground(btnColor);
			game.setForeground(Color.WHITE);
			
	verticalbox.add(practise);
	verticalbox.add(gap);
	verticalbox.add(game);
	
	panel.setBorder(new EmptyBorder(45,58,45,58));
	panel.setAlignmentX(CENTER_ALIGNMENT);
	panel.setAlignmentY(CENTER_ALIGNMENT);
	
	panel.add(verticalbox);
	learn.addActionListener(this);
	practise.addActionListener(this);
	game.addActionListener(this);

	add(panel);
   	
  
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		if(src == learn)
		{
			((PractisingThread) PractisingThread).closeThis();
			LearningThread = new LearningThread(true);
			LearningThread.start();
			
			
			
		}else if(src == practise)
		{
			((LearningThread) LearningThread).closeThis();
			PractisingThread = new PractisingThread(true);
			PractisingThread.start();
			
		}
	}
	
	private void centerWindow(JFrame frame) {		//Programmer-definded method to centering a window open
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;	//Compute center width
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;	//Compute ceenter height
		setLocation(centeredWidth, centeredHeight);						//call method in JFrame
	}
	//@Override

}
 class MenuPanel extends JPanel
 {
	 public MenuPanel()
	 {
		 
	 }
 }
 