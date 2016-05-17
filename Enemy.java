import javax.swing.ImageIcon;
public abstract class Enemy
{
  public abstract void attack(User u);
  public abstract void setLives(int n);
  public abstract int getLives();
}
