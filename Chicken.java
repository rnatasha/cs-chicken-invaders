import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
   /*****************************************************************
	* A Chicken is an Ememy that maintains information about its lives. A Chicken
	* knows how to return its lives, set its lives, attack a User, 
	* and drop an Egg object to the bottom edge of the screen.
	 
	* @author 
	* @version 
	****************************************************************/
public class Chicken extends Enemy
{
  private int myLives, mySize;
  private int myX, myY;
  private ImageIcon chicken = new ImageIcon("Chicken without background.png");
  private Egg myEgg;
   /************************************************************* 
   * Constructs a Chicken with initial coordinates specified by x and y,
   * the number of lives specified by (n-1)/5 + 1, where n is level number, and the size 
   * specified by 20. Initializes Egg object with Chicken's x and y coordinates.
   **************************************************************/
  public Chicken(int n, int x, int y)
  {
    myLives=(n-1)/5 +1;
    mySize=20; //SOME DEFAULT SIZE FOR ALL THE SMALL CHICKENS?
    myX=x;
    myY=y;
    myEgg = new Egg(myX, myY);
  }
   /************************************************************* 
   * Constructs a "Big Boss" Chicken with initial coordinates specified by x and y,
   * the number of lives specified by (n/5)*50, where n is level number, and the size 
   * specified by s. Initializes Egg object with Chicken's x and y coordinates.
   **************************************************************/
  public Chicken(int n, int s, int x, int y){
    myLives=(n/5)*50;
    mySize=s;
    myX=x;
    myY=y;
    myEgg=new Egg(myX, myY);
  }
   /*************************************************************** 
   * Returns the Chicken's lives
   * @return	 lives
   **************************************************************/
  public int getLives(){
    return myLives;
  }
   /*************************************************************** 
   * Returns the Chicken's size
   * @return	 size
   **************************************************************/
  public int getSize(){ //not sure if we'll be needing this
    return mySize;
  }
   /*************************************************************** 
   * Returns the Chicken's x coordinate
   * @return	 X
   **************************************************************/
  public int getX(){
    return myX;
  }
   /*************************************************************** 
   * Returns the Chicken's y coordinate
   * @return	 Y
   **************************************************************/
  public int getY(){
    return myY;
  }
  public ImageIcon getImageIcon(){
  	return chicken;
  }
   /***************************************************************
   * Sets the number of lives
   * @param x	 assigns x to myLives
   **************************************************************/
  public void setLives(int x){ //not sure if this is necessary either, or if attack method will do
    myLives=x;
  }
   /***************************************************************
   * Sets the Chicken's size
   * @param s	 assigns s to mySize
   **************************************************************/
  public void setSize(int s){
    mySize=s;
  }
   /***************************************************************
   * Sets the x coordinate
   * @param x	 assigns x to myX or the Chicken's x coordinate
   **************************************************************/
  public void setX(int x){
    myX=x;
  }
   /***************************************************************
   * Sets the y coordinate
   * @param y	 assigns y to myY or the Chicken's y coordinate
   **************************************************************/
  public void setY(int y){
    myY=y;
  }
   /***************************************************************
   * Attacks the User passed by subtracting 1 life
   * @param u	sets User's lives to current lives minus 1 
   **************************************************************/
  public void attack(User u){
    u.setLives(u.getLives()-1);
  }
   /**************************************************************************************************************
   * Calls the release() method of Chicken's Egg object and re-initializes myEgg to x and y coordinates of Chicken
   * @param bottomEdge	passed to release() method of Egg
   **************************************************************/
  public void dropEgg(double bottomEdge){
    myEgg.release(bottomEdge);
    //repaint egg
    myEgg= new Egg(myX,myY);
  }
  public void update(Graphics myBuffer){
   if(getLives()==0)
      myBuffer.drawImage(chicken.getImage(), 3000,3000
  }

}
