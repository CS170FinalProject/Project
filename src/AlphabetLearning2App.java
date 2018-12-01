import javax.swing.*;

public class AlphabetLearning2App {

	/*static JPanel panel = new JPanel();
	static JFrame frame = new JFrame();
	static JLabel welcomeMsg;
	static String[] options = {"Learning","Practising","Playing the Game"};
	static JList list = new JList();*/
	public static void main(String[] args) throws InterruptedException
	{
	
		 // new AlphabetLearning();
	   
		/*list.setListData(options);
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		panel.add(list);
		frame.add(panel);
		frame.setVisible(true);*/
		MenuFrame menu = new MenuFrame();
		menu.setVisible(true);
		//Thread LearningThread = new LearningThread();
	//	LearningThread.setPriority(2);
		//LearningThread.start();
		//Thread PractisingThread = new PractisingThread();
		
		//PractisingThread.setPriority(1);
		
		//PractisingThread.wait();
	}
	

}


