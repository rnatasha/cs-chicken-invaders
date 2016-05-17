	/*****************************************************************
	* A Circle is an Ememy that maintains information about its lives. A Circle
	* knows how to return its lives, set its lives, use the attack method, 
	* and drop an egg based on its coordinates.
	 
	* @author 
	* @version 
	****************************************************************/
public class Chicken extends Enemy
{
  private int myLives, mySize;
  private double myX, myY;
  private Egg myEgg;
   /************************************************************* 
   * Constructs a Chicken with initial coordinates specified by x and y,
   * the number of lives specified by (n-1)/5 + 1, and the size 
   * specified by 20.
   **************************************************************/
  public Chicken(int n, double x, double y)
  {
    myLives=(n-1)/5 +1;
    mySize=20; //SOME DEFAULT SIZE FOR ALL THE SMALL CHICKENS?
    myX=x;
    myY=y;
    myEgg = new Egg(myX, myY);
  }
   /************************************************************* 
   * Constructs a "Big Boss" Chicken with initial coordinates specified by x and y,
   * the number of lives specified by (n/5)*50, and the size 
   * specified by s.
   **************************************************************/
  public Chicken(int n, int s, double x, double y){
    myLives=(n/5)*50;
    mySize=s;
    myX=x;
    myY=y;
    myEgg=new Egg(my)
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
  public double getX(){
    return myX;
  }
   /*************************************************************** 
   * Returns the Chicken's y coordinate
   * @return	 Y
   **************************************************************/
  public double getY(){
    return myY;
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
  public void setX(double x){
    myX=x;
  }
   /***************************************************************
   * Sets the y coordinate
   * @param y	 assigns y to myY or the Chicken's y coordinate
   **************************************************************/
  public void setY(double y){
    myY=y;
  }
   /***************************************************************
   * Sets the User and its lives
   * @param y	 assigns u to the User and assigns its lives
   **************************************************************/
  public void attack(User u){
    u.setLives(u.getLives()-1);
  }
   /***************************************************************
   * Sets dropEgg's location
   * @param y	 assigns myEgg to be released in the bottomEdge
   **************************************************************/
  public void dropEgg(double bottomEdge){
    myEgg.release(bottomEdge);
    //repaint egg
  }

}
