package assignment3rd;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers:");
		int a= sc.nextInt();
		int b= sc.nextInt();
		if(a>b)
		
			System.out.println("largest number:"+a);
		else
			System.out.println("largest number:"+b);

	}

}
