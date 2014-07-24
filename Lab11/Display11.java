   //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class Display11 extends JPanel
   {
      private JLabel label1, labelNim, label2, labelPic;
      private JTextField box1, box2, box3;
      private int turn=1;
      private int s = 12;
		private int k = 1;
		private int j = 1;
      public Display11()
      {
         setLayout(new FlowLayout());
      	            
         label1 = new JLabel("One:");
         label1.setFont(new Font("Serif", Font.BOLD, 15));
         label1.setForeground(Color.black);
         label1.setBackground(Color.YELLOW);
         label1.setOpaque(true);
         add(label1);
      	
         labelNim = new JLabel("Nim");
         labelNim.setFont(new Font("Serif", Font.BOLD, 20));
         labelNim.setForeground(Color.black);
         add(labelNim);
      	
         label2 = new JLabel("Two:");
         label2.setFont(new Font("Serif", Font.BOLD, 15));
         label2.setForeground(Color.black);
         label2.setBackground(Color.LIGHT_GRAY);
         label2.setOpaque(true);
         add(label2);
      	
         labelPic = new JLabel();
         labelPic.setIcon(new ImageIcon("stones12.jpg"));
         labelPic.setBackground(Color.LIGHT_GRAY);    
         labelPic.setOpaque(true);
         add(labelPic);
      }
      public void removeOne()
      {
         turn++;
         if(turn%2==0)
         {
            label2.setBackground(Color.YELLOW);
            label1.setBackground(Color.LIGHT_GRAY);
         }
         else
         {
            label1.setBackground(Color.YELLOW);
            label2.setBackground(Color.LIGHT_GRAY); 
         }     
         s--;
         if(s==11)
         {
            ImageIcon eleven = new ImageIcon("stones11.jpg");
            labelPic.setIcon(eleven);
         }
         else if(s==10)
         {
            ImageIcon ten = new ImageIcon("stones10.jpg");
            labelPic.setIcon(ten);
         }
         
         else if(s==9)
         {
            ImageIcon nine = new ImageIcon("stones9.jpg");
            labelPic.setIcon(nine);
         }
         
         else if(s==8)
         {
            ImageIcon eight = new ImageIcon("stones8.jpg");
            labelPic.setIcon(eight);
         }
         
         else if(s==7)
         {
            ImageIcon seven = new ImageIcon("stones7.jpg");
            labelPic.setIcon(seven);
         }
         
         else if(s==6)
         {
            ImageIcon six = new ImageIcon("stones6.jpg");
            labelPic.setIcon(six);
         }
         
         else if(s==5)
         {
            ImageIcon five = new ImageIcon("stones5.jpg");
            labelPic.setIcon(five);
         }
         
         else if(s==4)
         {
            ImageIcon four = new ImageIcon("stones4.jpg");
            labelPic.setIcon(four);
         }
         
         else if(s==3)
         {
            ImageIcon three = new ImageIcon("stones3.jpg");
            labelPic.setIcon(three);
         }
         
         else if(s==2)
         {
            ImageIcon two = new ImageIcon("stones2.jpg");
            labelPic.setIcon(two);
         }
         
         else if(s==1)
         {
            ImageIcon one = new ImageIcon("stones1.jpg");
            labelPic.setIcon(one);
         }
         else if(s==0)
         {
            ImageIcon twelve = new ImageIcon("stones12.jpg");
            labelPic.setIcon(twelve);
            s=12;
            if(turn%2==0)
				{
               label1.setText("One:"+k);
					k++;
				}
            else
				{
               label2.setText("Two:"+j);      
					j++;
				}
            turn=1;
         }
      }
      public void removeTwo()
      {
         turn++;
         if(turn%2==0)
         {
            label2.setBackground(Color.YELLOW);
            label1.setBackground(Color.LIGHT_GRAY);
         }
         else
         {
            label1.setBackground(Color.YELLOW);
            label2.setBackground(Color.LIGHT_GRAY); 
         }       
         s=(s-2);
         if(s==11)
         {
            ImageIcon eleven = new ImageIcon("stones11.jpg");
            labelPic.setIcon(eleven);
         }
         else if(s==10)
         {
            ImageIcon ten = new ImageIcon("stones10.jpg");
            labelPic.setIcon(ten);
         }
         
         else if(s==9)
         {
            ImageIcon nine = new ImageIcon("stones9.jpg");
            labelPic.setIcon(nine);
         }
         
         else if(s==8)
         {
            ImageIcon eight = new ImageIcon("stones8.jpg");
            labelPic.setIcon(eight);
         }
         
         else if(s==7)
         {
            ImageIcon seven = new ImageIcon("stones7.jpg");
            labelPic.setIcon(seven);
         }
         
         else if(s==6)
         {
            ImageIcon six = new ImageIcon("stones6.jpg");
            labelPic.setIcon(six);
         }
         
         else if(s==5)
         {
            ImageIcon five = new ImageIcon("stones5.jpg");
            labelPic.setIcon(five);
         }
         
         else if(s==4)
         {
            ImageIcon four = new ImageIcon("stones4.jpg");
            labelPic.setIcon(four);
         }
         
         else if(s==3)
         {
            ImageIcon three = new ImageIcon("stones3.jpg");
            labelPic.setIcon(three);
         }
         
         else if(s==2)
         {
            ImageIcon two = new ImageIcon("stones2.jpg");
            labelPic.setIcon(two);
         }
         
         else if(s==1)
         {
            ImageIcon one = new ImageIcon("stones1.jpg");
            labelPic.setIcon(one);
         }
         else if(s==0)
         {
            ImageIcon twelve = new ImageIcon("stones12.jpg");
            labelPic.setIcon(twelve);
            s=12;
				if(turn%2==0)
				{
               label1.setText("One:"+k);
					k++;
				}
            else
				{
               label2.setText("Two:"+j);
					j++;
				} 
            turn=1;
         }
      }
      public void removeThree()
      {
         turn++;
         if(turn%2==0)
         {
            label2.setBackground(Color.YELLOW);
            label1.setBackground(Color.LIGHT_GRAY);
         }
         else
         {
            label1.setBackground(Color.YELLOW);
            label2.setBackground(Color.LIGHT_GRAY); 
         } 
         s=(s-3);
         if(s==11)
         {
            ImageIcon eleven = new ImageIcon("stones11.jpg");
            labelPic.setIcon(eleven);
         }
         else if(s==10)
         {
            ImageIcon ten = new ImageIcon("stones10.jpg");
            labelPic.setIcon(ten);
         }
         
         else if(s==9)
         {
            ImageIcon nine = new ImageIcon("stones9.jpg");
            labelPic.setIcon(nine);
         }
         
         else if(s==8)
         {
            ImageIcon eight = new ImageIcon("stones8.jpg");
            labelPic.setIcon(eight);
         }
         
         else if(s==7)
         {
            ImageIcon seven = new ImageIcon("stones7.jpg");
            labelPic.setIcon(seven);
         }
         
         else if(s==6)
         {
            ImageIcon six = new ImageIcon("stones6.jpg");
            labelPic.setIcon(six);
         }
         
         else if(s==5)
         {
            ImageIcon five = new ImageIcon("stones5.jpg");
            labelPic.setIcon(five);
         }
         
         else if(s==4)
         {
            ImageIcon four = new ImageIcon("stones4.jpg");
            labelPic.setIcon(four);
         }
         
         else if(s==3)
         {
            ImageIcon three = new ImageIcon("stones3.jpg");
            labelPic.setIcon(three);
         }
         
         else if(s==2)
         {
            ImageIcon two = new ImageIcon("stones2.jpg");
            labelPic.setIcon(two);
         }
         
         else if(s==1)
         {
            ImageIcon one = new ImageIcon("stones1.jpg");
            labelPic.setIcon(one);
         }
         else if(s==0)
         {
            ImageIcon twelve = new ImageIcon("stones12.jpg");
            labelPic.setIcon(twelve);
            s=12;
				if(turn%2==0)
				{
               label1.setText("One:"+k);
					k++;
				}
            else
				{
               label2.setText("Two:"+j);
					j++;
				} 
            turn=1;
         }
      }
   }