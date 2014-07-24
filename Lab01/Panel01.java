   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel01 extends JPanel
   {
      private JLabel label;        //field
      private JTextField box;		//field
      public Panel01()
      {
         setLayout(new FlowLayout());
      
         box = new JTextField("0.0", 10);
         box.setHorizontalAlignment(SwingConstants.RIGHT);
         add(box);
      
         JButton button = new JButton("SQRT");   //local
         button.addActionListener(new Listener());
         add(button);
      
         label = new JLabel("0.0");
         label.setFont(new Font("Serif", Font.BOLD, 20));
         label.setForeground(Color.blue);
         add(label);
      }
      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
				double d = Double.parseDouble(box.getText());
            double x = Math.sqrt(d);
            label.setText("" + x);
         }
      }
   }
