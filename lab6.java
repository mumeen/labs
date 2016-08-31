import java.util.Scanner;

public class lab6 {



	private static int flag  = 0;


	public static void main(String[] args) {
		// TODO Write this code. You will have a loop and call translateWord from here.
		Scanner scanner = new Scanner(System.in);
	
		String latinWord1;
		String yesorno ="y";
		do {
			System.out.println("Welcome to the Pig Latin Translator");
			System.out.println("Enter a line to be translated");
			String englishWord = scanner.nextLine();
			String pigLatinWord = translateWord1(englishWord);
			System.out.println(pigLatinWord);
			System.out.println("Do you want to continue (y/n)");
			 yesorno = scanner.nextLine();
		} while(yesorno.equalsIgnoreCase("y"));
		
		
	 

        String findFirstVowel = scanner.nextLine();
        char vowel = Character.toLowerCase(findFirstVowel.charAt(0));

        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
        {
            String convertToPigLatin = findFirstVowel + "ay";
            System.out.println(convertToPigLatin);
        }
        else
        {
            String first = findFirstVowel.substring(0,1);
            String slice = findFirstVowel.substring(1,findFirstVowel.length());
            System.out.println(slice + first + "ay");}

	}         
	         
	


	// This method takes any single English word and translates it to a Pig Latin word.

public static String translateWord1(String englishWord) {
		String latinWord = "";

		latinWord = englishWord.toLowerCase();
		char Vowel = latinWord.charAt(0);

		if (Vowel == 'a' || Vowel == 'e' || Vowel == 'i' || Vowel == 'o' || Vowel == 'u') {
			latinWord = latinWord.concat("way");

		} else {

			//start at 0 and end at the length of the word
			for (int i = 0; i < latinWord.length(); i++) {
				char x = latinWord.charAt(i);
				if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
					latinWord = latinWord.substring(i) + latinWord.substring(0, i) + "ay";
					flag = 1;
					break;
				}
			}
			
		}
		return latinWord;
				
				
				
		
		}
		
			
	public static String translateWord(String englishWord) {
		String latinWord = englishWord.toLowerCase();
		// TODO Write this code
		return latinWord;
	}

			}
