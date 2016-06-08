import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
public class AvatarPanel extends JPanel{
      CardLayout cardLayout = new CardLayout();
      private static final ImageIcon marshmallow = new ImageIcon("marshmallow.png");
      private static final ImageIcon bunny = new ImageIcon("bunny.png");
      private static final ImageIcon sadBunny = new ImageIcon("sadBunny.png");
      private static final ImageIcon rice = new ImageIcon("rice.png");
      private static final ImageIcon cookie = new ImageIcon("cookie.png"); 
      private JButton m;
      private JButton b;
      private JButton s;
      private JButton r;
      private JButton c;
      public JPanel startScreen;
   public AvatarPanel(){
      setLayout(cardLayout);
      
      m = new JButton(marshmallow);
      b = new JButton(bunny);
      s = new JButton(sadBunny);
      r = new JButton(rice);
      c = new JButton(cookie);
      
      m.setBackground(Color.white);
      b.setBackground(Color.white);
      s.setBackground(Color.white);
      r.setBackground(Color.white);
      c.setBackground(Color.white);
      //start panel
      startScreen = new JPanel();
      startScreen.setLayout(new FlowLayout());
      startScreen.setBackground(Color.white);
      add(startScreen);
      
      //avatar screen
      JPanel avatars= new JPanel();
      avatars.setLayout(new FlowLayout());
      //startScreen.add(avatars, "1");
      
      JTextField name = new JTextField("", 20);
      avatars.add(name);
      JLabel chooseAvatar = new JLabel("     Choose your avatar:          ");
      chooseAvatar.setFont(new Font("Comic Sans", Font.BOLD, 50));
      startScreen.add(chooseAvatar);
      startScreen.add(m);
      startScreen.add(b); 
      startScreen.add(s);
      startScreen.add(r);
      startScreen.add(c);
      
   }
 
}
