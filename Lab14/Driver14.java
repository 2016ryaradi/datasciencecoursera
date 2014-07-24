   import javax.swing.JOptionPane;
   public class Driver14
   {
      public static void main(String[] args)
      {
         int Score = 0;
         int Frame = 1;
         int Ball = 1;
         int n= 0; 
         int s = 0;
         int sparem=1;
         int strikem=1;
         int sc=0;
         JOptionPane.showMessageDialog(null, "Welcome to TJ Bowling!");
         for(int k = Frame; k<=10; k++)
         {       
         	        
            if(Ball%2==1)
               Ball = 1;
         
            n = Integer.parseInt(JOptionPane.showInputDialog("Score: " + Score + "\nFrame " + Frame + ", Ball " + Ball));     	
            while(n>10||n<0)
            {
               JOptionPane.showMessageDialog(null, "Try Again");
               n = Integer.parseInt(JOptionPane.showInputDialog("Score: " + Score + "\nFrame " + Frame + ", Ball " + Ball));
            }
            if(n==10)
            {
               Frame++;
               Score= Score+(strikem*n*sparem);
               if(sc>=1)
                  Score=Score+10;
               if(k==10)
               {
                  Frame=10;
                  Ball=3;
                  n = Integer.parseInt(JOptionPane.showInputDialog("Score: " + Score + "\nFrame " + Frame + ", Ball " + Ball));     	
                  while(n>10||n<0)
                  {
                     JOptionPane.showMessageDialog(null, "Try Again");
                     n = Integer.parseInt(JOptionPane.showInputDialog("Score: " + Score + "\nFrame " + Frame + ", Ball " + Ball));
                  }
                  if(n==10)
                  {   
                     Score=Score+(2*10);
                     break;
                  }	
                  Score= Score+(strikem*n*sparem);
                  Ball++;
                  s = Integer.parseInt(JOptionPane.showInputDialog("Score: " + Score + "\nFrame " + Frame + ", Ball " + Ball));
               				        
                  while((n+s)>10&&n!=10||n<0)
                  {
                     JOptionPane.showMessageDialog(null, "Try Again");
                     s = Integer.parseInt(JOptionPane.showInputDialog("Score: " + Score + "\nFrame " + Frame + ", Ball " + Ball));
                  }
                  Score=Score+(s*strikem*sparem);  
                  break;   
               }
               strikem=2;
               sc+=1;		
               continue;
            }
            else
            {
               sc=1;
               Ball++;
               Score= Score+(n*strikem*sparem);
            }
            
           
            s = Integer.parseInt(JOptionPane.showInputDialog("Score: " + Score + "\nFrame " + Frame + ", Ball " + Ball));
         						        
            while((n+s)>10&&n!=10||n<0)
            {
               JOptionPane.showMessageDialog(null, "Try Again");
               s = Integer.parseInt(JOptionPane.showInputDialog("Score: " + Score + "\nFrame " + Frame + ", Ball " + Ball));
            }
            if(n+s==10)
            {
               if(k==10)
               {
                  Frame=10;
                  Ball=3;
                  s = Integer.parseInt(JOptionPane.showInputDialog("Score: " + Score + "\nFrame " + Frame + ", Ball " + Ball));
               				        
                  while((s)>10||n<0)
                  {
                     JOptionPane.showMessageDialog(null, "Try Again");
                     s = Integer.parseInt(JOptionPane.showInputDialog("Score: " + Score + "\nFrame " + Frame + ", Ball " + Ball));
                  }
                  Score=Score+(s*strikem*sparem);  
                  break;   
               }
               Frame++;
               Score = Score+s;
               sparem=2;
               Ball=1;
               continue;
            }
            sparem=1;
            Score = Score+(s*strikem);
            Ball++;
            Frame++;
            strikem=1;
         }
         JOptionPane.showMessageDialog(null, "Score: "+Score);
      }
   }