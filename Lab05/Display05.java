 	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Display05 extends JPanel
   {
      private JLabel label1, label2, label3;
      private int value, total, highscore;
      public Display05()
      {
         setLayout(new GridLayout(3, 1));
         Font f = new Font("Serif", Font.BOLD, 30);
         total = value = highscore = 0;
      
         label1 = new JLabel("Value: " + value);
         label1.setFont(f);
         label1.setForeground(Color.blue);
         add(label1);
      
         label2 = new JLabel("Total: " + total);
         label2.setFont(f);
         label2.setForeground(Color.blue);
         add(label2);
      	
         label3 = new JLabel("High Score: " + highscore);
         label3.setFont(f);
         label3.setForeground(Color.blue);
         add(label3);
      }
      public void update()
      {
         value = (int)(Math.random()*10+1);
			label1.setText("Value: "+value);
         if(value == 1 || value==2)
         {
            if(total > highscore)
				{
               highscore = total;
					label3.setText("High Score: "+highscore);
				}
            total = 0;
				label2.setText("Total: "+total);
         }
			else
			{	
				total = value+total;
				label2.setText("Total: "+total);
			}
      
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      
      }
   }