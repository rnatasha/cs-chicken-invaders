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
  public void draw(Graphics myBuffer){
    //not finished
  }
  public boolean isTouching(Enemy e){
    //not finished
  }
  public void move(int x){//when used x= 1 or -1, for left or right movement along bottom of screen
    myX+=x;
  }
}
