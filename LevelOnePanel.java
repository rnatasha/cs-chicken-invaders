import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class LevelOnePanel extends JPanel
{
    String name;
    ImageIcon avatar;
    Chicken[] chickens = new Chicken[50];
    public void paintComponent(Graphics g)
    {
      int c=0;
     for(int y=15;y<=105;x+=30){
      for(int x = 15; x<=1015; x+=30) {
      //we need to change the values for the coordinates, spacing is off
        chickens[c]= new Chicken(1,x,y);
        g.drawImage(chickens[c].getImage(),chickens[c].getX(), chickens[x].getY());
        c++;
      }}
      User player = new User(name, avatar);
      g.drawImage(player.getImage(),player.getX(), player.getY());//write User get Image method.
    }
}
    
