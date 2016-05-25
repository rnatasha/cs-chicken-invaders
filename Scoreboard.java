
   import javax.swing.*;
   import java.awt.*; //testing to see if two people can work on it at once 
   public class Scoreboard extends JPanel
   {
      private JLabel highscore, score1, score2, score3, score4, score5;
      public Scoreboard10()
      {
         setLayout(new BoxLayout(1, 3)); //five scores, "high score" label, and button to play again
         add(new JLabel("HIGH SCORE", SwingConstants.CENTER));
         highscore.setFont(new Font("Century Gothic", Font.BOLD, 60));
         highscore.setHorizontalAlignment(SwingConstants.CENTER);
         add(highscore);
         
         JPanel subpanel = new JPanel();
         panel.setLayout(new BoxLayout(1, 5));
         add(panel);
         
         label = new JLabel("");
         label.setFont(new Font("Serif", Font.BOLD, 30));
         label.setHorizontalAlignment(SwingConstants.CENTER);
         label.setForeground(Color.black);
         add(label, BorderLayout.NORTH);
         /*add(new JLabel("Run: ", SwingConstants.RIGHT));
         label1 = new JLabel(""+run);
         label1.setHorizontalAlignment(SwingConstants.LEFT);
         add(label1);
         label2 = new JLabel("---");
         label2.setHorizontalAlignment(SwingConstants.CENTER);
         label2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
         add(label2);
         add(new JLabel("Max: ", SwingConstants.RIGHT));
         label3 = new JLabel(""+max);
         label3.setHorizontalAlignment(SwingConstants.LEFT);
         add(label3);*/
      }
      public void update(boolean arg) //if arg is true, the player guessed correctly
      {
         if (arg == true) 
         {
         label2.setText("Yes");
         run++;
         if (max < run)
         {
         max = run;
         }
         label1.setText(""+run);
         label3.setText(""+ max);
         }
         else
         {
         label2.setText("No");
         run =0;
         label1.setText("" + run);
         }
      }
   }
