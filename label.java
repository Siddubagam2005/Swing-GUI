
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Lablels {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        //Jlabel is a GUI display area for a String of text,an image,or both
        label.setText("Hello , How Are You??");

        ImageIcon image = new ImageIcon("8760.jpg");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//left,right , center
        label.setVerticalTextPosition(JLabel.TOP);




        JFrame frame =new JFrame();//creates a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);//sets the x-dimentions, and y-dimentions of frame
        frame.add(label);
		frame.setVisible(true);

    }
}
