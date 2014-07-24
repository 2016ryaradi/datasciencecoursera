   import javax.swing.JOptionPane;
   public class Driver13
   {
      public static void main(String[] args)
      {
         while(true)
         {
            int numberOne = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a digit from 0 to 9: (-1 for exit)"));
				if(numberOne==-1)
				{
					System.out.println("Goodbye!");
					System.exit(0);
				}
            int numberTwo = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter another digit from 0 to 9: (-1 for exit)"));
				if(numberTwo==-1)
				{
					System.out.println("Goodbye!");
					System.exit(0);
				}
            if(numberOne >= 10 || numberTwo >= 10||numberOne<-1||numberTwo<-1)
            {
               System.out.println("Invalid");
               System.exit(0);
            }
            int Iterations = 0;
            int d, f;
            d = (numberOne+numberTwo)%10;
            f = (numberTwo+d)%10;
            System.out.print(numberOne+""+numberTwo+""+d+""+f);
            Iterations += 2;
            while(d!=numberOne||f!=numberTwo)
            {
               d = (d+f)%10;
               f = (f+d)%10;
               System.out.print(d+""+f+"");
               Iterations+=2;
            }
            System.out.println("\nIterations: " + Iterations);
         }
      }
   }