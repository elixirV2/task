import java.util.ArrayList;

public class Task {
	public static void main(String[] args) {
		
		ArrayList<Integer> missNum = new ArrayList<>();
		
		int nums[] = {1,2,4,6,7,9};
		int j = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (j == nums[i]) {
				j++;
				continue;
			}
			else {
				missNum.add(j);
				i--;
			}
			j++;
		}
		System.out.println("miss num");
		for (int i : missNum) {
			System.out.println(i);
		}
		
	}
}
