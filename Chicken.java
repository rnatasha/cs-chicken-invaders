public class Chicken extends Enemy
{
  private int myLives, mySize;
  private double myX, myY;
  
  public Chicken(int n, double x, double y)
  {
    myLives=n/5 +1;
    mySize=20; //SOME DEFAULT SIZE FOR ALL THE SMALL CHICKENS?
    myX=x;
    myY=y;
  }
  public int getLives(){
    return myLives;
  }
  public int getSize(){ //not sure if we'll be needing this
    return mySize;
  }
  public double getX(){
    return myX;
  }
  public double getY(){
    return myY;
  }
  public void setLives(int x){ //not sure if this is necessary either, or if attack method will do
    myLives=x;
  }
  public void setX(double x){
    myX=x;
  }
  public void setY(double y){
    myY=y;
  }
  public void attack(User u){
    u.setLives(u.getLives()-1);
  }

}
