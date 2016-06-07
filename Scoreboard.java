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
   private static JPanel subpanel;
   private static JLabel highscore, score1, score2, score3, score4, score5;
   private static User[] array = input("data.txt");
   Scanner infile;
   
      /*public void paintComponent(Graphics g)
   {
      ImageIcon background = new ImageIcon("scoreboard.jpg");
      g.drawImage(background.getImage(), 1, 1, 100, 400, null);
   }*/
   
   public Scoreboard()
   {
      setLayout(new BorderLayout()); //five scores, "high score" label, and button to exit
      highscore=new JLabel("HIGH SCORE", SwingConstants.CENTER);
      add(highscore);
      highscore.setFont(new Font("Serif", Font.BOLD, 30));
      highscore.setHorizontalAlignment(SwingConstants.CENTER);
      add(highscore, BorderLayout.NORTH);
         
      subpanel = new JPanel();
      subpanel.setLayout(new GridLayout(5, 1)); //5,1 for grid
      add(subpanel, BorderLayout.CENTER);
      
      sort(array);
      output(array);
      
      score1 = new JLabel("1.\t" + array[0].toString());
      score1.setFont(new Font("Serif", Font.BOLD, 30));
      score1.setForeground(new Color(179, 218, 255));
      score1.setHorizontalAlignment(SwingConstants.CENTER);
      score1.setForeground(Color.black);
      subpanel.add(score1);
       
      score2 = new JLabel("2.\t" + array[1].toString());
      score2.setFont(new Font("Serif", Font.BOLD, 30));
      score2.setForeground(new Color(179, 218, 255));
      score2.setHorizontalAlignment(SwingConstants.CENTER);
      score2.setForeground(Color.black);
      subpanel.add(score2);
         
      score3 = new JLabel("3.\t" + array[2].toString());
      score3.setFont(new Font("Serif", Font.BOLD, 30));
      score3.setForeground(new Color(179, 218, 255));
      score3.setHorizontalAlignment(SwingConstants.CENTER);
      score3.setForeground(Color.black);
      subpanel.add(score3);
         
      score4 = new JLabel("4.\t" + array[3].toString());
      score4.setFont(new Font("Serif", Font.BOLD, 30));
      score4.setForeground(new Color(179, 218, 255));
      score4.setHorizontalAlignment(SwingConstants.CENTER);
      score4.setForeground(Color.black);
      subpanel.add(score4);
         
      score5 = new JLabel("5.\t" + array[4].toString());
      score5.setFont(new Font("Serif", Font.BOLD, 30));
      score5.setForeground(new Color(179, 218, 255));
      score5.setHorizontalAlignment(SwingConstants.CENTER);
      score5.setForeground(Color.black);
      subpanel.add(score5);
     
      JButton exit = new JButton("Exit");
      exit.addActionListener(new ExitListener());
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
      int numitems = infile.nextInt();//has next
      array = new User[numitems];
      for(int k = 0; k < numitems; k++)//"name  score" same line in data.txt
         array[k] = new User(infile.next(), infile.nextInt());
      infile.close();
      return array;
   }
          
   public static User[] sort(User[] array)  //need findMin method
   {
      int minPos;
      for(int k = 0; k < array.length; k++)
      {
         minPos = findMin(array, array.length - k);
         swap(array, minPos, array.length-k-1);
      }
      return array;
   }
      
   public static int findMin(User[] array, int upper)
   {
      int minPos = 0;
      for(int j = 1; j < upper; j++)
      {
         if(array[j].getScore() < array[minPos].getScore())
            minPos = j;
      }
      return minPos;
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
         outfile = new PrintStream(new FileOutputStream("data.txt", true));
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
