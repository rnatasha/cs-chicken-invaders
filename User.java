import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class User
{
  private int myLives;
  private double myX, myY;
  
  public User(){
    myLives=3;
    myX=200; //some X and Y value such that it is in the middle bottom of the screen
    myY=400;
  }
  public int getLives(){
    return myLives;
  }
  public double getX(){
    return myX;
  }
  public double getY(){
    return myY;
  }
  public void setLives(int x){
    myLives=x;
  }
  public void setX(double x){
    myX=x;
  }
  public void setY(double y){
    myY=y;
  }
  public void attack(Enemy e){
    e.setLives(e.getLives()-1);
  }
  public void draw(Graphics myBuffer, String filename){
    ImageIcon pic = new ImageIcon(filename);
    myBuffer.drawImage(pic.getImage(), 80, 80, 175, 150, null); //not the exact dimensions
  }
  public boolean isTouching(Enemy e){
    double d = distance(myX, myY, e.getX(), e.getY());
        if(d <= b.getRadius() + pd.getRadius())
         
    return true;
  }
  public void move(int x){//when used x= 1 or -1, for left or right movement along bottom of screen
    myX+=x;
  }
}
