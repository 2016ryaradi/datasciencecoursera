	// Torbert, 7.20.06

   import javax.swing.JFrame;
	import javax.swing.JOptionPane;
    public class DriverPong
   {
       public static void main(String[] args)
      { 
			JOptionPane.showMessageDialog(null,"Instructions: Score more points than your opponent!");
         JFrame frame = new JFrame("Unit2, Pong");
         frame.setSize(408, 438);    //makes the mouse location correct
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         PongPanel p = new PongPanel();
         frame.setContentPane(p);
         p.requestFocus();
         frame.setVisible(true);
         
      }
   }
