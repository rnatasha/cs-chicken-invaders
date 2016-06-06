import java.awt.Color;
import java.util.Comparator;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
public class Scoreboard extends JPanel
{
   private JLabel highscore, score1, score2, score3, score4, score5;
   private Image background;
   private static User[] array = input("data.txt");
   Scanner infile;
      
   public static void main(String[] args)
   {
      sort(array);
      output(array);
   }
   public Scoreboard()
   {
      background = Toolkit.getDefaultToolkit().createImage("//insert picture name");
      setLayout(new GridLayout(1, 3)); //five scores, "high score" label, and button to exit
      add(new JLabel("HIGH SCORE", SwingConstants.CENTER));
      highscore.setFont(new Font("Century Gothic", Font.BOLD, 60));
      highscore.setHorizontalAlignment(SwingConstants.CENTER);
      add(highscore);
         
      JPanel subpanel = new JPanel();
      subpanel.setLayout(new GridLayout(1, 5));
      add(subpanel);
         
      score1 = new JLabel(array[0].toString());
      score1.setFont(new Font("Serif", Font.BOLD, 30));
      score1.setForeground(new Color(179, 218, 255));
      score1.setHorizontalAlignment(SwingConstants.LEFT);
      score1.setForeground(Color.black);
      subpanel.add(score1);
         
      score2 = new JLabel(array[1].toString());
      score2.setFont(new Font("Serif", Font.BOLD, 30));
      score2.setForeground(new Color(179, 218, 255));
      score2.setHorizontalAlignment(SwingConstants.LEFT);
      score2.setForeground(Color.black);
      subpanel.add(score2);
         
      score3 = new JLabel(array[2].toString());
      score3.setFont(new Font("Serif", Font.BOLD, 30));
      score3.setForeground(new Color(179, 218, 255));
      score3.setHorizontalAlignment(SwingConstants.LEFT);
      score3.setForeground(Color.black);
      subpanel.add(score3);
         
      score4 = new JLabel(array[3].toString());
      score4.setFont(new Font("Serif", Font.BOLD, 30));
      score4.setForeground(new Color(179, 218, 255));
      score4.setHorizontalAlignment(SwingConstants.LEFT);
      score4.setForeground(Color.black);
      subpanel.add(score4);
         
      score5 = new JLabel(array[4].toString());
      score5.setFont(new Font("Serif", Font.BOLD, 30));
      score5.setForeground(new Color(179, 218, 255));
      score5.setHorizontalAlignment(SwingConstants.LEFT);
      score5.setForeground(Color.black);
      subpanel.add(score5);
         
      JButton exit = new JButton("Exit");
      exit.addActionListener(new ExitListener());
   }
      
   public void paintComponent(Graphics g)
   {
      g.drawImage(background, 0, 0, null);
   }
      
   private class ExitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }
      
   public static User[] input(String filename)
   {
      Scanner infile = null;
      try{
         infile = new Scanner(new File(filename));
      }
      catch (FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null, "The file could not be found.");
         System.exit(0);
      }
      int numitems = infile.nextInt();
      array = new User[numitems];
      for(int k = 0; k < numitems; k++)
         array[k] = new User(infile.nextLine(), infile.nextInt());
      infile.close();
      return array;
   }
          
   public static User[] sort(User[] array)  //need findMin method
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k);
         swap(array, maxPos, array.length-k-1);
      }
      return array;
   }
      
   public static int findMax(User[] array, int upper)
   {
      int maxPos = 0;
      for(int j = 1; j < upper; j++)
      {
         if(array[j].getScore() > array[maxPos].getScore())
            maxPos = j;
      }
      return maxPos;
   }
      
   public static void swap(User[] array, int a, int b)
   {
      User temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
      
   public static void output(User[] array) //throws Exception
   {
      PrintStream outfile = null;
      try{
         outfile = new PrintStream(new FileOutputStream("data.txt"));
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null, "The file could not be created.");
         for(int k = 0; k < array.length; k++)
         {
            outfile.println(array[k].getName() + "\n" + array[k].getScore());
         }
         outfile.close();
      }
   }
}
