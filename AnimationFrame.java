import javax.swing.*;
public class AnimationFrame{
   public static void main(String[] args){
      JFrame frame = new JFrame("Animations");
      frame.setLocation(100,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new AnimationPanel());
      frame.setSize(650, 520);
      frame.setVisible(true);
   }
   
}
