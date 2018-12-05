


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//implementing ActionListener interface
public class AlphabetLearning implements ActionListener {
   //Creating variables for our calculations
    double number, answer;
    int calculation;
    String alphaStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    JFrame frame;
   // JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JTextField textField2 = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    
    JButton buttonA = new JButton("A");
    JButton buttonB = new JButton("B");
    JButton buttonC = new JButton("C");
    JButton buttonD = new JButton("D");
    JButton buttonE = new JButton("E");
    JButton buttonF = new JButton("F");
    JButton buttonG = new JButton("G");
    JButton buttonH = new JButton("H");
    JButton buttonI = new JButton("I");
    JButton buttonJ = new JButton("J");   
    JButton buttonK = new JButton("K");
    JButton buttonL = new JButton("L");
    JButton buttonM = new JButton("M");   
    JButton buttonN = new JButton("N");
    JButton buttonO = new JButton("O");
    JButton buttonP = new JButton("P");
    JButton buttonQ = new JButton("Q");
    JButton buttonR = new JButton("R");
    JButton buttonS = new JButton("S");
    JButton buttonT	= new JButton("T");
    JButton buttonU = new JButton("U");
    JButton buttonV = new JButton("V");
    JButton buttonW= new JButton("W");
    JButton buttonX = new JButton("X");
    JButton buttonY = new JButton("Y");
    JButton buttonZ = new JButton("Z");
    JButton buttonAns = new JButton("Ans");
    JButton buttonClear = new JButton("CLR");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonExit = new JButton("Exit");
    

    //JButton buttonA = new JButton("A");
   // JButton buttonB = new JButton("B");
   // ;

    AlphabetLearning(boolean visible) {
        prepareGUI();
        addComponents();
        addActionEvent();
        frame.setVisible(visible);
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Alphabet Learning");
        frame.setSize(600, 590);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
       
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void addComponents() {
       /* label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);
		*/

        textField.setBounds(10, 10, 570, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
        
        textField2.setBounds(10, 55, 570, 40);
        textField2.setFont(new Font("Arial", Font.BOLD, 20));
        textField2.setEditable(false);
        textField2.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField2);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setOpaque(true);
        offRadioButton.setBorderPainted(false);
        
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();	// create group of two buttons ON & OFF
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);
        

        buttonG.setBounds(10, 230, 60, 40);					// set button letter G
        buttonG.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonG);

