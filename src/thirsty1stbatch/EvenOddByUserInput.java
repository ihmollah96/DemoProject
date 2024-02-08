package thirsty1stbatch;

import java.util.Scanner;

public class EvenOddByUserInput {
	public static void main(String[] args) {

		Scanner input=new Scanner (System.in);

		System.out.print("Enter A Value: ");
		int num=input.nextInt();


		if (num%2==0) {
			System.out.println("Number Is Even");
		}else {
			System.out.println("Number Is Odd");
		}

		input.close();                           // Resource Leak:'input' is never closed (That's why we use .close() method;)
	}

}
