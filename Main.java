import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  
JTextField field;
JButton button;
JButton secondbutton;

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Count down");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
 
    JPanel mainPanel = new JPanel();

    

    

button = new JButton("Count down");
field = new JTextField("10");
secondbutton = new JButton("reset");


mainPanel.add(button);
mainPanel.add(field);
mainPanel.add(secondbutton);
 
 field.setEnabled(false);

 
 button.addActionListener(this);
 button.setActionCommand("Count Down");
 

 
 secondbutton.addActionListener(this);
 secondbutton.setActionCommand("reset");
 










frame.add(mainPanel);



 
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
     String command = e.getActionCommand();
    // For counter
    if(command.equals("Count Down")){
  
String text = field.getText();
int fieldNum = Integer.parseInt(text);
if(fieldNum > 0){
fieldNum = fieldNum - 1;
field.setText("" + fieldNum);
        
    }
  }


if(command.equals("reset")){
  String text = field.getText();
int fieldNum = Integer.parseInt(text);
    field.setText("10");
      
  
      }
    }



  

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
