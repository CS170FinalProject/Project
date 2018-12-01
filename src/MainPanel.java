import javax.swing.*;
import java.awt.*;


import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class MainPanel extends JPanel
{
	CardLayout card; 
	Container c;  
	
	
public MainPanel()
  {
	 
      //card=new CardLayout();  
//create CardLayout object with 40 hor space and 30 ver space  
	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	setBorder(new EmptyBorder(20,15,20,15));
   add(new AlphabetLearningPanel());
     
    
  }
}
 class AlphabetLearningPanel extends JPanel
{
	 private JTabbedPane tabbedPane;
	
	 public AlphabetLearningPanel()
	{
		 setLayout(new BorderLayout());
		 tabbedPane = new JTabbedPane();
		 ArrayList<String> letters = new ArrayList<String>();
		  for (char chare = 'A'; chare <='Z'; chare++)
		  {
			  letters.add(Character.toString(chare));
			  
		  }
		 
		 
		 ViewAllPanel viewall = new ViewAllPanel(letters);
		 FlashCardsPanel flashcards = new FlashCardsPanel(letters);
		 tabbedPane.add("View All",viewall);
		 tabbedPane.add("FlashCard", flashcards);
		 add(tabbedPane,BorderLayout.NORTH);
		
		 
	}
	
}
 class FlashCardsPanel extends JPanel implements ActionListener
 {  CardLayout card;  
 
 Container box = Box.createVerticalBox();
 JButton nextBtn,previousBtn;
 JPanel cards;
 int count = 1;
	 public FlashCardsPanel(ArrayList<String> letters)
	 {
		  cards = new JPanel();
		 card=new CardLayout(40,30);  
		 cards.setLayout(card);
		 
		 for(String letter:letters)
		 {
			
			cards.add(new SingleCardPanel(letter));
		 }
		 box.add(cards);
		 JPanel btnPanel= new JPanel();
		 nextBtn = new JButton("Next");
		 previousBtn = new JButton("Previous");
		 nextBtn.addActionListener(this);
		 previousBtn.addActionListener(this);
		 previousBtn.setEnabled(false);
		 btnPanel.add(previousBtn);
		btnPanel.add(nextBtn);
		box.add(btnPanel);
		add(box);
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		   if(src == nextBtn)
		   {
			   card.next(cards);
			   count++;
			   if(count == 1)
				 {
					 previousBtn.setEnabled(false);
				 }else {
					 previousBtn.setEnabled(true);
				 }
			   if(count == 26)
			   {
				   nextBtn.setEnabled(false);
			   }else {
				   nextBtn.setEnabled(true);
			   }
		   }else if(src == previousBtn)
		   {
			   card.previous(cards);
			   count--;
			   if(count == 1)
				 {
					 previousBtn.setEnabled(false);
				 }else {
					 previousBtn.setEnabled(true);
				 }
			   if(count == 26)
			   {
				   nextBtn.setEnabled(false);
			   }else {
				   nextBtn.setEnabled(true);
			   }
		   }
		
	}
 }
 class SingleCardPanel extends JPanel
 {
	 Container verticalbox = Box.createVerticalBox();
	 JLabel letterCard;
	 Font letterFont = new Font("san-serif",Font.BOLD, 195);
 	 public SingleCardPanel(String letter)
	 {
		 letterCard = new JLabel(letter);
		 letterCard.setForeground(Color.decode("#884EF6"));
		 letterCard.setFont(letterFont);
		 letterCard.setBackground(Color.white);
		 letterCard.setOpaque(true);
		 letterCard.setBorder(new EmptyBorder(35,55,35,55));
		 letterCard.setHorizontalAlignment(SwingConstants.CENTER);
		 letterCard.setVerticalAlignment(SwingConstants.CENTER);
		 verticalbox.add(letterCard);
		 add(verticalbox);
	 }
 }
 class ViewAllPanel extends JPanel
 {
	 public ViewAllPanel(ArrayList<String> letters)
	 {
		JLabel[] letterlabels = new JLabel[26];
		Color[] letterColors = new Color[26];
		setBackground(Color.decode("#F6904E"));
		setBorder(new EmptyBorder(12,12,12,12));
		 setLayout(new GridLayout(4,7 ,3,3));
		 for(int i = 0; i<26;i++)
			  
		  {
			  letterlabels[i] = new JLabel(letters.get(i));
			  
			  //letterColors[i] = Color.getHSBColor(i*10+200, 0.87f, 0.7f);
		  }
		 
		  Font letterFont = new Font("Comic Sans MS", Font.BOLD, 46);
		  for(int i = 0; i<26;i++)
		  {
			 letterlabels[i].setBorder(new EmptyBorder(20,20,20,20));
			 letterlabels[i].setFont(letterFont);
		letterlabels[i].setHorizontalAlignment(SwingConstants.CENTER);
		letterlabels[i].setVerticalAlignment(SwingConstants.CENTER);
			  letterlabels[i].setForeground(new Color(192,9,250));
			  letterlabels[i].setBackground(Color.WHITE);
			  letterlabels[i].setOpaque(true);
			  add(letterlabels[i]);
			 
		  }
	 }
 }
 
 class StartGamePanel extends JPanel implements ActionListener
{
    JButton submitBtn;
    JLabel label;
    JTextField username;
    Container verticalbox = Box.createVerticalBox();
    ArrayList<String> names = new ArrayList<String>();
    
	public StartGamePanel()
   {
		
		//setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	  label = new JLabel("Enter your username: ");
	  label.setAlignmentX(Component.CENTER_ALIGNMENT);
	  username = new JTextField(13);
	  username.setSize(21, 4);
	  submitBtn = new JButton("Submit");
	  submitBtn.setEnabled(false);
	  verticalbox.add(label);
		verticalbox.add(username);
		verticalbox.add(submitBtn);
	  username.getDocument().addDocumentListener((DocumentListener) new DocumentListener() {
		 
			@Override
			public void insertUpdate(DocumentEvent e) {
				 btnEnable();
				
			}
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				 btnEnable();
			}
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				 btnEnable();
			}
			public void btnEnable()
			{
				String input = username.getText().trim();
				if(input.isEmpty() || input == "" || input == null)
					submitBtn.setEnabled(false);
				else
					submitBtn.setEnabled(true);
			}});
		
		
		submitBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		submitBtn.addActionListener(this);
		
		add(verticalbox);
		
   }
	public void actionPerformed(ActionEvent e)
	   {
		   Object src = e.getSource();
		   if(src == submitBtn)
			   
		   {
			      
					File myFile = new File("users.txt");
					//PrintWriter out;
					try {
						BufferedReader in = new BufferedReader( //Create input file
						           new FileReader(myFile));
						String line = in.readLine(); //Read in a line from file
			   
					 boolean ifnew = true;
						
						while (line != null) {
						     //  System.out.print(line);
							 //System.out.print(this.ifNewUser(line).toString());
						ifnew =ifNewUser(line,username.getText().trim( ));
						       line = in.readLine();
						       
						    }
						    in.close();
						 //  
						   
						PrintWriter out = new PrintWriter(new FileWriter(myFile, true));
						if(ifnew)
						out.println(username.getText().trim()+",");		//Output to the file
						
						out.close();
						   
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
			   
			   
		   }
		   
	   }
	private boolean ifNewUser(String line,String input)
	   {
		  String[] usernames = line.split(",");
		  // System.out.print(usernames);
		  for(String name: usernames)
		  {
			// System.out.println(name);
			  names.add(name);
		  }
		  if(names.contains(input))
			   return false;
		  else 
			  return true;
	   }
	
	  
}
