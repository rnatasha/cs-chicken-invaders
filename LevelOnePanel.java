import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class LevelOnePanel extends JPanel
{
    String name;
    ImageIcon avatar = new ImageIcon("bunny.png");
    Chicken[] chickens = new Chicken[60];
    Timer t;
     User  player;
    public LevelOnePanel(){
      // t = new Timer(5, new Listener());
        // t.start();
        // addMouseListener(new Mouse());
         
         addKeyListener(new Key());
         setFocusable(true);
    }
    public void paintComponent(Graphics g)
    {
      ImageIcon background = new ImageIcon("background.png");
      g.drawImage(background.getImage(), 0,0,2000,1000,null);
     int c=0;
     for(int y=15;y<=195;y+=90){
      for(int x = 100; x<=1810; x+=90){
      //we need to change the values for the coordinates, spacing is off
        chickens[c]= new Chicken(1,x,y);
        g.drawImage(chickens[c].getImageIcon().getImage(),chickens[c].getX(), chickens[c].getY(), 80,80,null);
        c++;
      }
    }
     player = new User(name, avatar);
     g.drawImage(player.getImageIcon().getImage(),player.getX(), player.getY(),150,150,null);//write User get Image method.
    }
    
    private class Key extends KeyAdapter{
         public void keyPressed(KeyEvent e){
            if(e.getKeyCode() == KeyEvent.VK_W)
               player.setY(player.getY()-10);
               if(e.getKeyCode() == KeyEvent.VK_Z)
               player.setY(player.getY()+10);
               if(e.getKeyCode() == KeyEvent.VK_A)
               player.setX(player.getX()-10);
               if(e.getKeyCode() == KeyEvent.VK_S)
               player.setX(player.getX()-10);
               repaint();
         }
      }
   /* public ImageIcon updateLives(){
    
    }*/
}
