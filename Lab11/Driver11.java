   import javax.swing.JFrame;

   public class Driver11
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Last Stone Wins");
         frame.setSize(325, 325);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel11());
         frame.setVisible(true);
      }
   }