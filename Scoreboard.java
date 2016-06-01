
   import javax.swing.*;
   import java.awt.*; 
   public class Scoreboard extends JPanel
   {
      private JLabel highscore, score1, score2, score3, score4, score5;
      Image background;
      public Scoreboard10()
      {
         background = Toolkit.getDefaultToolkit().createImage("//insert picture name");
         setLayout(new BoxLayout(1, 3)); //five scores, "high score" label, and button to play again
         add(new JLabel("HIGH SCORE", SwingConstants.CENTER));
         highscore.setFont(new Font("Century Gothic", Font.BOLD, 60));
         highscore.setHorizontalAlignment(SwingConstants.CENTER);
         add(highscore);
         
         JPanel subpanel = new JPanel();
         subpanel.setLayout(new BoxLayout(1, 5));
         add(subpanel);
         
         score1 = new JLabel("");
         score1.setFont(new Font("Serif", Font.BOLD, 30));
         score1.setHorizontalAlignment(SwingConstants.LEFT);
         score1.setForeground(Color.black);
         subpanel.add(score1);\
         
         score2 = new JLabel("");
         score2.setFont(new Font("Serif", Font.BOLD, 30));
         score2.setHorizontalAlignment(SwingConstants.LEFT);
         score2.setForeground(Color.black);
         subpanel.add(score2);
         
         score3 = new JLabel("");
         score3.setFont(new Font("Serif", Font.BOLD, 30));
         score3.setHorizontalAlignment(SwingConstants.LEFT);
         score3.setForeground(Color.black);
         subpanel.add(score3);
         
         score4 = new JLabel("");
         score4.setFont(new Font("Serif", Font.BOLD, 30));
         score4.setHorizontalAlignment(SwingConstants.LEFT);
         score4.setForeground(Color.black);
         subpanel.add(score4);
         
         score5 = new JLabel("");
         score5.setFont(new Font("Serif", Font.BOLD, 30));
         score5.setHorizontalAlignment(SwingConstants.LEFT);
         score5.setForeground(Color.black);
         subpanel.add(score5);
         
         JButton exit = new JButton("Exit");
         button1.addActionListener(new Listener1());
      }
      
      public void paint(Graphics g)
      {
         g.drawImage(background, 0, 0, null);
      }
      public void update(boolean arg)
      {
         //load the top 5 people
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            System.out.exit(0);
         }
      }
   }
