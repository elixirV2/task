public class Task {

	public static void main(String[] args) {
		
		final int count = 100;
		
		int n[] = new int[count - 2];
		
		for (int i = 2; i < count - 2; i ++) {
			if((i & 1) == 0) {
				n[i - 2] = 0;
			}
			else {
				n[i - 2] = i;
			}
		}
		
		n[0] = 2;
		
		int prime = 3;
		
		while (prime * prime < count) {
			for (int i = prime * prime; i < count; i += (prime << 1)) {
				n[i - 2] = 0;
			}
			while(n[(prime += 2) - 2] == 0);
		}
		
		for (int i = 0; i < count - 2; i++) {
			if (n[i] != 0)
				System.out.println(n[i]);
		}
	}	
}
