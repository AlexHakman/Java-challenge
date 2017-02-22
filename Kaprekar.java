package oefeningen.thuis;

public class Kaprekar {

	public static void main(String[] args) {
		
		//In mathematics, a Kaprekar number for a given base is a non-negative integer,
		//the representation of whose square in that base can be split into two parts 
		//that add up to the original number again. For instance, 45 is a Kaprekar number, 
		//because 45*45 = 2025 and 20 + 25 = 45.
		//The Kaprekar numbers are named after D. R. Kaprekar.

		int startNR = 1; //Start searching for kaprekar numbers from number 1.
		int maxNR = 9000; // Stop searching for kaprekar numbers till 9000
		String firsthalf;
		String secondhalf;
		int firsthalfint;
		int secondhalfint; 
		
		for(;startNR<=maxNR; startNR++) {
			
			if(startNR<10) {
				startNR = 10;  
			}

			
			int i = startNR * startNR; 
			
			String s = new String();
			s = String.valueOf(i);

			
			firsthalf = s.substring(0, s.length()/2);
			secondhalf = s.substring(s.length()/2, s.length());
			
			
				if(firsthalf.endsWith("0") && (firsthalf.length() > 2)) {
					firsthalf = firsthalf.substring(0, (firsthalf.length()-1));
				}
			
			firsthalfint = Integer.parseInt(firsthalf);
			secondhalfint = Integer.parseInt(secondhalf);
			
				
				if(secondhalfint % 100 == 0) {
					secondhalfint++;
				}
				//check for kaprekar numbers. if start number is the same as the 
				//multiplied first half + second half then it's a kaprekar number.
				
				if (startNR == firsthalfint + secondhalfint) {
					System.out.println("Kaprekar nr's: " + startNR);
				
				}
			
		}
	}
}

