import javax.swing.*;
import java.awt.event.*;
public class AnimationPanel extends JPanel{
	ImageIcon[] arrayOfFrames;
	JLabel imageLabel;
	int currIndex;
	Timer t;
	public AnimationPanel(){
		currIndex = 0;
		imageLabel = new JLabel();
		add(imageLabel);
		arrayOfFrames = new ImageIcon[4];
		for(int i=0; i<arrayOfFrames.length; i++){
			arrayOfFrames[i]= new ImageIcon("animation_"+i+".jpg");
		}
		int delay = (int) (1000* Double.parseDouble(JOptionPane.showInputDialog("Delay:")));
		t= new Timer(delay, new AnimationStepper());
		t.start();
	}
	private class AnimationStepper implements ActionListener {
		public void actionPerformed(ActionEvent e){
			imageLabel.setIcon(arrayOfFrames[currIndex]);
			currIndex++;
			currIndex%= arrayOfFrames.length;
		}
	}
}
