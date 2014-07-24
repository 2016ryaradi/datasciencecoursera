	// Phil Ero 15JUL08
	
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   
   public class PongPanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private static final Color BALL_COLOR = Color.BLACK;
      private static final Color PRIZE_COLOR = Color.RED;
      private static final Color BUMPER_COLOR = Color.BLUE;
      private static final double BALL_DIAM = 50;
      private static final double PRIZE_DIAM = 25;
      private static final int BUMPER_X_WIDTH = 75;
      private static final int BUMPER_Y_WIDTH = 125;
   	
      private int rightEdge = FRAME;
      private int leftEdge = 0;
   
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Bumper player1;
      private Bumper player2;
      private int hits1;
      private int hits2;
      private Timer timer;    
      
      public PongPanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         
         ball = new Ball();
         ball.jump(FRAME,FRAME);
      
         player1 = new Bumper(0,200,20,80,Color.RED);      	
         player2 = new Bumper(380,200,20,80,Color.BLUE);      	
      	         
         hits1 = 0;
         hits2 = 0;
         timer = new Timer(5, new Listener());
      	      
         timer.start();
         addKeyListener(new  Key());
         setFocusable(true);
      	
      }
      
      public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
      private class Key extends KeyAdapter
      {
         public void keyPressed( KeyEvent e )
         {
            if(e.getKeyCode()==KeyEvent.VK_W)
               player1.setY( player1.getY()-10 );
            if(e.getKeyCode()==KeyEvent.VK_S)
               player1.setY( player1.getY()+10 );
            if(e.getKeyCode()==KeyEvent.VK_UP)
               player2.setY( player2.getY()-10 );
            if(e.getKeyCode()==KeyEvent.VK_DOWN)
               player2.setY( player2.getY()+10 );
         }
      }
   
      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {    
          	// clear buffer and move ball
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0,0,FRAME,FRAME); 
            ball.move(FRAME, FRAME);
          
         	// draw ball, bumper
            ball.draw(myBuffer);
            player1.draw(myBuffer);
            player2.draw(myBuffer);
         
            // check for collisions
            BumperCollision.collide(player1, ball);
            BumperCollision.collide(player2, ball);  
         	
            if(ball.getX() >= rightEdge - ball.getRadius())     //hits the right edge
               hits1++;

            if(ball.getX() <= ball.getRadius() - leftEdge)     //hits the left edge
               hits2++;               
					
            // update hits on buffer
            myBuffer.setColor(Color.black);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Score: " + hits1 + "-" + hits2, FRAME - 200, 25);
            
            repaint();
         }
      } 
   	
   }
   	
         		
