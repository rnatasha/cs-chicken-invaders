   /*****************************************************************
	* An Egg is an Ememy that maintains information about its lives and
   * its location. An Egg knows how to return its lives, set its lives, 
   * attack a User, and use its method release.
	 
	* @author 
	* @version 
	****************************************************************/
public class Egg extends Enemy
{
  private int myLives, mySize;
  private int myX, myY;
  /************************************************************* 
   * Constructs an Egg with initial coordinates specified by x and y,
   * lives set to 1, and size set to 20.
   **************************************************************/
  public Egg(int x, int y){
    myX = x;
    myY = y;
    myLives=1;
    mySize=20;
  }
   /*************************************************************** 
   * Returns the Egg's x-coordinate
   * @return	 X
   **************************************************************/
  public int getX(){
    return myX;
  }
   /*************************************************************** 
   * Returns the Egg's y-coordinate
   * @return	 Y
   **************************************************************/
  public int getY(){
    return myY;
  }
   /*************************************************************** 
   * Returns the Egg's lives
   * @return	 lives
   **************************************************************/
  public int getLives(){
      return myLives;
  }
   /*************************************************************** 
   * Returns the Egg's size
   * @return	 size
   **************************************************************/
  public int getSize(){
    return mySize;
  }
   /***************************************************************
   * Sets the x coordinate
   * @param x	 assigns x to myX or the Egg's x-coordinate
   **************************************************************/
  public void setX(int x){
    myX=x;
  }
   /***************************************************************
   * Sets the y coordinate
   * @param y	 assigns y to myY or the Egg's y-coordinate
   **************************************************************/
  public void setY(int y){
    myY=y;
  }
   /***************************************************************
   * Sets the number of lives
   * @param n	 assigns n to myLives
   **************************************************************/
  public void setLives(int n){
    myLives=n;
  }
   /***************************************************************
   * Attacks the User passed by subtracting 1 life
   * @param u	sets User's lives to current lives minus 1. 
   **************************************************************/
  public void attack(User u){
    u.setLives(u.getLives()-1);
  }
   /***************************************************************
   * Increases the y coordiante of Egg object until it reaches the bottomEdge of the screen.
   * @param bottomEdge	increases Egg's y-coordinate until equal to bottomEdge
   **************************************************************/
  public void release(double bottomEdge){
    while(myY!=bottomEdge){
      myY++;
    }
  }
}
