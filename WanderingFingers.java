package oefeningen.thuis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WanderingFingers {

	public static void main(String[] args) throws FileNotFoundException {
		
		File nFile = new File("words.txt");
		Scanner scanner = new Scanner(nFile);
		
		String currentword;
		String word = "qwertyuytresdftyuioknn";
//		String word = "gijakjthoijerjidsdfnokg";
	    String output = "/----Output----\\ \n";
		
		while(scanner.hasNextLine()) {
			currentword = scanner.nextLine();
			
			// starts checking if the first letter of the dictionary word matches first letter of given word.
			// if first letter matches, check last letter to match.
				if((currentword.charAt(0) != word.charAt(0)) 
						|| (currentword.charAt(currentword.length()-1) != word.charAt(word.length()-1))) {
					//next! No match!
				} else {
	                int c = 0;
	                for(int i = 0; ((i < (word.length())) && (c < currentword.length())) ; i++){
	                    if(word.charAt(i) == currentword.charAt(c)){
	                        c++;

	                    }
	                } // should be called if the number of matching letters was the same as the length of the word itself
	                
	                if(c == currentword.length()){
	                    output += currentword + "\n";
	                }
				}
					
		}
		System.out.println(output);
		System.out.println("\\--------------/");
	}

}
