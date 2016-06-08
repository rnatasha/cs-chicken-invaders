import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class User
{
  private int myLives, myScore;
  private int myX, myY;
  private Rocket myRocket;
  private String myName;
  private ImageIcon myAvatar;
  public User(String name, String avatar){
    myLives=3;
    myX=900; //some X and Y value such that it is in the middle bottom of the screen
    myY=850;
    myRocket= new Rocket(myX, myY);
    myAvatar = new ImageIcon(avatar);
    myScore = 0;
    myName = name;
  }
  public User(String name, String avatar, int score){
   myLives=3;
    myX=900; //some X and Y value such that it is in the middle bottom of the screen
    myY=850;
    myRocket= new Rocket(myX, myY);
    myAvatar = new ImageIcon(avatar);
    myScore=score;
    myName = name;
  }
  public User(String name, int score){
   myLives=3;
    myX=900; //some X and Y value such that it is in the middle bottom of the screen
    myY=850;
    myRocket= new Rocket(myX, myY);
    //myAvatar = new ImageIcon(avatar);
    myScore=score;
    myName = name;
  }
  public int getLives(){
    return myLives;
  }
  public int getX(){
    return myX;
  }
  public int getY(){
    return myY;
  }
  public int getScore(){
    return myScore;
  }
  public ImageIcon getImageIcon(){
      return myAvatar;
  }
  public String getName(){
   return myName;
  }
  public void setLives(int x){
    myLives=x;
  }
  public void setX(int x){
    myX=x;
  }
  public void setY(int y){
    myY=y;
  }
  public void setScore(int s){
    myScore= s;
  }
  public void setName(String name){
      myName = name;
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
  public void update(Graphics myBuffer, int x){
    move(x);
    myBuffer.drawImage(myAvatar.getImage(), getX(), getY(), 150, 150, null); //not the exact dimensions
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
  public String toString(){
   return myName +"\t\t"+myScore;
  }
}
