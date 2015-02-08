/*Elohe Yonas
 * 2/7/2015
 * CSC201 Saturday 9:00 - 12:40
 * 
 * 
 */



import java.util.Scanner;
public class login {
	static boolean status;
	static Scanner keyboard = new Scanner(System.in);
	static String inputusername = "Red";
	static String inputpassword = "Blue";
	static String username;
	static String password;

	public static void main(String[] args) 
	{
		System.out.println("hi,what's your username and password?");
		username = keyboard.next();
		password = keyboard.next();
		authentification();
		/*
		once the username and password have been prompted,
		the method authentification will be invoked
		*/
		
	}
	
	public static boolean authentification(){
		/*
		 * status will be used as checks for other classes
		 */
		if (username.equalsIgnoreCase(inputusername)) {

			status = true;
			System.out.println("right username");
			
		} 
		else
		{
			status = false;
			System.out.println("Wrong username");
			System.out.close();
			return status;
		}
		
		if (password.equalsIgnoreCase(inputpassword)) 
		{
			System.out.println("Welcome " + username);
			status = true;
            return status;
		} 
		else
		{
			status = false;
			System.out.println("wrong Password");
			System.out.close();
			return status;
		}
			
		
		
	}
}
