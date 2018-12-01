
public class PractisingThread extends Thread
{
boolean visible;
AlphabetLearning frame;
public PractisingThread(boolean visible)
{
	this.visible = visible;
}

	public void run()
{
	frame = new AlphabetLearning(visible);	
	//this.stop();
	
}
	public void closeThis()
	{
		frame.frame.dispose();
	}
}
