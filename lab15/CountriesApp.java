package lab15;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Countries Maintenance Application!");
		System.out.println("Enter a country");
		String country = sc.nextLine();
		System.out.println(country);
	
		// TODO Auto-generated method stub
		String fileString = "country.txt";
		Path filePath = Paths.get(fileString);
		if(Files.notExists(filePath)){
			Files.createFile(filePath);
			
		

			{
					
			}
			try {
				System.out.println("\n1-See the list of countries");
				System.out.println("2-Add a country");
				System.out.println("3-Exit");
				try{
				choice = sc.nextInt();
				}catch(InputMismatchException ex){
					System.out.println("You must choose a number from 1-3.");
					sc.nextLine();
					continue;
				}
				switch (choice) {
				case 1:
					for (String s : countries) {
						System.out.println(s);
					}
					break;
				case 2:
					System.out.println("Enter country:");
					sc.nextLine();
					CountriesTextFile.setCountry(sc.nextLine());
					break;
				case 3:
					System.out.println("Happy trails");
					keepGoing = "n";
					break;
				default:
					System.out.println("That is not a valid menu option.");
					continue;
				}
			} catch (RuntimeException ex) {
				System.out.println(ex.getMessage());
				continue;
			}

		}
		sc.close();
	}


		}
	}
}	

		
		


