import java.util.Scanner;

public class Exam2 {
	static Scanner scan = new Scanner(System.in);

	// [정수 2개]를 입력받아 [합의 결과를 출력]!
	public static void example1() {
		int number1;
		int number2;

		// 초기화1)대입연산을 이용한 초기화
		number1 = 10;

		// 초기화2)사용자 입력 초기화
		System.out.print("정수 입력 : ");
		number2 = Integer.parseInt(scan.nextLine());

		// 연산(연산자 들...)
		int result = number1 + number2;

		System.out.printf("%d + %d = %d\n", number1, number2, result);
	}

	// 배열 : 참조타입
	public static void PrintArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}

	// 1) 1차원 배열
	public static void example2() {
		// 배열 선언(주소 저장 공간 생성)
		int[] arr1 = new int[3]; // 명시적으로 heap메모리에 저장공간 생성
		int[] arr2 = { 1, 2, 3 }; // 암시적으로 heap메모리에 저장공간 생성

		PrintArr(arr1);
		PrintArr(arr2);
	}

	public static void PrintArr1(int[][] arr) {
		for (int i = 0; i < arr.length; i++) // 행의 갯수2
		{
			for (int j = 0; j < arr[i].length; j++) // 특정 행의 열의 갯수3,3
			{
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}
		}
	}

	// 2) 2차원 배열
	public static void example3() {
		int[][] arr1 = new int[2][3];
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };

		PrintArr1(arr1);
		PrintArr1(arr2);
	}

	// 2) 2차원 가변 배열(행마다 열의 크기가 다른 배열)
	public static void example4() {
		int[][] arr1 = new int[2][]; // 행만 설정!
		arr1[0] = new int[4]; // 0번째 행의 열의 크기 4
		arr1[1] = new int[2]; // 1번째 행의 열의 크기 2

		int[][] arr2 = { { 1, 2, 3, 4 }, { 5, 6 } };

		PrintArr1(arr1);
		PrintArr1(arr2);
	}

	// [정수 2개]를 입력받아 [합의 결과를 출력]!
	public static void example5() {
		int[] arr = new int[3];

		// 초기화1)대입연산을 이용한 초기화
		arr[0] = 10;

		// 초기화2)사용자 입력 초기화
		System.out.print("정수 입력 : ");
		arr[1] = Integer.parseInt(scan.nextLine());

		// 연산(연산자 들...)
		arr[2] = arr[0] + arr[1];

		System.out.printf("%d + %d = %d\n", arr[0], arr[1], arr[2]);
	}

	public static void main(String[] args) {
		example5();
	}
}
