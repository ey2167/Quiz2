import javax.swing.JOptionPane;

public class authentification{
	public static void main(String[] args) {
		login.username = JOptionPane.showInputDialog("what is your username?");
		login.password = JOptionPane.showInputDialog("What is your Password?");
		/*username and password are being called on from class login through JOptionPane
		 * the method authentification will be put to the test to identify username and password
		 */
login.authentification();		
        if (login.status == true)
        	/*
        	 * status from method authentification comes into play here
        	 */
        {
        	JOptionPane.showMessageDialog(null, "Welcome " + login.username);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Wrong Username or Password");	
        }
	}
}
