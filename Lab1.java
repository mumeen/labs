

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Welcome to Grand Circus' Room Detail Generator!\n");
		
		System.out.println("Enter Length:");
		
		int length = scanner.nextInt();
		
		System.out.println("Enter width:");
		
		int width = scanner.nextInt();	
		
		System.out.println("Enter height:"); 
		
		int height = scanner.nextInt();
		
		int perimeter = (2*length) + (2*width);
		
		int area = width * length;
		
		int volume = width * length * height;
	

		
		System.out.println("Area: " + area); 
		
		//System.out.println();
		
		//System.out.println(area);
		
		System.out.println("perimeter: " + perimeter);
		
		System.out.println("volume: " + volume);
		
		
		
		
		
		
		
		
		
		
		
	}

}
