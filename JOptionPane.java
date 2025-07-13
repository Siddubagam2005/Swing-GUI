import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		//with integer data 
		int age=Integer.parseInt(JOptionPane.showInputDialog("Enter the age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" Years old");
		
		//Double Double.parseDouble();

	}

}
