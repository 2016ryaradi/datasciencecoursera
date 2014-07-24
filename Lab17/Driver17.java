   import javax.swing.JFrame;
   public class Driver17
   {
      public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit3, Lab17: Graphics and GUIs");
         frame.setSize(400, 400);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel17());
         frame.setVisible(true);
      }
   }