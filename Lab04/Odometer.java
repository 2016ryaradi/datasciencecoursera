	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Odometer extends JPanel
   {
      private JLabel label1;
      private JLabel label2;
      private JLabel label3;
      private int count1;
      private int count2;
      private int count3;
   
      public Odometer()
      {
         count1 = 0;
         count2 = 0;
         count3 = 0;
			
  			setBackground(Color.BLACK);    
		
         JPanel panel = new JPanel();
         panel.setLayout(new FlowLayout());
         panel.setBackground(Color.BLACK);      
         add(panel);
      	
         label3 = new JLabel("0");
         label3.setFont(new Font("Serif", Font.BOLD, 100));
         label3.setForeground(Color.white);
         label3.setBackground(Color.black);
         label3.setOpaque(true);
         add(label3);
         
         label2 = new JLabel("0");
         label2.setFont(new Font("Serif", Font.BOLD, 100));
         label2.setForeground(Color.white);
         label2.setBackground(Color.black);
         label2.setOpaque(true);
         add(label2);
      
         label1 = new JLabel("0");
         label1.setFont(new Font("Serif", Font.BOLD, 100));
         label1.setForeground(Color.black);
         label1.setBackground(Color.white);		
         label1.setOpaque(true);      
         add(label1);
      }
      public void update()
      {
         count1++;
         label1.setText(""+count1);
         if(count1 == 10)
         {
            count1=0;
            count2++;
            label1.setText(""+count1);
            label2.setText(""+count2);
            if(count2 == 10)
            {
               count2=0;
               count3++;
               label2.setText(""+count2);
               label3.setText(""+count3);
               if(count3 == 10)
               {
                  count3=0;
                  label3.setText(""+count3);
               }
            }
         }
      }
   }