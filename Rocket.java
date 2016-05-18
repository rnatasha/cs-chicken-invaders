public class Rocket
{
  private double myX, myY;
  
  public Rocket(double x, double y){
    myX=x;
    myY=y;
    
  }
   
  public double getX(){
    return myX;
  }
  public double getY(){
    return myY;
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
}
