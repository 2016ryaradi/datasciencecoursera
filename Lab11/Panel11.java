   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel11 extends JPanel
   {
      private Display11 display;
      public Panel11()
      {
         setLayout(new BorderLayout());
      
         display = new Display11();
         add(display,BorderLayout.CENTER);
      	
         JPanel subpanel = new JPanel();
         subpanel.setLayout(new FlowLayout());
      	
         JButton button1 = new JButton("One");
         button1.addActionListener(new Listener1());
         subpanel.add(button1);
      	
         JButton button2 = new JButton("Two");
         button2.addActionListener(new Listener2());
         subpanel.add(button2);
      	
         JButton button3 = new JButton("Three");
         button3.addActionListener(new Listener3());
         subpanel.add(button3);
      	
         add(subpanel,BorderLayout.SOUTH); 
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.removeOne();         
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.removeTwo();
         }
      }
      private class Listener3 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.removeThree();         
         }
      }
   }
