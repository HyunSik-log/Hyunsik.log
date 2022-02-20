import java.util.Scanner;

public class Exam2 {
	static Scanner scan = new Scanner(System.in);

	// [���� 2��]�� �Է¹޾� [���� ����� ���]!
	public static void example1() {
		int number1;
		int number2;

		// �ʱ�ȭ1)���Կ����� �̿��� �ʱ�ȭ
		number1 = 10;

		// �ʱ�ȭ2)����� �Է� �ʱ�ȭ
		System.out.print("���� �Է� : ");
		number2 = Integer.parseInt(scan.nextLine());

		// ����(������ ��...)
		int result = number1 + number2;

		System.out.printf("%d + %d = %d\n", number1, number2, result);
	}

	// �迭 : ����Ÿ��
	public static void PrintArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}

	// 1) 1���� �迭
	public static void example2() {
		// �迭 ����(�ּ� ���� ���� ����)
		int[] arr1 = new int[3]; // ��������� heap�޸𸮿� ������� ����
		int[] arr2 = { 1, 2, 3 }; // �Ͻ������� heap�޸𸮿� ������� ����

		PrintArr(arr1);
		PrintArr(arr2);
	}

	public static void PrintArr1(int[][] arr) {
		for (int i = 0; i < arr.length; i++) // ���� ����2
		{
			for (int j = 0; j < arr[i].length; j++) // Ư�� ���� ���� ����3,3
			{
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}
		}
	}

	// 2) 2���� �迭
	public static void example3() {
		int[][] arr1 = new int[2][3];
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };

		PrintArr1(arr1);
		PrintArr1(arr2);
	}

	// 2) 2���� ���� �迭(�ึ�� ���� ũ�Ⱑ �ٸ� �迭)
	public static void example4() {
		int[][] arr1 = new int[2][]; // �ุ ����!
		arr1[0] = new int[4]; // 0��° ���� ���� ũ�� 4
		arr1[1] = new int[2]; // 1��° ���� ���� ũ�� 2

		int[][] arr2 = { { 1, 2, 3, 4 }, { 5, 6 } };

		PrintArr1(arr1);
		PrintArr1(arr2);
	}

	// [���� 2��]�� �Է¹޾� [���� ����� ���]!
	public static void example5() {
		int[] arr = new int[3];

		// �ʱ�ȭ1)���Կ����� �̿��� �ʱ�ȭ
		arr[0] = 10;

		// �ʱ�ȭ2)����� �Է� �ʱ�ȭ
		System.out.print("���� �Է� : ");
		arr[1] = Integer.parseInt(scan.nextLine());

		// ����(������ ��...)
		arr[2] = arr[0] + arr[1];

		System.out.printf("%d + %d = %d\n", arr[0], arr[1], arr[2]);
	}

	public static void main(String[] args) {
		example5();
	}
}
