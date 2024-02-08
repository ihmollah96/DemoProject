package dataStructure;

public class ParaM {
	
	public void add(int x,int y)
	{
		System.out.println("Sum: "+(x+y));
	}
	public static void multi(int x,double y)
	{
		System.out.println("Multi: "+(x*y));
	}
	
	public static void main(String[] args) {
		
		ParaM obj=new ParaM();
		obj.add(5,20);
		multi(10,20);
		
		
	}
}
