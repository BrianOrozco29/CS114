package lab10;
//********************************************************************

//  inputFieldPanel.java      
//
//********************************************************************

import java.awt.*;
import javax.swing.*;

public class inputFieldPanel extends JPanel
{
   private JLabel label;
   private JTextField field;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the field and label combination.
   //-----------------------------------------------------------------
   public inputFieldPanel(String labelText, int fieldLength)
   {
      label = new JLabel(labelText);
      field = new JTextField(fieldLength);

      add(label);
      add(field);

      setPreferredSize (new Dimension(500, 40));
      setBackground (Color.yellow);
   }

   //--------------------------------------------------------------
   //  Prints the field information to standard output.
   //--------------------------------------------------------------
   public String getFieldText()
   {
      return field.getText();
   }
}
