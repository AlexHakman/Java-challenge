package oefeningen.thuis;

public class Kaprekar {

	public static void main(String[] args) {

		int startNR = 1;
		int maxNR = 9000;
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
			
				if (startNR == firsthalfint + secondhalfint) {
					System.out.println("Kaprekar nr's: " + startNR);
				
				}
			
		}
	}
}

