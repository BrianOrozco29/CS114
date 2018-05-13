package lab10;
//********************************************************************

//  EmailGUI.java    
//
//********************************************************************

import javax.swing.JFrame;

public class EmailGUI
{
   //-----------------------------------------------------------------
   //  Creates and displays the GUI.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Prototype Email GUI");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new EmailGUIPanel());
      frame.pack();
      frame.setVisible(true);
   }
}
