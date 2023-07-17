package javaPractiseCodes;

public class stringCodesPrac {

	public static void main(String[] args) {					 /* ....TESTING.... */
		// TODO Auto-generated method stub				
		
		stringprint("UsmAn012");
		uppercase("USmaN shahZAd"); 
		
		System.out.print(removeDuplicate("uusmmmann")+"\n");
		
		System.out.print(digitsFirst("usm7a86n"));
		
		System.out.print(reverseCase("USman26# SHahzad")+"\n");
		
		System.out.print(Reverse("usman")+"\n");
		
		firstChar("Usman Shahzad Ahmed");
		
		System.out.print("\n");
		
		specialWords("Mom or Dad");
		
		System.out.print(longestWord("A Red Seed")+"\n");
		
		System.out.print(deleteWord("A Red Seed.","Red"));
		
		System.out.print(YfromX("uusssmmannii","usman"));
		
	}
	
	
	
	// a string program to print the string itself and ASCII code as well...
	
	static String stringprint(String s) {
			
		for (int i=0; i<s.length();i++) {
			
			char c = s.charAt(i);
			System.out.println(c + " --> ASCII code is " + (int)c);		// print each char in new line...
																		// (int)c prints ASCII code...
		}
		
		return "";
	}
	
	
	// a string program to print only *UPPERcase* characters...
	
	static String uppercase(String s) {
		
		for (int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			
			if (Character.isUpperCase(c)) {		//checks if char is UPPERCASE...
				System.out.print(c);
			}
				
			
		}
		System.out.print("\n");
	
		return "";
	}
	
	// a program to remove DUPLICACY from a String...			// ***DUPLICACY REMOVAL***
	
	static String removeDuplicate(String s) {
		// ezzzaan
		
		String sn = "";
		int count = 1;
		for (int i=0; i< s.length();i++) {
			char c = s.charAt(i);
			for (int j = i+1; j<s.length();j++) {
				if (c == s.charAt(j)) {
					count++;
				}
				
			}
			if( count<2) {
				sn = sn + c;
			}
			count = 1;
			
		}
		
		return sn;
	}
	
	
	//a program to create a new string with **digits** first and then characters...
	
	static String digitsFirst(String s) {
    //for example; usm7a86n ---> 786usman
		
		String digits = "";
		String chr = "";
		for (int i =0; i<s.length();i++) {
			
			char c = s.charAt(i);
			if (Character.isDigit(c)) {			// checks for digit...
				digits = digits + c;
			}
			else {
				chr = chr + c;
			}
		}
		String answer = digits + chr + "\n";
		
		
		return answer;
	}
	
	
	// a program to reverse the case of a String...
	
	static String reverseCase(String s) {
		
		// for example; USman SHahzad --> usMAN shAHZAD
		
		String revCase = "";
		for (int i =0; i<s.length();i++) {
			
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				revCase = revCase + Character.toLowerCase(c);
			}
			else {
				revCase = revCase + Character.toUpperCase(c);
			}
		}
		
		
		return revCase;
	}
	
	//a program to find the reverse of the String...				//***REVERSE***
	
	static String Reverse(String s) {
		
		// for example; "usman" --> "namsu"
		
		String reverse = "";
		
		for (int i= s.length()-1; i>=0; i--) {		//decrement***
			
			char c = s.charAt(i);	//last char***
			reverse = reverse + c;
		}
		
		
		return reverse;
	}
	
	
	//a program to Print the **first character** of **each word** in a sentence...
	
	static String firstChar(String s) {
		
		// for example; "Usman Shahzad Ahmed " --> "USA"
		
		String firstchar = "";
		s = s + " ";  	//added space to allow last word to be complete!
		
		for (int i =0; i<s.length();i++) {
			
			char c = s.charAt(i);
			if (c != ' ') {				//checks if there is no space!
				firstchar = firstchar + c;
			}
			else {				//space is there so one word is complete!
				System.out.print(firstchar.charAt(0)+" ");
			//System.out.print(firstchar.substring(0,2));		//using "SUBSTRING" to print first 2 char
																//of each word!
				firstchar = "";
			}
		}
		
		return "";
	}
	
	
	
	//a program to Print all Special words in a String. e.g. Anna, bob...
	
	static String specialWords(String s) {
		//for example; "Mom or dad" --> "Mom Dad" 
		
		s = s + " ";  	//added space to allow last word to be complete!
		String w = "";
		
		for (int i=0; i<s.length();i++) {
			
			char c = s.charAt(i);
			if( c != ' ') {
				w = w + c;
			}
			else {			//space is there so one word is complete! Word processing is required now!
				char a = w.charAt(0);
				char b = w.charAt(w.length()-1);
				if (Character.toUpperCase(a) == Character.toUpperCase(b)) {
					System.out.print(w+" ");
				}
				w = "";
			}
		}
		return "";
	}
	
	
	
	//a program to Find the longest word in a Sentence...
	
	static String longestWord(String s) {
		
		// for example; "A Red Seed" --> "Seed"
		
		s = s + " ";		//added space to allow last word to be complete!
		String w = "";
		String longestw = "";		//let longest word be longestw...
		
		for(int i=0; i<s.length();i++) {
			
			char c = s.charAt(i);
			if ( c != ' ') {
				w = w + c;
			}
			else {			//space is there so one word is complete! Word processing is required now!
				if ( w.length() > longestw.length()) {
					longestw = w;
				}
				w = "";
			}
		}
		
		String answer = "\n" + "Longest word is --> "+ longestw;
		
		return answer;
	}
	
	
	//a program Delete a word in a sentence and print it...				  /*  "DELETION!" */
	
	static String deleteWord(String s, String delete) {
		
		s = s + " ";		//added space to allow last word to be complete!
		String w = "";
		String nw = "";
		
		for (int i =0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			if ( c != ' ') {
				w = w + c;
			}
			else {			//space is there so one word is complete! Word processing is required now!
				if (!w.equals(delete)) {
					nw = nw + w + " ";		//"deleted word" would not be in the nw sentence!
				}
				w = "";
			}
		}
		
		
		String answer = "The word, '" + delete + "' has been 'deleted' --> " + nw + "\n";
		
		
		return answer;
	}
	
	
	
	// a method should determine if, after multiple character deletions in x, the String y can be obtained...
	
	static boolean YfromX(String x, String y) {
		
		// for example--> x= "heaalllooo", y= "hello"  --> TRUE 'y' can be obtained from 'x'!
		
		if (y.length()>x.length()) {	//returns false if y is bigger than x...
			return false;				// y from x not possible!
		}
		
		int i = 0;
		int j = 0;
		
		while ( i< x.length() && j< y.length()) {
			if (x.charAt(i) == y.charAt(j)) {	//char is same in both x & y!
				i++;
				j++;
			}
			else {
				i++;	//char isn't same, increment 'x only'!
			}
		}
		
		return j == y.length(); //return TRUE if j == y.length()!
	}
	
	
	
	
	
	
	
	
	
	
	
}










