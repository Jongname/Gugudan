//import java.util.Scanner;

public class Gugudan {
	public static int[] caculate(int times) {
		int[] result = new int[times];
		for (int i = 0; i < times; i++) {
			result[i] = times * (i + 1);

		}
		return result;
	}

	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");

		}
		System.out.println();
	}
}

	
		
		
//		System.out.println("���?");
//		int number = scanner.nextInt();
//		
//		int i=1;
//		while(i<10) {
//			
//			System.out.println(number * i);
//			i++;
//		}
//
//		if (number < 2) {
//			System.out.println("�߸��Է�");
//		} else if (number > 9) {
//			System.out.println("�߸��Է�");
//		} else {
//			for (int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//			}
//		}
//		2��
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
//		
//		System.out.println("���?");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);

//	}
//
//}
