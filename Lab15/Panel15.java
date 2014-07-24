   //Name: ________________________  Date: __________________

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel15 extends JPanel
   {
      public Panel15()
      {
         JPanel panel = new JPanel();
         panel.setLayout(new BorderLayout());
      	      
         JTextArea textArea = new JTextArea("The quick brown fox jumped over the lazy dog.",9,14);
			textArea.setFont(new Font("Serif",Font.PLAIN, 72));
         textArea.setLineWrap(true);
			add(textArea,BorderLayout.CENTER);
      	
         JPanel subpanel = new JPanel();
         subpanel.setLayout(new FlowLayout());
      	
         NamePanel namePanel = new NamePanel(textArea);
         subpanel.add(namePanel);
      	
         StylePanel stylePanel = new StylePanel(textArea);
         subpanel.add(stylePanel);
      	
         SizePanel sizePanel = new SizePanel(textArea);
         subpanel.add(sizePanel);
      	
         add(subpanel,BorderLayout.SOUTH);
      }
   }