package oefeningen.thuis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
 * Challenge from url:
 * https://www.reddit.com/r/dailyprogrammer/comments/5bn0b7/20161107_challenge_291_easy_goldilocks_bear/
 *
 *  The task falls to you: given descriptions of Goldilocks' needs and of the available
 *  porridge/chairs at the dinner table, tell Goldilocks which chair to sit in so the chair
 *  does not break, and the porridge is at an edible temperature.
 *  
 *  The input begins with a line specifying Goldilocks' weight 
 *  (as an integer in arbitrary weight-units) and the maximum temperature of porridge
 *  she will tolerate (again as an arbitrary-unit integer). This line is then followed
 *  by some number of lines, specifying a chair's weight capacity, and the temperature
 *  of the porridge in front of it.
 *  
 *  
 * All inputs are in input.txt;
 * these are the inputs from the challenge:
 * 100 120
 * 297 90
 * 66 110
 * 257 113
 * 276 191
 * 280 129
 * 219 163
 * 254 193
 * 86 153
 * 206 147
 * 71 137
 * 104 40
 * 238 127
 * 52 146
 * 129 197
 * 144 59
 * 157 124
 * 210 59
 * 11 54
 * 268 119
 * 261 121
 * 12 189
 * 186 108
 * 174 21
 * 77 18
 * 54 90
 * 174 52
 * 16 129
 * 59 181
 * 290 123
 * 248 132
 * 
 * 
 * Author: Alex Hakman
 * 
 */

public class Goldilocks {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String s;
		String[] stringarray;

		//Read, split and examine the current line.
		try {
            String line;
            while ((line = br.readLine()) != null) {
              s = line;
              stringarray = s.split(" ");
              int a = Integer.parseInt(stringarray[0]);
              int b = Integer.parseInt(stringarray[1]);
              	
              	if(isSafe(a,b) == true) {
              		System.out.println(a + " " + b);  
              	}
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
	}


	//If it's safe for Goldilocks to sit on a chair, and the food is at an edible temperature
	public static boolean isSafe(int a, int b){
		if(a > 100 && b <= 80){ 
			return true;
		} else {
			return false;
		}
	}
	

}
