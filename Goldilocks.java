package oefeningen.thuis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
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
 * Challenge from url:
 * https://www.reddit.com/r/dailyprogrammer/comments/5bn0b7/20161107_challenge_291_easy_goldilocks_bear/
 * 
 * Author: Alex Hakman
 * 
 */

public class Goldilocks {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String s;
		String[] stringarray;

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


	
	public static boolean isSafe(int a, int b){
		if(a > 100 && b <= 80){ 
			return true;
		} else {
			return false;
		}
	}
	

}
