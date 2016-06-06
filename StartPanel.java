import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class StartPanel extends JPanel
{  JFrame frame;
   JFrame newFrame;
   public StartPanel(JFrame frame){
      this.frame=frame;
      
      background = Toolkit.getDefaultToolkit().createImage("//insert picture name");
      setLayout(new BorderLayout()); //five scores, "high score" label, and button to exit
      add(new JLabel("HIGH SCORE", SwingConstants.CENTER));
      highscore.setFont(new Font("Century Gothic", Font.BOLD, 60));
      highscore.setHorizontalAlignment(SwingConstants.CENTER);
      add(highscore, BorderLayout.NORTH);
      
      JButton start = new JButton("Start");
      start.addActionListener(new StartListener());
      
      JButton help = new JButton("Help");
      help.addActionListener(new HelpListener());
   }
      public void paintComponent(Graphics g)
   {
      ImageIcon leftChicken = new ImageIcon("Chicken without background.png");
      g.drawImage(leftChicken.getImage(), 80, 400, 100, 100, null);
      
      ImageIcon rightChicken = new ImageIcon("Chicken without background.png");
      g.drawImage(rightChicken.getImage(), 320, 400, 100, 100, null);
   }
   
   private class StartListener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            //start coding
         }
      }
      
   private class HelpListener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            //help coding
         }
      }
}
