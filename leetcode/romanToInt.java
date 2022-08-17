public class Task {
	public static void main(String[] args) {
		
		String s = "MCMXCIV";
		
		System.out.println(romanToInt(s));
	}
	
	public static int romanToInt(String s) {
		int numInt = 0;
		for (int i = 0; i < s.length(); i++) {

			switch(s.charAt(i)) {
				case 'M':
					numInt += 1000;
					break;
				case 'D':
					numInt += 500;
					break;
				case 'C':
					if (i + 1 != s.length()) {
						if (s.charAt(i + 1) == 'M') {
							numInt += 900;
							i++;
							break;
						}
						else if (s.charAt(i + 1) == 'D') {
							numInt += 400;
							i++;
							break;
						}
					}
					numInt += 100;
					break;
				case 'L':
					numInt += 50;
					break;
				case 'X':
					if (i + 1 != s.length()) {
						if (s.charAt(i + 1) == 'C') {
							numInt += 90;
							i++;
							break;
						}
						else if (s.charAt(i + 1) == 'L') {
							numInt += 40;
							i++;
							break;
						}
					}
					numInt += 10;
					break;
				case 'V':
					numInt += 5;
					break;
				case 'I':
					if (i + 1 != s.length()) {
						if (s.charAt(i + 1) == 'X') {
							numInt += 9;
							i++;
							break;
						}
						else if (s.charAt(i + 1) == 'V') {
							numInt += 4;
							i++;
							break;
						}
					}
					numInt += 1;
					break;
			}
		}
		
		return numInt;
	}
}
