import javax.swing.JFrame;
public class Frames {

	public static void main(String[] args) {
		JFrame frame =new JFrame();//creates a frame
		frame.setTitle("JFrame title goes here");//sets title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(420,420);//sets the x-dimentions, and y-dimentions of frame
		frame.setVisible(true);//make frame visible
		

	}

}
