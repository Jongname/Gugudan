
public class GugudanSelf {

	public static int[] calcu(int time) {
		int[] result = new int[9]; // ����
		for (int i = 0; i < result.length; i++) { // �Ĺ�

			result[i] = time * (i + 1);
		}
		return result;
	}

	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) { // �Ĺ�

			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<10;i++) {
			int[] result = calcu(i);
			print(result);
		}
	}

}
