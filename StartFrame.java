import javax.swing.*;
public class StartFrame{
   public static void main(String[] args){
      JFrame frame = new JFrame("Start Frame");
      frame.setVisible(true);
      frame.setLocation(100,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new StartPanel(frame));
      frame.setSize(500,500);
   }
}
