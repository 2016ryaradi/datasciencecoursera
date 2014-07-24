   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel02 extends JPanel
   {
   //fields--for objects that must be accessed later
      private JLabel label;
		private JTextField box;
   	  
      public Panel02()           //constructor
      {
         setLayout(new FlowLayout());
			
         JButton buttonrand = new JButton("Random");   //local
         buttonrand.addActionListener(new Listener1());
         add(buttonrand);
      	
         JButton buttoncube = new JButton("Cube Root");   //local
         buttoncube.addActionListener(new Listener2());
         add(buttoncube);
      
         JButton buttonrecip = new JButton("Reciprocal");   //local
         buttonrecip.addActionListener(new Listener3());
         add(buttonrecip);
      
         JButton buttonquit = new JButton("Quit");   //local
         buttonquit.addActionListener(new Listener4());
         add(buttonquit);   
      	
         label = new JLabel("0.0");
         label.setFont(new Font("Serif", Font.BOLD, 20));
         label.setForeground(Color.blue);
			label.setText("0.92843789327489274");
         add(label);
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            double rand = Math.random();
            label.setText(""+rand);
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            double d = Double.parseDouble(label.getText());
            double cube = Math.pow(d,1.0/3.0);
            label.setText(""+cube);
         }
      }
      private class Listener3 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
				double r = Double.parseDouble(label.getText());
            double recip = (1/r);
            label.setText(""+recip);
         }
      }
      private class Listener4 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            System.exit(0);
         }
      }
   
   }
