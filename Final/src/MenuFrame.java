import javax.swing.*;
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
	//String[] options = {"Learning","Practising","Playing the Game"};
	//JList list = new JList();
	 Container verticalbox = Box.createVerticalBox();
	 Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		JButton learn,practise,game;
	public MenuFrame()
	{
		 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 setSize(new Dimension(150,250));
		MenuConpoment();
		centerWindow(this);
		LearningThread.start();
		PractisingThread.start();
	}
	public void MenuConpoment()
	{
	//list.setListData(options);
	//list.setVisibleRowCount(3);
	//list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		learn = new JButton("Start Learning");
		practise = new JButton("Practising");
		game = new JButton("Start the Game");
			verticalbox.add(learn);
	verticalbox.add(practise);
	verticalbox.add(game);
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
 