import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
import java.util.Comparator;
public class ScorePanel
{
  public static void main(String[] args) throws Exception
  {
    Scanner infile = new Scanner(new File("data.txt"));
    int numitems = infile.nextInt();
    String[] array = new String[numitems];
    for(int k = 0; k < numitems; k++)
    {
      
