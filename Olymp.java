import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Task {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		int N = in.nextInt();
		ArrayList<Integer> time = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			time.add(in.nextInt());
		}
		
		// ПОРЯДОК ВЫЗОВА ВАЖЕН!!!
		// ORDER OF CALLS IS IMPORTANT!!!
		HashMap<String, Integer> res = new HashMap<>();
		
		res.put("5", getScoreCourse3or5(time, 5));
		res.put("3", getScoreCourse3or5(time, 3));
		res.put("1", getScoreCourse1(time));
		
		int min = Integer.MAX_VALUE;
		for (Entry<String, Integer> e : res.entrySet()) {
			min = Math.min(min, e.getValue());
		}
		System.out.println(res.entrySet().stream().min(Map.Entry.<String, Integer>comparingByValue()).get().getKey());		
		
	}
	
	public static int getSum (ArrayList<Integer> time, int index) {
		int sum = 0;
		for(int i = 0; i < index; i++) {
			sum += time.get(i);
		}
		return sum;
	}
	
	public static int getScoreCourse1 (ArrayList<Integer> time) {
		Collections.sort(time);
		int i = 0;
		int sum = 0;
		while(i++ != time.size()) {
			sum += getSum(time, i);
		}		
		return sum;
	}
	
	public static int getScoreCourse3or5 (ArrayList<Integer> time, int course) {
		if (course == 3) 
			Collections.reverse(time);
		int i = 0;
		int sum = 0;
		while(i++ != time.size()) {
			sum += getSum(time, i);
		}		
		return sum;
	}	
}
