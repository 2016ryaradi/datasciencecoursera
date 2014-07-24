   //Name______________________________ Date_____________
   import javax.swing.JOptionPane;
   public class Driver12
   {
      public static void main(String[] args)
      {
         while(true)
         {
            int n = Integer.parseInt(JOptionPane.showInputDialog("How many rows? (-1 to quit)"));
            if(n == -1)
            {
               System.out.println("Bye-bye!");
               System.exit(0);
            }
            String message = "What type? (1-4)";
            message = message + "\n1. Standard";
            message = message + "\n2. Backward";
            message = message + "\n3. Pyramid";
            message = message + "\n4. Box with X";
            int type = Integer.parseInt(JOptionPane.showInputDialog(message));
            switch(type)
            {
               case 1: standard(n);
                  break;
               case 2: backward(n);
                  break;
               case 3: pyramid(n);
                  break;
               case 4: box(n);
                  break;
               default: System.out.println("Not a valid type.");
                  break;
            }
            System.out.println();
         }
      }
      public static void standard(int n)
      {
         for(int rowst = 1; rowst <= n; rowst++)
         {
            for(int j = 1; j <= rowst; j++)
            {
               System.out.print("*");
            }
            System.out.println();
         }
      }
      public static void backward(int n)
      {
         for(int rowba = n; rowba >= 1; rowba--)
         {
            for(int i = rowba; i>=1; i--)
            {
               System.out.print(" ");
            }
            for(int k = 1; k<=(n-rowba); k++)
            {
               System.out.print("*");
            }
            System.out.println();
         }
      }
      public static void pyramid(int n)
      {
         for(int rowpy = n; rowpy >= 1; rowpy--)
         {
            for(int i = rowpy; i>=1; i--)
            {
               System.out.print(" ");
            }
            for(int k = 1; k<=(n-rowpy); k++)
            {
               System.out.print("*");
            }
            for(int j = 1;j<=(n-rowpy+1);j++)
            {
               System.out.print("*");
            }
            System.out.println();
         }
      
      }
      public static void box(int n)
      {
      	for(int row = 1; row <= n; row++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int row = 1; row <= ((n-3)/2); row++)
			{
				System.out.print("*");
			}
			for(int rowTwo = 1; rowTwo <= (n/2); rowTwo++)
			{
				System.out.print(" ");
			}
			for(int rowThree = 1; rowThree <= ((n-3)/2); rowThree++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int row = 1; row <= ((n+1)/2); row++)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int row = 1; row <= ((n-1)/2); row++)
			{
				System.out.print("*  ");
			}
			System.out.println();
			for(int row = 1; row <= ((n+1)/2); row++)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int row = 1; row <= ((n-3)/2); row++)
			{
				System.out.print("*");
			}
			for(int rowTwo = 1; rowTwo <= (n/2); rowTwo++)
			{
				System.out.print(" ");
			}
			for(int rowThree = 1; rowThree <= ((n-3)/2); rowThree++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int row = 1; row <= n; row++)
			{
				System.out.print("*");
			}
      }
   }