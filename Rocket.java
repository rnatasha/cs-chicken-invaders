import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class Rocket
{
   private ImageIcon rocket = new ImageIcon("rocket.png");
   private int myX, myY;
   public Rocket(int x, int y){
      myX=x;
      myY=y;
   }
   public int getX(){
      return myX;
   }
   public int getY(){
      return myY;
   }
   public void setX(int x){
      myX=x;
   }
   public void setY(int y){
      myY=y;
   }
   public void attack(Enemy e){
      e.setLives(e.getLives()-1);
   }
   public ImageIcon getImageIcon() {
  	   return rocket;
   }
   private double distance(double x1, double y1, double x2, double y2) {
      return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
   }
   public boolean isTouching(Enemy e){
      for(double x = getX(); x<=getX()+50;x++){
         for(double y = getY(); y<=getY()+150;y++){
            if(distance(x, y, e.getX(), e.getY()) <= e.getSize())
               return true;
         }
      }
      return false;
   }
   public void update(Graphics myBuffer, Enemy e){
      if(isTouching(e))
         myBuffer.drawImage(rocket.getImage(), 3000, 3000, 0, 0, null);
      else
         myBuffer.drawImage(rocket.getImage(), getX(), getY(), 50, 150, null);
   }
}
