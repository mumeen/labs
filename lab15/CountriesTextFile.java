package lab15;
import java.io.IOException;
import java.nio.*;
import java.nio.file.*;
import java.nio.file.Paths;
import java.util.AbstractList;
import java.util.ArrayList;
import java.awt.List;
import java.io.*;
public class CountriesTextFile {
	ArrayList<String> countryList = new ArrayList<String>();
	public ArrayList<String> WriteCountryFile() throws IOException{

for(String countries:countryList){
	
}
	countryList.addAll(countryList);{
	}
	return countryList;
		
}private static Path filePath = Paths.get("C:/Users/Administrator/workspace/Lab2/src/lab15/countries.txt");{
		{
		}
		}
		public static void checkForFile() {
			if (Files.exists(filePath)) {
				return;
			}
			File file = new File("C:/Users/Administrator/workspace/Lab2/src/lab15/countries.txt");
			try {
				file.createNewFile();
				System.out.println("File didn't exist and was created.");

			} catch (IOException ex) {
				throw new RuntimeException("");
			}

	}
	public ArrayList<String>ReadCountryFile(){
		return null;
	}public static List getCountry(){
	
	List countries = null;
	try {
		File file = filePath.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String line = reader.readLine();
		while (line != null) {
			countries.add(line);
			line = reader.readLine();
		}
		reader.close();
		fileReader.close();
	} catch (IOException ex) {
		throw new RuntimeException("");
	}
	
	
	return countries;

}
	public static void setCountry(String nextLine) {
		// TODO Auto-generated method stub
		
	}
	{
	}
	}
