package dataStructure;

public class A {

	
	public void add()
	{
		System.out.println(10+20);
	}
	public void login()
	{
		System.out.println("Login Checking");
	}
	public void verifyLoginButton()
	{
		System.out.println("Verfying Login Button");
	}
	public static void superSet() {
		System.out.println("Superset");
	}
	
	public static void main(String[] args) {
		
		A obj=new A(); //Object Creation
		obj.add(); //Calling Method By Object Reference;
		obj.login();
		obj.verifyLoginButton();
		superSet();
	}
}
