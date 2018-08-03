import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("¸î´Ü? ");
		int value = scanner.nextInt();

		for (int i = 2; i <= value; i++) {
			int[] result = Gugudan.caculate(i);
			Gugudan.print(result);
		}
	}
}
