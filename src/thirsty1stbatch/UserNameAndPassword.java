package thirsty1stbatch;

import java.util.Scanner;

public class UserNameAndPassword {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String user,pass;
		
		System.out.print("Enter Your UserName: ");
		user=input.nextLine();
		
		System.out.print("Enter Your Password: ");
		pass=input.nextLine();
		
	
		if(user.equals("Antik") && (pass.equals("Sarkar123") ))
		{
			System.out.println("Welcome To The System");
			
		}
		else {
			System.out.println("Wrong Entry");
		
		}
		
		
		
		input.close();
	}

}
