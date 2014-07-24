	// Phil Ero 15JUL08
	
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   
   public class BumperPanel extends JPanel
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
   
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot prize;
      private Bumper bumper;
      private int hits;
      
      public BumperPanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
      //          myBuffer.setColor(BACKGROUND);
      //          myBuffer.fillRect(0,0,FRAME,FRAME);
      
         ball = new Ball();
         ball.jump(300,FRAME);
      
      
         prize = new Polkadot();
         prize.jump(300,FRAME);   
            
         bumper = new Bumper();
         bumper.jump(300,FRAME); 
      	
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0,0,FRAME,FRAME);
         ball.move(FRAME,FRAME);
         	
         ball.draw(myBuffer);
         prize.draw(myBuffer);
         bumper.draw(myBuffer);
      	
         hits = 0;
      
         	
         myBuffer.setColor(Color.black);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
      
      	
      }
      
      public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
      
      public void collide(Ball b, Polkadot p)
      {
         double dist = distance(b.getX(), b.getY(), p.getX(), p.getY());
         
         if(dist < p.getRadius() + b.getRadius())
         {
            hits++;
            p.jump(FRAME,FRAME);    	
         }
      }
   		
      private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }
      public void jumpAll()
      {
         ball.jump(300,FRAME);
         prize.jump(300,FRAME);
         bumper.jump(300,FRAME);
      }
      public void stepAnimation()
      {
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0,0,FRAME,FRAME);
         ball.move(FRAME,FRAME);
         	
         ball.draw(myBuffer);
         prize.draw(myBuffer);
         bumper.draw(myBuffer);
         	
         myBuffer.setColor(Color.black);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
         myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
      	
         collide(ball, prize);
         BumperCollision.collide(bumper, ball);
         while(bumper.inBumper(prize))
            prize.jump(FRAME, FRAME);
         repaint();
      }
   }