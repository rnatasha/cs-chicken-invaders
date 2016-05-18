import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class User
{
  private int myLives;
  private double myX, myY;
  private Rocket myRocket;
  public User(){
    myLives=3;
    myX=200; //some X and Y value such that it is in the middle bottom of the screen
    myY=400;
    myRocket= new Rocket(myX, myY);
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
    myRocket.attack(e);
    /*while myRocket x-coordinate is not Enemy x-coordinate
        increase x
      while myRocket y-coordinate is not Enemy y-coordinate
        increase y
      reset myRocket at myX and myY
    */
  }
  public void draw(Graphics myBuffer, String filename){
    ImageIcon pic = new ImageIcon(filename);
    myBuffer.drawImage(pic.getImage(), 80, 80, 175, 150, null); //not the exact dimensions
  }
  private double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
  }
  public boolean isTouching(Enemy e){
    for(double x = getX(); x<=getX()+175;x++){
      for(double y = getY(); y<=getY()+150;y++){
        if(distance(x, y, e.getX(), e.getY()) <= e.getSize())
          return true;
      }
    }
    return false;
  }
   
  public void move(int x){//when used x= 1 or -1, for left or right movement along bottom of screen
    myX+=x;
  }
}
