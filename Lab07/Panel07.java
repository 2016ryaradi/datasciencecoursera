	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel07 extends JPanel
   {
      private Display07 display;
      public Panel07()
      {
         setLayout(new FlowLayout());
      
         display = new Display07();
         add(display);
      
         JButton button1 = new JButton("GCD");
         button1.addActionListener(new Listener1());
         add(button1);
			
			JButton button2 = new JButton("LCM");
         button2.addActionListener(new Listener2());
         add(button2);
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
     			display.showGCD();
         }
      }
		 private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
     			display.showLCM();
         }
      }
   }