        buttonH.setBounds(80, 230, 60, 40);
        buttonH.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonH);

        buttonI.setBounds(150, 230, 60, 40);
        buttonI.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonI);

        buttonD.setBounds(10, 290, 60, 40);
        buttonD.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonD);

        buttonE.setBounds(80, 290, 60, 40);
        buttonE.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonE);

        buttonF.setBounds(150, 290, 60, 40);
        buttonF.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonF);

        buttonA.setBounds(10, 350, 60, 40);
        buttonA.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonA);

        buttonB.setBounds(80, 350, 60, 40);
        buttonB.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonB);

        buttonC.setBounds(150, 350, 60, 40);
        buttonC.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonC);

        buttonO.setBounds(10, 410, 60, 40);
	    buttonO.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonO);
        
        buttonP.setBounds(80, 410, 60, 40);
	    buttonP.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonP);

        buttonJ.setBounds(150, 410, 60, 40);
        buttonJ.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonJ);

        buttonV.setBounds(220, 350, 60, 40);
        buttonV.setFont(new Font("Arial", Font.BOLD, 20));
        //buttonV.setBackground(new Color(239, 188, 2));
        frame.add(buttonV);
        
        buttonW.setBounds(10, 470, 60, 40);
        buttonW.setFont(new Font("Arial", Font.BOLD, 20));
        //buttonV.setBackground(new Color(239, 188, 2));
        frame.add(buttonW);
        
        buttonR.setBounds(220, 410, 60, 40);
        buttonR.setFont(new Font("Arial", Font.BOLD, 20));
        //buttonV.setBackground(new Color(239, 188, 2));
        frame.add(buttonR);
        
        buttonAns.setBounds(220, 110, 70, 40);
        buttonAns.setFont(new Font("Arial", Font.BOLD, 12));
        buttonAns.setBackground(Color.red);
        buttonAns.setForeground(Color.white);
       buttonAns.setOpaque(true);
        buttonAns.setBorderPainted(false);
        frame.add(buttonAns);

        buttonExit.setBounds(300, 110, 90, 40);
        buttonExit.setFont(new Font("Arial", Font.BOLD, 20));
        buttonExit.setBackground(new Color(239, 188, 2));
        buttonExit.setOpaque(true);
        buttonExit.setBorderPainted(false);
        frame.add(buttonExit);
        
        buttonQ.setBounds(80, 170, 60, 40);
        buttonQ.setFont(new Font("Arial", Font.BOLD, 20));
       // buttonQ.setBackground(new Color(239, 188, 2));
        frame.add(buttonQ);

        buttonN.setBounds(10, 170, 60, 40);
        buttonN.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(buttonN);

        buttonM.setBounds(220, 230, 60, 40);
        buttonM.setFont(new Font("Arial", Font.BOLD, 20));
       // buttonM.setBackground(new Color(239, 188, 2));
        frame.add(buttonM);
        
        buttonT.setBounds(290, 230, 60, 40);
        buttonT.setFont(new Font("Arial", Font.BOLD, 20));
       // buttonM.setBackground(new Color(239, 188, 2));
        frame.add(buttonT);

        buttonL.setBounds(220, 170, 60, 40);
        buttonL.setFont(new Font("Arial", Font.BOLD, 20));
        //buttonL.setBackground(new Color(239, 188, 2));
        frame.add(buttonL);
        
        buttonS.setBounds(290, 170, 60, 40);
        buttonS.setFont(new Font("Arial", Font.BOLD, 20));
        //buttonL.setBackground(new Color(239, 188, 2));
        frame.add(buttonS);
        
        buttonK.setBounds(220, 290, 60, 40);
        buttonK.setFont(new Font("Arial", Font.BOLD, 20));
        //buttonK.setBackground(new Color(239, 188, 2));
        frame.add(buttonK);
        
        buttonX.setBounds(80, 470, 60, 40);
        buttonX.setFont(new Font("Arial", Font.BOLD, 20));
        //buttonK.setBackground(new Color(239, 188, 2));
        frame.add(buttonX);
        
        buttonZ.setBounds(220, 470, 60, 40);
        buttonZ.setFont(new Font("Arial", Font.BOLD, 20));
        //buttonK.setBackground(new Color(239, 188, 2));
        frame.add(buttonZ);
        
        buttonY.setBounds(150, 470, 60, 40);
        buttonY.setFont(new Font("Arial", Font.BOLD, 20));
        //buttonK.setBackground(new Color(239, 188, 2));
        frame.add(buttonY);

        buttonU.setBounds(150, 170, 60, 40);
        buttonU.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonU);
        
        buttonClear.setBounds(80, 110, 70, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        buttonClear.setOpaque(true);
        buttonClear.setBorderPainted(false);
        frame.add(buttonClear);

        buttonDelete.setBounds(150, 110, 70, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        buttonDelete.setOpaque(true);
        buttonDelete.setBorderPainted(false);
        frame.add(buttonDelete);
        
        

       

    }

    public void addActionEvent() {
        //Registering ActionListener to buttons
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonExit.addActionListener(this);
        buttonN.addActionListener(this);
        buttonAns.addActionListener(this);
        buttonU.addActionListener(this);
        buttonL.addActionListener(this);
        buttonG.addActionListener(this);
        buttonH.addActionListener(this);
        buttonI.addActionListener(this);
        buttonJ.addActionListener(this);
        buttonM.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonK.addActionListener(this);
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonV.addActionListener(this);
        buttonO.addActionListener(this);       
        buttonP.addActionListener(this);
        buttonQ.addActionListener(this);
        buttonR.addActionListener(this);
        buttonW.addActionListener(this);
        buttonY.addActionListener(this);
        buttonZ.addActionListener(this);
        buttonS.addActionListener(this);
        buttonT.addActionListener(this);
        buttonX.addActionListener(this);

    }
  //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == buttonExit){
		frame.dispose();
		}
        else if (source == onRadioButton) {
            enable();//Calling enable() function
        } else if (source == offRadioButton) {
            disable();//Calling disable function
        } else if (source == buttonClear) {
            //Clearing texts of label and text field
            //label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            //Setting functionality for delete button(backspace)
            int length = textField.getText().length();
            int number = length - 1;


            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith("")) {
               // label.setText("");
            }
        } else if (source == buttonO) {
        	textField.setText(textField.getText() + "O");
        } else if (source == buttonA) {
            textField.setText(textField.getText() + "A");
        } else if (source == buttonB) {
            textField.setText(textField.getText() + "B");
        } else if (source == buttonC) {
            textField.setText(textField.getText() + "C");
        } else if (source == buttonD) {
            textField.setText(textField.getText() + "D");
        } else if (source == buttonE) {
            textField.setText(textField.getText() + "E");
        } else if (source == buttonF) {
            textField.setText(textField.getText() + "F");
        } else if (source == buttonG) {
            textField.setText(textField.getText() + "G");
        } else if (source == buttonH) {
            textField.setText(textField.getText() + "H");
        } else if (source == buttonI) {
            textField.setText(textField.getText() + "I");
        } else if (source == buttonJ) {
             textField.setText(textField.getText() + "J");
        } else if (source == buttonK) {
        	textField.setText(textField.getText() + "K");
        } else if (source == buttonL) {
        	textField.setText(textField.getText() + "L");
        } else if (source == buttonM) {
        	textField.setText(textField.getText() + "M");
        } else if (source == buttonN) {
        	textField.setText(textField.getText() + "N");
        }else if (source == buttonP) {
        	textField.setText(textField.getText() + "P");
        }else if (source == buttonQ) {
        	textField.setText(textField.getText() + "Q"); 
    	}else if (source == buttonR) {
    		textField.setText(textField.getText() + "R"); 
    	}
        else if (source == buttonU) {
    		textField.setText(textField.getText() + "U");
    	}
    	 else if (source == buttonV) {
     		textField.setText(textField.getText() + "V");
     	}
    	 else if (source == buttonW) {
      		textField.setText(textField.getText() + "W");
      	}
        
    	 else if (source == buttonY) {
       		textField.setText(textField.getText() + "Y");
       	}
        
    	 else if (source == buttonZ) {
        		textField.setText(textField.getText() + "Z");
        	}
    	 else if (source == buttonS) {
     		textField.setText(textField.getText() + "S");
     	}
    	 else if (source == buttonT) {
     		textField.setText(textField.getText() + "T");
     	}
    	 else if (source == buttonX) {
      		textField.setText(textField.getText() + "X");
      	}
    	else if (source == buttonAns) {
    
    		String str = textField.getText();
    		if( str.equals(alphaStr))
           		textField2.setText("Good Job!");
    		else if(str.length() < 26)
    		{
    			textField.setText("You need to input all of the 26 alphabet letters");
    		}
           	else
           		textField2.setText("Incorrect alphabet, not in order");
    	}
           // textField2.setText(str);
            
           /* number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            //label.setText("(ans)" + str);
        } else if (source == buttonU) {
        	textField.setText(textField.getText() + "U");
            /*number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) 
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }*/
      //  }
        /*else if (source == buttonV) {
           //Setting functionality for equal(=) button
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    /*answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
            } //end of switch calculation
        }// end of else if Source
        */
    }

    public void enable() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        //label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonExit.setEnabled(true);
        
        buttonAns.setEnabled(true);
        buttonA.setEnabled(true);
        buttonB.setEnabled(true);
        buttonC.setEnabled(true);
        buttonD.setEnabled(true);
        buttonE.setEnabled(true);
        buttonF.setEnabled(true);
        buttonG.setEnabled(true);
        buttonH.setEnabled(true);
        buttonI.setEnabled(true);
        buttonJ.setEnabled(true);
        buttonK.setEnabled(true);
        buttonL.setEnabled(true);      
        buttonM.setEnabled(true);
        buttonN.setEnabled(true);           
        buttonO.setEnabled(true);        
        buttonP.setEnabled(true);
        buttonQ.setEnabled(true);
        buttonR.setEnabled(true);
        buttonU.setEnabled(true);
        buttonV.setEnabled(true);
        buttonW.setEnabled(true);
        buttonY.setEnabled(true);
        buttonZ.setEnabled(true);
        buttonS.setEnabled(true);
        buttonT.setEnabled(true);
        buttonX.setEnabled(true);

    }

    public void disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setText("");
        //label.setText(" ");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonExit.setEnabled(false);
        buttonN.setEnabled(false);
        buttonAns.setEnabled(false);
        buttonU.setEnabled(false);
        buttonL.setEnabled(false);
        buttonG.setEnabled(false);
        buttonH.setEnabled(false);
        buttonI.setEnabled(false);
        buttonM.setEnabled(false);
        buttonD.setEnabled(false);
        buttonE.setEnabled(false);
        buttonF.setEnabled(false);
        buttonK.setEnabled(false);
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonV.setEnabled(false);
        buttonO.setEnabled(false);
        buttonJ.setEnabled(false);
        buttonP.setEnabled(false);
        buttonQ.setEnabled(false);
        buttonR.setEnabled(false);
        buttonW.setEnabled(false);
        buttonY.setEnabled(false);
        buttonZ.setEnabled(false);
        buttonS.setEnabled(false);
        buttonT.setEnabled(false);
        buttonX.setEnabled(false);
    }

    public void closeThis()
    {
     frame.dispose();	
    }
//import javax.swing.*;

/*public class MainClass {
    public static void main(String[] args)
    {
            new AlphabetLearning();
    }*/
}




