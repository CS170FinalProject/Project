
public class LearningThread extends Thread
{
	boolean visible;
	AlphabetLearningFrame frame;
	public LearningThread(boolean visible)
	{
		this.visible = visible;
	}
	public void run()
	{
		 frame = new  AlphabetLearningFrame();
		 frame.setVisible(visible);
		 
	}
	public void closeThis()
	{
		frame.closeThis();
	}
	
}
