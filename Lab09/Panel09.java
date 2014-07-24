  //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel09 extends JPanel
   {
      private JLabel label;
      private double total;
   	
      public Panel09()
      {
         setLayout(new BorderLayout());
         total = 0.0;
			
			label = new JLabel("$");
         label.setFont(new Font("Serif", Font.BOLD | Font.PLAIN, 100));
         label.setForeground(Color.blue);
         add(label,BorderLayout.NORTH);
      	
         JPanel panel = new JPanel();
         panel.setLayout(new GridLayout(2,3,10,0));
         add(panel, BorderLayout.CENTER);
         addButton(panel, "+1.00",1.0);      
         addButton(panel, "+0.10",0.1);      
         addButton(panel, "+0.01",0.01);      
         addButton(panel, "-1.00",-1.0);      
         addButton(panel, "-0.10",-0.1);      
         addButton(panel, "-0.01",-0.01);    
			
         add(panel,BorderLayout.CENTER);      
      }
      private void addButton(JPanel panel, String s, double x)
      {
         JButton button = new JButton(""+s);
         button.addActionListener(new Listener(x));
			panel.add(button);
      }
      private class Listener implements ActionListener
      {
         private double myX;
         public Listener(double x)
         {
            myX = x;
         }
         public void actionPerformed(ActionEvent e)
         {
            total+=myX;
            label.setText("$"+total);
         }
      }
   }