import java.util.*;

class Assignment4A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seed 1: ");
		int seed_1 = scan.nextInt();
		System.out.println("Enter seed 2:");
		int seed_2 = scan.nextInt();
		System.out.println("Number of iterations: ");
		int iterations = scan.nextInt();
		int[] list_of_seed = new int[iterations + 2];
		list_of_seed[0] = seed_1;
		list_of_seed[1] = seed_2;
		int seed_3 = list_of_seed[0] + list_of_seed[1];
		list_of_seed[2] = seed_3;
		for (int i = 3; i < iterations + 2; i++) {
			int seed = list_of_seed[i-1] + list_of_seed[i-2];
			list_of_seed[i] = seed;
		}
		String string_of_seed = Arrays.toString(list_of_seed)
			.replace(" ", "")
			.replace("[", "")
			.replace("]", "");
		System.out.println(string_of_seed);
	}
}
