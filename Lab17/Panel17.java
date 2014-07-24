   //Name: ________________________  Date: __________________

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
	import javax.swing.event.*;
   public class Panel17 extends JPanel
   {
      private JLabel slideLabel;
      private BumperPanel bump;
      //private Ball ball;
      private Timer timer;
      private JButton button2;
      private JButton button3;
      private int press = 0;
      private JPanel subpanel;
		private JSlider slider;
      public Panel17()
      {			
         setLayout(new BorderLayout());
      	
         //ball = new Ball();
         bump = new BumperPanel();
         add(bump, BorderLayout.CENTER);
      	
         subpanel = new JPanel();
         subpanel.setLayout(new BorderLayout());
         add(subpanel, BorderLayout.SOUTH);
      	
         JButton button1 = new JButton("Randomize");
         button1.addActionListener(new Listener1());
         subpanel.add(button1,BorderLayout.WEST);
      	
         button2 = new JButton("Step");
         button2.addActionListener(new Listener2());
         subpanel.add(button2,BorderLayout.CENTER);
      	
         button3 = new JButton("Run Animation");
         button3.addActionListener(new Listener3());
         subpanel.add(button3,BorderLayout.EAST);
      	
         JPanel subsubpanel = new JPanel();
          subsubpanel.setLayout(new BorderLayout());
          subpanel.add(subsubpanel,BorderLayout.SOUTH);
       	
          slideLabel = new JLabel("	Change the slider below to adjust the delay.");
          slideLabel.setFont(new Font("Serif", Font.PLAIN, 15));
          slideLabel.setForeground(Color.BLACK);
          subsubpanel.add(slideLabel,BorderLayout.CENTER);
       	
          slider = new JSlider();
          slider.addChangeListener(new Listener4());
          subsubpanel.add(slider,BorderLayout.SOUTH);
      	
         timer = new Timer(5, new Listener2());
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            bump.jumpAll();
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            bump.stepAnimation();
         }
      }
      private class Listener3 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if(button3.getText().equals("Pause Animation"))
            {					
               button3.setText("Run Again");
               timer.stop();
               button2.setEnabled(true);
            }
            else
            {	
               button3.setText("Pause Animation");
               timer.start();
               button2.setEnabled(false);
            }	
         }
      }
		private class Listener4 implements ChangeListener
		{
			public void stateChanged(ChangeEvent e)
			{
				slider.getValueIsAdjusting();
				int d = 100-(int)(slider.getValue());
				timer.setDelay(d);
			}
		}
   }